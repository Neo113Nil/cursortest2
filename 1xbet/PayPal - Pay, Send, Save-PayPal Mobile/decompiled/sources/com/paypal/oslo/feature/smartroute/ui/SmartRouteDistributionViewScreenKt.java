package com.paypal.oslo.feature.smartroute.ui;

@kotlin.Metadata(d1 = {"\u0000\u0092\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001ap\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\u000b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00050\u000b2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00050\u000bH\u0000\u001a\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0000\u001a+\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u000bH\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u001cH\u0000\u001a+\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u000bH\u0003¢\u0006\u0004\b\u001f\u0010\u001a\u001a/\u0010 \u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0016\u001a\u00020\u0017H\u0003¢\u0006\u0004\b%\u0010&\u001a\u001b\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050(2\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010)\u001a\u001d\u0010*\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0001¢\u0006\u0002\u0010+\u001a©\u0001\u0010,\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050(26\u0010/\u001a2\u0012\u0013\u0012\u00110\f¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(3\u0012\u0013\u0012\u001104¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(5\u0012\u0004\u0012\u00020\u0005002\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\u000b2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00050(2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00050(2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00050(2\u000e\b\u0002\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00050(H\u0007¢\u0006\u0002\u0010;\u001a#\u0010<\u001a\u00020\u00052\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050(2\u0006\u0010=\u001a\u00020\fH\u0007¢\u0006\u0002\u0010>\u001a\r\u0010?\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010@\u001a9\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00050(2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u0017H\u0000¢\u0006\u0004\bB\u0010C\u001a;\u0010D\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020-2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u0017H\u0001¢\u0006\u0004\bE\u0010F\u001a;\u0010G\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020-2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u0017H\u0003¢\u0006\u0004\bH\u0010F\u001a1\u0010I\u001a\u00020\u00052\u0006\u0010J\u001a\u00020K2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00050(2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050(H\u0003¢\u0006\u0002\u0010M\u001a\u001f\u0010N\u001a\u0004\u0018\u00010O2\u0006\u0010P\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¢\u0006\u0002\u0010Q\u001a)\u0010R\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020\u00050\u000bH\u0003¢\u0006\u0002\u0010S¨\u0006T²\u0006\n\u0010\u0002\u001a\u00020\u0003X\u008a\u0084\u0002²\u0006\n\u0010U\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\f\u0010V\u001a\u0004\u0018\u00010\fX\u008a\u008e\u0002²\u0006\f\u0010W\u001a\u0004\u0018\u00010\fX\u008a\u008e\u0002²\u0006\f\u0010X\u001a\u0004\u0018\u00010\fX\u008a\u008e\u0002²\u0006\n\u0010Y\u001a\u00020\u0003X\u008a\u0084\u0002"}, d2 = {"createNavigationResult", "Lcom/paypal/oslo/feature/smartroute/api/navigation/result/SmartRouteNavResult;", "state", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionState;", "handleToastEffect", "", "effect", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEffect;", "context", "Landroid/content/Context;", "setToastMessage", "Lkotlin/Function1;", "", "setShowToast", "", "setToastModule", "setToastAction", "handleAutoReloadResult", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent;", "result", "Lcom/paypal/oslo/feature/balance/api/navigation/result/AutoReloadFlowNavResult;", "AutoReloadResultHandler", "autoReloadRequestId", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "onEvent", "AutoReloadResultHandler-uLJ83ew", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "handleSavingsOnboardingResult", "Lcom/paypal/oslo/feature/savings/api/navigation/result/SavingsOnBoardingNavResult;", "SavingsOnboardingResultHandler", "savingsOnboardingRequestId", "SavingsOnboardingResultHandler-uLJ83ew", "DistributionStateContent", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/smartroute/ui/viewmodel/DistributionViewModel;", "DistributionStateContent-VvArgOE", "(Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionState;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/smartroute/ui/viewmodel/DistributionViewModel;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "handleNavigateBackWithResult", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionState;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "SmartRouteDistributionViewScreen", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/smartroute/ui/viewmodel/DistributionViewModel;Landroidx/compose/runtime/Composer;I)V", "SmartRouteDistributionScreen", "Lcom/paypal/oslo/feature/smartroute/ui/model/DistributionScreenState;", "onNavigateBack", "onSliderChange", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "accountId", "", "percentage", "onAutoReloadToggle", "onAutoReloadInfoClick", "onAutoReloadSettingsClick", "onPrimaryButtonClick", "onCancelClick", "(Lcom/paypal/oslo/feature/smartroute/ui/model/DistributionScreenState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "CustomTopBar", "backButtonContentDescription", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "LoadingContent", "(Landroidx/compose/runtime/Composer;I)V", "handleSavingsOnboardingModalContinue", "handleSavingsOnboardingModalContinue-vFXjZRc", "(Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;)Lkotlin/jvm/functions/Function0;", "SavingsOnboardingModalIfNeeded", "SavingsOnboardingModalIfNeeded-VvArgOE", "(Lcom/paypal/oslo/feature/smartroute/ui/model/DistributionScreenState;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "DistributionModals", "DistributionModals-VvArgOE", "ErrorContent", "errorType", "Lcom/paypal/oslo/feature/smartroute/ui/error/SmartRouteErrorType;", "onRetry", "(Lcom/paypal/oslo/feature/smartroute/ui/error/SmartRouteErrorType;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "shouldRetryOnResume", "", "isFirstResume", "(ZLcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionState;)Ljava/lang/Integer;", "RetryOnResumeHandler", "(Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "smart-route_prodRelease", "showToast", "toastMessage", "toastModule", "toastAction", "latestState"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SmartRouteDistributionViewScreenKt {
    public static final com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult createNavigationResult(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState distributionState) {
        com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState screenState;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distributionState, "");
        com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content content = distributionState instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content ? (com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content) distributionState : null;
        if (content != null && (screenState = content.getScreenState()) != null && screenState.getHasSuccessfulUpdate()) {
            return new com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.Updated(content.getScreenState().getSavedConfiguration().getStatus(), content.getScreenState().getSavedConfiguration().getSavingsPercentage(), content.getScreenState().getSavedConfiguration().getCryptoPercentage(), content.getScreenState().getSavedConfiguration().getVersion());
        }
        return com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.Cancelled.INSTANCE;
    }

    public static /* synthetic */ void handleToastEffect$default(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect distributionEffect, android.content.Context context, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function1 function14, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            function13 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit unit;
                    unit = kotlin.Unit.INSTANCE;
                    return unit;
                }
            };
        }
        kotlin.jvm.functions.Function1 function15 = function13;
        if ((i & 32) != 0) {
            function14 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit unit;
                    unit = kotlin.Unit.INSTANCE;
                    return unit;
                }
            };
        }
        handleToastEffect(distributionEffect, context, function1, function12, function15, function14);
    }

    private static final void Camera2StreamConfigurationMap(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function14, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        function1.invoke(str);
        function12.invoke(str2);
        function13.invoke(str3);
        function14.invoke(java.lang.Boolean.TRUE);
        if (str2 == null || str3 == null) {
            return;
        }
        com.paypal.oslo.feature.smartroute.analytics.SmartRouteScreenTrackerKt.trackSmartRouteModule(str2, str3);
    }

    public static final void handleToastEffect(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect distributionEffect, android.content.Context context, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function14) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distributionEffect, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function13, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function14, "");
        if (!(distributionEffect instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowValidationError)) {
            if (distributionEffect instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowSmartRouteActivated) {
                java.lang.String string = context.getString(com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_toast_activated);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                Camera2StreamConfigurationMap(function1, function13, function14, function12, string, com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Module.SETUP_SUCCESS, com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Action.SETUP_SUCCESS);
                return;
            }
            if (distributionEffect instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowSettingsSaved) {
                java.lang.String string2 = context.getString(com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_toast_saved);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
                Camera2StreamConfigurationMap(function1, function13, function14, function12, string2, com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Module.SETUP_SUCCESS, com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Action.SETUP_SUCCESS);
                return;
            }
            if (distributionEffect instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowSmartRouteTurnedOff) {
                java.lang.String string3 = context.getString(com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_toast_turned_off);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
                Camera2StreamConfigurationMap(function1, function13, function14, function12, string3, com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Module.TURN_OFF_SUCCESS, com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Action.TURN_OFF_SUCCESS);
                return;
            }
            if (distributionEffect instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowSmartRouteTurnedOffWithAutoReload) {
                java.lang.String string4 = context.getString(com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_toast_turned_off_with_autoreload);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "");
                Camera2StreamConfigurationMap(function1, function13, function14, function12, string4, com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Module.TURN_OFF_SUCCESS, com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Action.TURN_OFF_SUCCESS);
                return;
            }
            if (distributionEffect instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowTurnOffFailed) {
                java.lang.String string5 = context.getString(com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_turn_off_failed);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "");
                Camera2StreamConfigurationMap(function1, function13, function14, function12, string5, null, null);
                return;
            } else if (distributionEffect instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowPyusdOptInSuccess) {
                java.lang.String string6 = context.getString(com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_pyusd_rewards_opt_in_success_toast, ((com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowPyusdOptInSuccess) distributionEffect).getApyRate());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string6, "");
                Camera2StreamConfigurationMap(function1, function13, function14, function12, string6, null, null);
                return;
            } else {
                if (!(distributionEffect instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowPyusdOptInError)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                java.lang.String string7 = context.getString(com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_pyusd_opt_in_error);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "");
                Camera2StreamConfigurationMap(function1, function13, function14, function12, string7, null, null);
                return;
            }
        }
        Camera2StreamConfigurationMap(function1, function13, function14, function12, ((com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect.ShowValidationError) distributionEffect).getMessage(), null, null);
    }

    public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent handleAutoReloadResult(com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult autoReloadFlowNavResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadFlowNavResult, "");
        com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings transferSettings = autoReloadFlowNavResult.getTransferSettings();
        if ((transferSettings instanceof com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.LowBalanceReload) || (transferSettings instanceof com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.ScheduledReload)) {
            return com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.RefreshAutoReload.INSTANCE;
        }
        if ((transferSettings instanceof com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.Cancelled) || (transferSettings instanceof com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.Dismissed)) {
            return null;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    private static final void Camera2StreamConfigurationMap(final java.lang.String str, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2140970106);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2140970106, i2, -1, "com.paypal.oslo.feature.smartroute.ui.AutoReloadResultHandler (SmartRouteDistributionViewScreen.kt:189)");
            }
            boolean z = (i2 & 112) == 32;
            com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$AutoReloadResultHandler$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$AutoReloadResultHandler$1$1(function1, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$AutoReloadResultHandleruLJ83ew$$inlined$NavResultEffectrtGRyWw$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$AutoReloadResultHandler-uLJ83ew$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m19724invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m19724invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str2) {
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
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.$r8$lambda$9OwgRAPEOPSfREjGRJj0_f6damU(str, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent handleSavingsOnboardingResult(com.paypal.oslo.feature.savings.api.navigation.result.SavingsOnBoardingNavResult savingsOnBoardingNavResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsOnBoardingNavResult, "");
        if (savingsOnBoardingNavResult instanceof com.paypal.oslo.feature.savings.api.navigation.result.SavingsOnBoardingNavResult.Success) {
            return com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.Initialize.INSTANCE;
        }
        if (savingsOnBoardingNavResult instanceof com.paypal.oslo.feature.savings.api.navigation.result.SavingsOnBoardingNavResult.InReview) {
            return com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.Initialize.INSTANCE;
        }
        if ((savingsOnBoardingNavResult instanceof com.paypal.oslo.feature.savings.api.navigation.result.SavingsOnBoardingNavResult.Error) || (savingsOnBoardingNavResult instanceof com.paypal.oslo.feature.savings.api.navigation.result.SavingsOnBoardingNavResult.Cancelled)) {
            return null;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    private static final void getHighSpeedVideoFpsRanges(final java.lang.String str, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-769243670);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-769243670, i2, -1, "com.paypal.oslo.feature.smartroute.ui.SavingsOnboardingResultHandler (SmartRouteDistributionViewScreen.kt:246)");
            }
            boolean z = (i2 & 112) == 32;
            com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SavingsOnboardingResultHandler$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SavingsOnboardingResultHandler$1$1(function1, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SavingsOnboardingResultHandleruLJ83ew$$inlined$NavResultEffectrtGRyWw$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SavingsOnboardingResultHandler-uLJ83ew$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m19725invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m19725invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str2) {
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
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.$r8$lambda$Tnkgu7REqV__2glPXKyo_7E1DxU(str, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0292  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRanges(final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState distributionState, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel, final java.lang.String str, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(467709649);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(distributionState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(distributionViewModel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(str) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(467709649, i2, -1, "com.paypal.oslo.feature.smartroute.ui.DistributionStateContent (SmartRouteDistributionViewScreen.kt:261)");
            }
            if (distributionState instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Initial) {
                startRestartGroup.startReplaceGroup(664486224);
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
                startRestartGroup.endNode();
                startRestartGroup.endReplaceGroup();
            } else if (distributionState instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Loading) {
                startRestartGroup.startReplaceGroup(664805865);
                getHighSpeedVideoSizes(startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                if (distributionState instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content) {
                    startRestartGroup.startReplaceGroup(664947597);
                    com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content content = (com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content) distributionState;
                    com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState screenState = content.getScreenState();
                    boolean hasUnsavedChanges = content.getScreenState().getHasUnsavedChanges();
                    boolean changedInstance = startRestartGroup.changedInstance(distributionViewModel);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.m19707$r8$lambda$eMS3JQX76sX7_PRZAMBRUrUHjU(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    kotlin.jvm.functions.Function0<kotlin.Unit> handleNavigateBack = com.paypal.oslo.feature.smartroute.ui.UnsavedChangesBackHandlerKt.handleNavigateBack(hasUnsavedChanges, (kotlin.jvm.functions.Function0) rememberedValue, handleNavigateBackWithResult(distributionState, startRestartGroup, i2 & 14));
                    boolean changedInstance2 = startRestartGroup.changedInstance(distributionViewModel);
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.m19712$r8$lambda$DB6Xrd2AGzEY5tvFA_f7T5IAjo(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel.this, (java.lang.String) obj, ((java.lang.Float) obj2).floatValue());
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue2;
                    boolean changedInstance3 = startRestartGroup.changedInstance(distributionViewModel);
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda22
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.$r8$lambda$IUf2n1v2JpD39gPxcdCIZBEFg9w(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel.this, ((java.lang.Boolean) obj).booleanValue());
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue3;
                    boolean changedInstance4 = startRestartGroup.changedInstance(distributionViewModel);
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (changedInstance4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda33
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.$r8$lambda$E65I0Lug7jmpKz1fGl7z8jkPCf4(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue4;
                    boolean changedInstance5 = startRestartGroup.changedInstance(distributionViewModel);
                    boolean z = (i2 & 112) == 32;
                    boolean z2 = (i2 & 7168) == 2048;
                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if ((z | changedInstance5 | z2) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda42
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.$r8$lambda$YJaOCcaUnztgKUcmfd5gfEGdmrc(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel.this, appNavigator, str);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue5;
                    boolean changedInstance6 = startRestartGroup.changedInstance(distributionViewModel);
                    java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                    if (changedInstance6 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda43
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.m19714$r8$lambda$PrJO1AW6up45Osl0RZEcGmmzE(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue6;
                    boolean changedInstance7 = startRestartGroup.changedInstance(distributionViewModel);
                    java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                    if (changedInstance7 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda44
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.m19708$r8$lambda$2istfUv466UJAleGvyy2H7m1W0(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    composer2 = startRestartGroup;
                    SmartRouteDistributionScreen(screenState, handleNavigateBack, function2, function1, function0, function02, function03, (kotlin.jvm.functions.Function0) rememberedValue7, startRestartGroup, 0, 0);
                    composer2.endReplaceGroup();
                } else {
                    composer2 = startRestartGroup;
                    if (distributionState instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Error) {
                        composer2.startReplaceGroup(666939781);
                        com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType errorType = ((com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Error) distributionState).getErrorType();
                        boolean changedInstance8 = composer2.changedInstance(distributionViewModel);
                        boolean z3 = (i2 & 14) == 4;
                        java.lang.Object rememberedValue8 = composer2.rememberedValue();
                        if ((z3 | changedInstance8) || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda45
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.$r8$lambda$dpVdDCGKqhyDvFQjnlCezNiDj98(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel.this, distributionState);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue8);
                        }
                        kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue8;
                        boolean z4 = (i2 & 112) == 32;
                        java.lang.Object rememberedValue9 = composer2.rememberedValue();
                        if (z4 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda46
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.m19718$r8$lambda$oRSZVT2I6_W2kh8k5IpNy2DJr0(com.paypal.oslo.core.navigation.AppNavigator.this);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue9);
                        }
                        getHighSpeedVideoSizes(errorType, function04, (kotlin.jvm.functions.Function0) rememberedValue9, composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-1502584736);
                        composer2.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            composer2 = startRestartGroup;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda47
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.$r8$lambda$PBcxlwpeviVpSwnIwGBTpLQnFNM(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.this, appNavigator, distributionViewModel, str, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final kotlin.jvm.functions.Function0<kotlin.Unit> handleNavigateBackWithResult(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState distributionState, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distributionState, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-462215686, i, -1, "com.paypal.oslo.feature.smartroute.ui.handleNavigateBackWithResult (SmartRouteDistributionViewScreen.kt:347)");
        }
        final com.paypal.oslo.core.navigation.AppNavigator appNavigator = (com.paypal.oslo.core.navigation.AppNavigator) composer.consume(com.paypal.oslo.core.navigation.ui.LocalAppNavigatorKt.getLocalAppNavigator());
        final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(distributionState, composer, i & 14);
        boolean changed = composer.changed(rememberUpdatedState);
        boolean changed2 = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.$r8$lambda$RnOjOqy072LFr6nRazAxh8qTBsY(androidx.compose.runtime.State.this, appNavigator);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = (kotlin.jvm.functions.Function0) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void SmartRouteDistributionViewScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.MutableState mutableState;
        androidx.compose.runtime.MutableState mutableState2;
        java.lang.Object obj;
        java.lang.String str;
        java.lang.String str2;
        androidx.compose.runtime.MutableState mutableState3;
        int i3;
        androidx.compose.ui.Modifier.Companion companion;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distributionViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2032455809);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(distributionViewModel) ? 32 : 16;
        }
        int i4 = i2;
        if (!startRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2032455809, i4, -1, "com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreen (SmartRouteDistributionViewScreen.kt:362)");
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(distributionViewModel.getState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
            boolean changedInstance = startRestartGroup.changedInstance(distributionViewModel);
            com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SmartRouteDistributionViewScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SmartRouteDistributionViewScreen$1$1(distributionViewModel);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Camera2StreamConfigurationMap(rememberNavResultRequestId, (kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent, kotlin.Unit>) ((kotlin.reflect.KFunction) rememberedValue), startRestartGroup, 0);
            java.lang.String rememberNavResultRequestId2 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
            boolean changedInstance2 = startRestartGroup.changedInstance(distributionViewModel);
            com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SmartRouteDistributionViewScreen$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SmartRouteDistributionViewScreen$2$1(distributionViewModel);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            getHighSpeedVideoFpsRanges(rememberNavResultRequestId2, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue2), startRestartGroup, 0);
            kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState) collectAsStateWithLifecycle.getValue()).getClass());
            boolean changed = startRestartGroup.changed(collectAsStateWithLifecycle);
            com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SmartRouteDistributionViewScreen$3$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SmartRouteDistributionViewScreen$3$1(collectAsStateWithLifecycle, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(orCreateKotlinClass, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 0);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            androidx.compose.runtime.MutableState mutableState4 = (androidx.compose.runtime.MutableState) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            androidx.compose.runtime.MutableState mutableState5 = (androidx.compose.runtime.MutableState) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            androidx.compose.runtime.MutableState mutableState6 = (androidx.compose.runtime.MutableState) rememberedValue6;
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            final androidx.compose.runtime.MutableState mutableState7 = (androidx.compose.runtime.MutableState) rememberedValue7;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance3 = startRestartGroup.changedInstance(distributionViewModel);
            boolean changedInstance4 = startRestartGroup.changedInstance(context);
            com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SmartRouteDistributionViewScreen$4$1 rememberedValue8 = startRestartGroup.rememberedValue();
            if ((changedInstance3 || changedInstance4) || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                mutableState = mutableState4;
                mutableState2 = mutableState5;
                obj = null;
                str = rememberNavResultRequestId2;
                str2 = rememberNavResultRequestId;
                mutableState3 = mutableState6;
                i3 = 1;
                rememberedValue8 = new com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SmartRouteDistributionViewScreen$4$1(distributionViewModel, context, mutableState5, mutableState, mutableState6, mutableState7, null);
                startRestartGroup.updateRememberedValue(rememberedValue8);
            } else {
                mutableState2 = mutableState5;
                mutableState = mutableState4;
                str = rememberNavResultRequestId2;
                str2 = rememberNavResultRequestId;
                mutableState3 = mutableState6;
                i3 = 1;
                obj = null;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue8, startRestartGroup, 6);
            com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState distributionState = (com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState) collectAsStateWithLifecycle.getValue();
            boolean changedInstance5 = startRestartGroup.changedInstance(distributionViewModel);
            java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (changedInstance5 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda30
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.m19716$r8$lambda$hLj3zTpPB42dKLe7gTCqgGJDKU(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel.this, ((java.lang.Integer) obj2).intValue());
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            Camera2StreamConfigurationMap(distributionState, (kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit>) rememberedValue9, startRestartGroup, 0);
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i3, obj);
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
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            composer2 = startRestartGroup;
            getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState) collectAsStateWithLifecycle.getValue(), appNavigator, distributionViewModel, str2, startRestartGroup, (i4 << 3) & 1008);
            composer2.endNode();
            com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState distributionState2 = (com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState) collectAsStateWithLifecycle.getValue();
            if (distributionState2 instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content) {
                composer2.startReplaceGroup(-1554046059);
                com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState screenState = ((com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content) distributionState2).getScreenState();
                boolean changedInstance6 = composer2.changedInstance(distributionViewModel);
                com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SmartRouteDistributionViewScreen$7$1 rememberedValue10 = composer2.rememberedValue();
                if (changedInstance6 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue10 = new com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SmartRouteDistributionViewScreen$7$1(distributionViewModel);
                    composer2.updateRememberedValue(rememberedValue10);
                }
                Camera2StreamConfigurationMap(screenState, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue10), appNavigator, str, composer2, (i4 << 6) & 896);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-1553819263);
                composer2.endReplaceGroup();
            }
            com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState distributionState3 = (com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState) collectAsStateWithLifecycle.getValue();
            boolean changedInstance7 = composer2.changedInstance(distributionViewModel);
            com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SmartRouteDistributionViewScreen$8$1 rememberedValue11 = composer2.rememberedValue();
            if (changedInstance7 || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue11 = new com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SmartRouteDistributionViewScreen$8$1(distributionViewModel);
                composer2.updateRememberedValue(rememberedValue11);
            }
            com.paypal.oslo.feature.smartroute.ui.UnsavedChangesBackHandlerKt.UnsavedChangesBackModalHandler(distributionState3, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue11), handleNavigateBackWithResult((com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState) collectAsStateWithLifecycle.getValue(), composer2, 0), composer2, 0);
            java.lang.String str3 = (java.lang.String) mutableState2.getValue();
            if (str3 == null) {
                composer2.startReplaceGroup(-1553450922);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-1553450921);
                final androidx.compose.runtime.MutableState mutableState8 = mutableState;
                if (((java.lang.Boolean) mutableState8.getValue()).booleanValue()) {
                    composer2.startReplaceGroup(491140323);
                    final androidx.compose.runtime.MutableState mutableState9 = mutableState3;
                    java.lang.String str4 = (java.lang.String) mutableState9.getValue();
                    java.lang.String str5 = (java.lang.String) mutableState7.getValue();
                    if (str4 != null && str5 != null) {
                        companion = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.ui.Modifier.INSTANCE, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("smart_route", "smart_route", str5))), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(str4, 0, null, null, 14, null));
                    } else {
                        companion = androidx.compose.ui.Modifier.INSTANCE;
                    }
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, obj), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 8, null), com.paypal.oslo.feature.smartroute.ui.DistributionTestTags.SCREEN_TOAST);
                    java.lang.Object rememberedValue12 = composer2.rememberedValue();
                    if (rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        final androidx.compose.runtime.MutableState mutableState10 = mutableState2;
                        rememberedValue12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda31
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.$r8$lambda$d6zwCY01xjgJR7NUHghzfKk1p6Q(androidx.compose.runtime.MutableState.this, mutableState10, mutableState9, mutableState7, ((java.lang.Boolean) obj2).booleanValue());
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue12);
                    }
                    com.paypal.pds.components.ToastKt.Toast(str3, testTag, null, (kotlin.jvm.functions.Function1) rememberedValue12, composer2, 3072, 4);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(492428063);
                    composer2.endReplaceGroup();
                }
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                composer2.endReplaceGroup();
                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda32
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.$r8$lambda$qErEpw47Tl1ob1s7ymLDvOXzOpw(com.paypal.oslo.core.navigation.AppNavigator.this, distributionViewModel, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SmartRouteDistributionScreen(final com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState distributionScreenState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Float, kotlin.Unit> function2, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, final kotlin.jvm.functions.Function0<kotlin.Unit> function04, kotlin.jvm.functions.Function0<kotlin.Unit> function05, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        androidx.compose.runtime.Composer composer2;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function07;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function08;
        java.lang.String str;
        kotlin.Pair pair;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distributionScreenState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function04, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(383103424);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(distributionScreenState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function03) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function04) ? 1048576 : 524288;
        }
        int i4 = i2 & 128;
        if (i4 != 0) {
            i3 |= 12582912;
        } else if ((12582912 & i) == 0) {
            function06 = function05;
            i3 |= startRestartGroup.changedInstance(function06) ? 8388608 : 4194304;
            if (startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                function07 = function06;
            } else {
                if (i4 != 0) {
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlin.Unit unit;
                                unit = kotlin.Unit.INSTANCE;
                                return unit;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    function08 = (kotlin.jvm.functions.Function0) rememberedValue;
                } else {
                    function08 = function06;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(383103424, i3, -1, "com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionScreen (SmartRouteDistributionViewScreen.kt:522)");
                }
                final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_back_button_voiceover, startRestartGroup, 0);
                final androidx.compose.foundation.ScrollState rememberScrollState = androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                if (distributionScreenState.getStatus() == com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus.INACTIVE) {
                    str = "setup";
                } else {
                    str = "edit";
                }
                com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("smart_route", "smart_route", str);
                if (distributionScreenState.getStatus() == com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus.INACTIVE) {
                    pair = kotlin.TuplesKt.to(com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Item.INSTANCE.getAGREE_AND_AUTHORIZE_BUTTON(), com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Action.AUTHORIZE);
                } else if (distributionScreenState.getHasUnsavedChanges()) {
                    pair = kotlin.TuplesKt.to(com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Item.INSTANCE.getAGREE_AND_AUTHORIZE_BUTTON(), com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Action.SAVE_EDIT);
                } else {
                    pair = kotlin.TuplesKt.to(com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Item.INSTANCE.getTURN_OFF_BUTTON(), com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Action.INITIATE_TURN_OFF);
                }
                final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item = (com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item) pair.component1();
                final java.lang.String str3 = (java.lang.String) pair.component2();
                if (distributionScreenState.getStatus() == com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus.INACTIVE) {
                    str2 = com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Action.CANCEL_SETUP;
                } else {
                    str2 = com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Action.CANCEL_EDIT;
                }
                final java.lang.String str4 = str2;
                final kotlin.jvm.functions.Function0<kotlin.Unit> function09 = function08;
                composer2 = startRestartGroup;
                com.paypal.pds.components.DockKt.Dock(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.ui.Modifier.INSTANCE, kotlin.collections.CollectionsKt.listOf(userIntentContext)), 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2)), rememberScrollState, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-486981027, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.$r8$lambda$DoJ6OHkGg2w0XVKdorGhX5UkokA(com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState.this, str3, item, function04, function09, str4, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-41443716, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.$r8$lambda$9zLKVTlaW4uUVVefWoLuoafoTT0(androidx.compose.foundation.ScrollState.this, function0, stringResource, distributionScreenState, function2, function1, function02, function03, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, composer2, 54), composer2, 27648, 4);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                function07 = function08;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.$r8$lambda$jwgqA1Q4W8UKHrJp_bmoBhQoxys(com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState.this, function0, function2, function1, function02, function03, function04, function07, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        function06 = function05;
        if (startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void CustomTopBar(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final java.lang.String str, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(104601250);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(104601250, i2, -1, "com.paypal.oslo.feature.smartroute.ui.CustomTopBar (SmartRouteDistributionViewScreen.kt:632)");
            }
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
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
            com.paypal.pds.components.IconButtonKt.IconButton(com.paypal.pds.core.Icon.ArrowLeft.INSTANCE, function0, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.smartroute.ui.DistributionTestTags.SCREEN_BACK_BUTTON), com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, null, str, null, false, false, startRestartGroup, ((i2 << 3) & 112) | 3462 | ((i2 << 12) & 458752), 464);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda40
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.$r8$lambda$Iz2InefI9l_84BihAzy0DlLI2WU(kotlin.jvm.functions.Function0.this, str, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoSizes(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-150115473);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-150115473, i, -1, "com.paypal.oslo.feature.smartroute.ui.LoadingContent (SmartRouteDistributionViewScreen.kt:649)");
            }
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            com.paypal.pds.components.LoaderKt.Loader(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.smartroute.ui.DistributionTestTags.SCREEN_LOADING_SPINNER), com.paypal.pds.components.LoaderSize.Large.INSTANCE, null, null, startRestartGroup, (com.paypal.pds.components.LoaderSize.Large.$stable << 3) | 6, 12);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.$r8$lambda$9sndRXKgyK081MfzPytldTRb48A(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: handleSavingsOnboardingModalContinue-vFXjZRc, reason: not valid java name */
    public static final kotlin.jvm.functions.Function0<kotlin.Unit> m19723handleSavingsOnboardingModalContinuevFXjZRc(final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent, kotlin.Unit> function1, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.$r8$lambda$1Hz3ivzCKMerY0euiRq8lDl5YhU(kotlin.jvm.functions.Function1.this, appNavigator, str);
            }
        };
    }

    /* renamed from: SavingsOnboardingModalIfNeeded-VvArgOE, reason: not valid java name */
    public static final void m19722SavingsOnboardingModalIfNeededVvArgOE(final com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState distributionScreenState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent, kotlin.Unit> function1, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distributionScreenState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2086083845);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(distributionScreenState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(str) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2086083845, i2, -1, "com.paypal.oslo.feature.smartroute.ui.SavingsOnboardingModalIfNeeded (SmartRouteDistributionViewScreen.kt:708)");
            }
            if (!distributionScreenState.getShowSavingsOnboardingSheet()) {
                startRestartGroup.startReplaceGroup(-1651887267);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1652682975);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.pds.components.BottomSheetController();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController);
                com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SavingsOnboardingModalIfNeeded$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SavingsOnboardingModalIfNeeded$1$1(bottomSheetController, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                kotlin.jvm.functions.Function0<kotlin.Unit> m19723handleSavingsOnboardingModalContinuevFXjZRc = m19723handleSavingsOnboardingModalContinuevFXjZRc(function1, appNavigator, str);
                boolean z = (i2 & 112) == 32;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda36
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.m19720$r8$lambda$tleEadpNLUe9T8OAIjT5kpSLDE(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                com.paypal.oslo.feature.smartroute.ui.SavingsOnboardingHalfSheetKt.SavingsOnboardingHalfSheet(bottomSheetController, m19723handleSavingsOnboardingModalContinuevFXjZRc, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda37
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.$r8$lambda$NsCLjf3XP439x36mo07cA7es_qw(com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState.this, function1, appNavigator, str, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState distributionScreenState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent, kotlin.Unit> function1, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        int i3;
        kotlin.coroutines.Continuation continuation;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2006246748);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(distributionScreenState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(str) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2006246748, i2, -1, "com.paypal.oslo.feature.smartroute.ui.DistributionModals (SmartRouteDistributionViewScreen.kt:751)");
            }
            if (!distributionScreenState.getShowTurnOffDialog()) {
                i3 = 6;
                continuation = null;
                startRestartGroup.startReplaceGroup(668994622);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(668295975);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.pds.components.BottomSheetController();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$DistributionModals$1$1(bottomSheetController, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                boolean isSaving = distributionScreenState.isSaving();
                int i4 = i2 & 112;
                boolean z = i4 == 32;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.m19710$r8$lambda$549b6PO7anEgYufgEZDCfcy0AQ(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
                boolean z2 = i4 == 32;
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.$r8$lambda$072gUpjtUTwr5sXMcskBzxgGWxo(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                i3 = 6;
                continuation = null;
                com.paypal.oslo.feature.smartroute.ui.DistributionComponentsKt.TurnOffConfirmationModal(bottomSheetController, isSaving, function0, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable, 0);
                startRestartGroup.endReplaceGroup();
            }
            if (!distributionScreenState.getShowAutoReloadInfoDialog()) {
                startRestartGroup.startReplaceGroup(669773342);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(669088149);
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new com.paypal.pds.components.BottomSheetController();
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                com.paypal.pds.components.BottomSheetController bottomSheetController2 = (com.paypal.pds.components.BottomSheetController) rememberedValue5;
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                boolean changedInstance2 = startRestartGroup.changedInstance(bottomSheetController2);
                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$DistributionModals$4$1(bottomSheetController2, continuation);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, startRestartGroup, i3);
                java.lang.String reloadAmount = distributionScreenState.getAutoReload().getReloadAmount();
                java.lang.String thresholdAmount = distributionScreenState.getAutoReload().getThresholdAmount();
                boolean z3 = (i2 & 112) == 32;
                java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                if (z3 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.m19715$r8$lambda$fkWclpXQf3KXBNWW0g4ZbdtGUI(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                com.paypal.oslo.feature.smartroute.ui.AutoReloadInfoModalKt.AutoReloadInfoModal(bottomSheetController2, reloadAmount, thresholdAmount, (kotlin.jvm.functions.Function0) rememberedValue7, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable);
                startRestartGroup.endReplaceGroup();
            }
            if (!distributionScreenState.getShowSaveErrorDialog()) {
                startRestartGroup.startReplaceGroup(670620510);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(669858437);
                java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = new com.paypal.pds.components.BottomSheetController();
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                com.paypal.pds.components.BottomSheetController bottomSheetController3 = (com.paypal.pds.components.BottomSheetController) rememberedValue8;
                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                boolean changedInstance3 = startRestartGroup.changedInstance(bottomSheetController3);
                java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
                if (changedInstance3 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue9 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$DistributionModals$6$1(bottomSheetController3, continuation);
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit3, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue9, startRestartGroup, i3);
                boolean canRetrySave = distributionScreenState.getCanRetrySave();
                boolean z4 = (i2 & 14) == 4;
                int i5 = i2 & 112;
                boolean z5 = i5 == 32;
                java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
                if ((z4 | z5) || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue10 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.$r8$lambda$rhZ3Dmcumx00BgkbFS3XKiqDT6Y(com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState.this, function1);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue10);
                }
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue10;
                boolean z6 = i5 == 32;
                java.lang.Object rememberedValue11 = startRestartGroup.rememberedValue();
                if (z6 || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue11 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.$r8$lambda$xSWrBmLI17ABfFMc4pAdxidbGSE(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue11);
                }
                com.paypal.oslo.feature.smartroute.ui.SaveErrorModalKt.SaveErrorModal(bottomSheetController3, canRetrySave, function02, (kotlin.jvm.functions.Function0) rememberedValue11, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable, 0);
                startRestartGroup.endReplaceGroup();
            }
            if (!distributionScreenState.getShowPyusdOptOutConfirmationModal()) {
                startRestartGroup.startReplaceGroup(671601598);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(670737659);
                java.lang.Object rememberedValue12 = startRestartGroup.rememberedValue();
                if (rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue12 = new com.paypal.pds.components.BottomSheetController();
                    startRestartGroup.updateRememberedValue(rememberedValue12);
                }
                final com.paypal.pds.components.BottomSheetController bottomSheetController4 = (com.paypal.pds.components.BottomSheetController) rememberedValue12;
                kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                boolean changedInstance4 = startRestartGroup.changedInstance(bottomSheetController4);
                java.lang.Object rememberedValue13 = startRestartGroup.rememberedValue();
                if (changedInstance4 || rememberedValue13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue13 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$DistributionModals$9$1(bottomSheetController4, continuation);
                    startRestartGroup.updateRememberedValue(rememberedValue13);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit4, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue13, startRestartGroup, i3);
                boolean changedInstance5 = startRestartGroup.changedInstance(bottomSheetController4);
                int i6 = i2 & 112;
                boolean z7 = i6 == 32;
                java.lang.Object rememberedValue14 = startRestartGroup.rememberedValue();
                if ((changedInstance5 | z7) || rememberedValue14 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue14 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.$r8$lambda$VQL5r2fzpZjbVMILFEVHPy8NOVU(com.paypal.pds.components.BottomSheetController.this, function1);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue14);
                }
                kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue14;
                boolean z8 = i6 == 32;
                java.lang.Object rememberedValue15 = startRestartGroup.rememberedValue();
                if (z8 || rememberedValue15 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue15 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda18
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.$r8$lambda$vtOesa3axhUlxtN44XwNEt0oXHs(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue15);
                }
                kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue15;
                boolean z9 = i6 == 32;
                java.lang.Object rememberedValue16 = startRestartGroup.rememberedValue();
                if (z9 || rememberedValue16 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue16 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.m19709$r8$lambda$3qJavKM1VCKz4SJz60YfyjSia8(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue16);
                }
                com.paypal.oslo.feature.smartroute.ui.PyusdOptOutConfirmationModalKt.PyusdOptOutConfirmationModal(bottomSheetController4, function03, function04, (kotlin.jvm.functions.Function0) rememberedValue16, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable, 0);
                startRestartGroup.endReplaceGroup();
            }
            if (!distributionScreenState.getShowPyusdOptInModal()) {
                startRestartGroup.startReplaceGroup(672627326);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(671694195);
                java.lang.Object rememberedValue17 = startRestartGroup.rememberedValue();
                if (rememberedValue17 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue17 = new com.paypal.pds.components.BottomSheetController();
                    startRestartGroup.updateRememberedValue(rememberedValue17);
                }
                final com.paypal.pds.components.BottomSheetController bottomSheetController5 = (com.paypal.pds.components.BottomSheetController) rememberedValue17;
                kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                boolean changedInstance6 = startRestartGroup.changedInstance(bottomSheetController5);
                java.lang.Object rememberedValue18 = startRestartGroup.rememberedValue();
                if (changedInstance6 || rememberedValue18 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue18 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$DistributionModals$13$1(bottomSheetController5, continuation);
                    startRestartGroup.updateRememberedValue(rememberedValue18);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit5, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue18, startRestartGroup, i3);
                java.lang.String pyusdRewardPercentage = distributionScreenState.getPyusdRewardPercentage();
                boolean isPyusdOptInLoading = distributionScreenState.isPyusdOptInLoading();
                int i7 = i2 & 112;
                boolean z10 = i7 == 32;
                java.lang.Object rememberedValue19 = startRestartGroup.rememberedValue();
                if (z10 || rememberedValue19 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue19 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda20
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.$r8$lambda$sjPYs88hXVz8S0mvcrcE8DHshyU(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue19);
                }
                kotlin.jvm.functions.Function0 function05 = (kotlin.jvm.functions.Function0) rememberedValue19;
                boolean changedInstance7 = startRestartGroup.changedInstance(bottomSheetController5);
                boolean z11 = i7 == 32;
                java.lang.Object rememberedValue20 = startRestartGroup.rememberedValue();
                if ((changedInstance7 | z11) || rememberedValue20 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue20 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda21
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.m19711$r8$lambda$CeAPSTnplTcq3GXvGeqSVwWC9E(com.paypal.pds.components.BottomSheetController.this, function1);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue20);
                }
                kotlin.jvm.functions.Function0 function06 = (kotlin.jvm.functions.Function0) rememberedValue20;
                boolean z12 = i7 == 32;
                java.lang.Object rememberedValue21 = startRestartGroup.rememberedValue();
                if (z12 || rememberedValue21 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue21 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.m19719$r8$lambda$r_DaaFaQIKz12WLhvbz1tjLLlM(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue21);
                }
                com.paypal.oslo.feature.smartroute.ui.PYUsdOptInModalKt.PYUsdOptInModal(bottomSheetController5, pyusdRewardPercentage, isPyusdOptInLoading, function05, function06, (kotlin.jvm.functions.Function0) rememberedValue21, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable);
                startRestartGroup.endReplaceGroup();
            }
            composer2 = startRestartGroup;
            m19722SavingsOnboardingModalIfNeededVvArgOE(distributionScreenState, function1, appNavigator, str, startRestartGroup, i2 & 8190);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.$r8$lambda$F_a1E9vh20CRF9wWNkbkZzfuAEE(com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState.this, function1, appNavigator, str, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoSizes(final com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType smartRouteErrorType, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(734270147);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(smartRouteErrorType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(734270147, i2, -1, "com.paypal.oslo.feature.smartroute.ui.ErrorContent (SmartRouteDistributionViewScreen.kt:893)");
            }
            int i3 = com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.WhenMappings.$EnumSwitchMapping$0[smartRouteErrorType.ordinal()];
            if (i3 == 1 || i3 == 2) {
                function03 = function0;
            } else {
                if (i3 != 3 && i3 != 4) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                function03 = function02;
            }
            com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorComponentKt.SmartRouteErrorComponent(smartRouteErrorType, function03, function02, androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null)), false, startRestartGroup, i2 & 910, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda39
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.$r8$lambda$026BhGQwqobfYVg_9yin_fo9FLc(com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType.this, function0, function02, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final java.lang.Integer shouldRetryOnResume(boolean z, com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState distributionState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distributionState, "");
        if (!z && (distributionState instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Error)) {
            com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Error error = (com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Error) distributionState;
            if (error.getCanRetry()) {
                return java.lang.Integer.valueOf(error.getRetryCount());
            }
        }
        return null;
    }

    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState distributionState, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-768189240);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(distributionState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-768189240, i2, -1, "com.paypal.oslo.feature.smartroute.ui.RetryOnResumeHandler (SmartRouteDistributionViewScreen.kt:944)");
            }
            final androidx.view.LifecycleOwner lifecycleOwner = (androidx.view.LifecycleOwner) startRestartGroup.consume(androidx.view.compose.LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            java.lang.Object[] objArr = new java.lang.Object[0];
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        androidx.compose.runtime.MutableState mutableStateOf$default;
                        mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);
                        return mutableStateOf$default;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 48);
            final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(distributionState, startRestartGroup, i2 & 14);
            final androidx.compose.runtime.State rememberUpdatedState2 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function1, startRestartGroup, (i2 >> 3) & 14);
            boolean changed = startRestartGroup.changed(mutableState);
            boolean changed2 = startRestartGroup.changed(rememberUpdatedState);
            boolean changed3 = startRestartGroup.changed(rememberUpdatedState2);
            boolean changedInstance = startRestartGroup.changedInstance(lifecycleOwner);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changed | changed2 | changed3 | changedInstance) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.$r8$lambda$Pj5MjZPNxihS8y2lMoNpEN8mUiQ(androidx.view.LifecycleOwner.this, mutableState, rememberUpdatedState, rememberUpdatedState2, (androidx.compose.runtime.DisposableEffectScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.DisposableEffect(lifecycleOwner, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue2, startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.$r8$lambda$sW8wLy1r5JSWtEuH7vCEMqaepO0(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.this, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-eMS3JQX76sX7_PRZAMBRUrUHjU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19707$r8$lambda$eMS3JQX76sX7_PRZAMBRUrUHjU(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel) {
        distributionViewModel.onEvent(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.BackClickedWithUnsavedChanges.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$026BhGQwqobfYVg_9yin_fo9FLc(com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType smartRouteErrorType, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(smartRouteErrorType, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$072gUpjtUTwr5sXMcskBzxgGWxo(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.TurnOffDialogDismissed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1Hz3ivzCKMerY0euiRq8lDl5YhU(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str) {
        function1.invoke(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.SavingsOnboardingContinueClicked.INSTANCE);
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.api.navigation.result.SavingsOnBoardingNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.$r8$lambda$BsRJnYBFjYgHkreNidtgxZjTiSU(str, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$2istfUv466UJAleGvyy2H7-m1W0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19708$r8$lambda$2istfUv466UJAleGvyy2H7m1W0(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel) {
        distributionViewModel.onEvent(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.CancelClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$3qJavKM1VCKz4SJz60Yfy-jSia8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19709$r8$lambda$3qJavKM1VCKz4SJz60YfyjSia8(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.PyusdOptOutConfirmationDismissed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void $r8$lambda$40oe0DBnqraDbqNnNg5R0jNdyYM(androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.State state, androidx.compose.runtime.State state2, androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event == androidx.lifecycle.Lifecycle.Event.ON_RESUME) {
            java.lang.Integer shouldRetryOnResume = shouldRetryOnResume(((java.lang.Boolean) mutableState.getValue()).booleanValue(), (com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState) state.getValue());
            if (((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                mutableState.setValue(java.lang.Boolean.FALSE);
            }
            if (shouldRetryOnResume != null) {
                ((kotlin.jvm.functions.Function1) state2.getValue()).invoke(java.lang.Integer.valueOf(shouldRetryOnResume.intValue()));
            }
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4T49qbU9tQDT5smEneV_yBqSgyc(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.balance.api.navigation.AutoReloadDestination("smart_route", "LOW_BALANCE_RELOAD", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$549b6PO7a-nEgYufgEZDCfcy0AQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19710$r8$lambda$549b6PO7anEgYufgEZDCfcy0AQ(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.TurnOffConfirmed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9OwgRAPEOPSfREjGRJj0_f6damU(java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(str, (kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent, kotlin.Unit>) function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9sndRXKgyK081MfzPytldTRb48A(int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9zLKVTlaW4uUVVefWoLuoafoTT0(androidx.compose.foundation.ScrollState scrollState, kotlin.jvm.functions.Function0 function0, java.lang.String str, com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState distributionScreenState, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-41443716, i, -1, "com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionScreen.<anonymous> (SmartRouteDistributionViewScreen.kt:606)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), scrollState, false, null, false, 14, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), com.paypal.oslo.feature.smartroute.ui.DistributionTestTags.SCREEN_SCROLLABLE_CONTENT);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, testTag);
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
            CustomTopBar(function0, str, composer, 0);
            com.paypal.oslo.feature.smartroute.ui.DistributionComponentsKt.SmartRouteDistributionContent(distributionScreenState, function2, function1, function02, function03, null, composer, 0, 32);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BsRJnYBFjYgHkreNidtgxZjTiSU(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.savings.api.navigation.SavingsOnBoardingDestination("smart_route_distribution", com.paypal.oslo.feature.savings.api.navigation.SavingsOnBoardingFlowType.SAVINGS_ONBOARDING_EMBEDDED, str));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$CeAPSTnplTcq3GXv-GeqSVwWC9E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19711$r8$lambda$CeAPSTnplTcq3GXvGeqSVwWC9E(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function1 function1) {
        bottomSheetController.hideSheet();
        function1.invoke(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.PyusdOptOutMaybeLaterClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$DB6Xrd2AGzEY5tvFA_-f7T5IAjo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19712$r8$lambda$DB6Xrd2AGzEY5tvFA_f7T5IAjo(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel, java.lang.String str, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        distributionViewModel.onEvent(new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.SliderChanged(str, f));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DoJ6OHkGg2w0XVKdorGhX5UkokA(com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState distributionScreenState, java.lang.String str, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, java.lang.String str2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-486981027, i, -1, "com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionScreen.<anonymous> (SmartRouteDistributionViewScreen.kt:565)");
            }
            com.paypal.oslo.feature.smartroute.ui.DistributionComponentsKt.PrimaryButton(androidx.compose.ui.res.StringResources_androidKt.stringResource(distributionScreenState.getPrimaryButtonTextRes(), composer, 0), distributionScreenState.isAgreeButtonEnabled(), function0, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("smart_route", "smart_route", str))), item), distributionScreenState.isSaving(), distributionScreenState.getPrimaryButtonStyle(), composer, 0, 0);
            if (distributionScreenState.getShowCancelButton()) {
                composer.startReplaceGroup(748630034);
                com.paypal.oslo.feature.smartroute.ui.DistributionComponentsKt.TertiaryButton(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_distribution_cta_cancel, composer, 0), !distributionScreenState.isSaving(), function02, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("smart_route", "smart_route", str2))), com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Item.INSTANCE.getCANCEL_BUTTON()), composer, 0, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(749447845);
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$E65I0Lug7jmpKz1fGl7z8jkPCf4(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel) {
        distributionViewModel.onEvent(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.AutoReloadInfoClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$F_a1E9vh20CRF9wWNkbkZzfuAEE(com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState distributionScreenState, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(distributionScreenState, function1, appNavigator, str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IUf2n1v2JpD39gPxcdCIZBEFg9w(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel, boolean z) {
        distributionViewModel.onEvent(new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.AutoReloadToggled(z));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Iz2InefI9l_84BihAzy0DlLI2WU(kotlin.jvm.functions.Function0 function0, java.lang.String str, int i, androidx.compose.runtime.Composer composer, int i2) {
        CustomTopBar(function0, str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NsCLjf3XP439x36mo07cA7es_qw(com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState distributionScreenState, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, int i, androidx.compose.runtime.Composer composer, int i2) {
        m19722SavingsOnboardingModalIfNeededVvArgOE(distributionScreenState, function1, appNavigator, str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PBcxlwpeviVpSwnIwGBTpLQnFNM(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState distributionState, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel, java.lang.String str, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(distributionState, appNavigator, distributionViewModel, str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$Pj5MjZPNxihS8y2lMoNpEN8mUiQ(final androidx.view.LifecycleOwner lifecycleOwner, final androidx.compose.runtime.MutableState mutableState, final androidx.compose.runtime.State state, final androidx.compose.runtime.State state2, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        final androidx.view.LifecycleEventObserver lifecycleEventObserver = new androidx.view.LifecycleEventObserver() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda41
            @Override // androidx.view.LifecycleEventObserver
            public final void onStateChanged(androidx.view.LifecycleOwner lifecycleOwner2, androidx.lifecycle.Lifecycle.Event event) {
                com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.$r8$lambda$40oe0DBnqraDbqNnNg5R0jNdyYM(androidx.compose.runtime.MutableState.this, state, state2, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$RetryOnResumeHandler$lambda$2$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.view.LifecycleOwner.this.getLifecycle().removeObserver(lifecycleEventObserver);
            }
        };
    }

    /* renamed from: $r8$lambda$PrJO1AW6up45Osl0RZE-cGm-mzE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19714$r8$lambda$PrJO1AW6up45Osl0RZEcGmmzE(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel) {
        distributionViewModel.onEvent(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.PrimaryButtonClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RnOjOqy072LFr6nRazAxh8qTBsY(androidx.compose.runtime.State state, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        final com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult createNavigationResult = createNavigationResult((com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState) state.getValue());
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.$r8$lambda$U1zu1YMUKSG_gPZjF4W807cMauk(com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Tnkgu7REqV__2glPXKyo_7E1DxU(java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(str, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$U1zu1YMUKSG_gPZjF4W807cMauk(com.paypal.oslo.feature.smartroute.api.navigation.result.SmartRouteNavResult smartRouteNavResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(smartRouteNavResult);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VQL5r2fzpZjbVMILFEVHPy8NOVU(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function1 function1) {
        bottomSheetController.hideSheet();
        function1.invoke(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.PyusdOptOutConfirmationConfirmed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YJaOCcaUnztgKUcmfd5gfEGdmrc(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str) {
        distributionViewModel.onEvent(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.AutoReloadSettingsClicked.INSTANCE);
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.$r8$lambda$4T49qbU9tQDT5smEneV_yBqSgyc((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$d6zwCY01xjgJR7NUHghzfKk1p6Q(androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, androidx.compose.runtime.MutableState mutableState3, androidx.compose.runtime.MutableState mutableState4, boolean z) {
        if (!z) {
            mutableState.setValue(java.lang.Boolean.FALSE);
            mutableState2.setValue(null);
            mutableState3.setValue(null);
            mutableState4.setValue(null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dpVdDCGKqhyDvFQjnlCezNiDj98(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel, com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState distributionState) {
        distributionViewModel.onEvent(new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.Retry(((com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Error) distributionState).getRetryCount()));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fkWclpXQf3KXBNWW0-g4ZbdtGUI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19715$r8$lambda$fkWclpXQf3KXBNWW0g4ZbdtGUI(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.AutoReloadInfoDialogDismissed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$hLj3zTpPB42dKLe7gTCqgGJ-DKU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19716$r8$lambda$hLj3zTpPB42dKLe7gTCqgGJDKU(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel, int i) {
        distributionViewModel.onEvent(new com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.Retry(i));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jwgqA1Q4W8UKHrJp_bmoBhQoxys(com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState distributionScreenState, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, kotlin.jvm.functions.Function0 function05, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SmartRouteDistributionScreen(distributionScreenState, function0, function2, function1, function02, function03, function04, function05, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kZTFMc4fhhFCVqW50DPDHAWup64(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$oRSZVT2I6_W2kh8k5IpNy2D-Jr0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19718$r8$lambda$oRSZVT2I6_W2kh8k5IpNy2DJr0(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.$r8$lambda$kZTFMc4fhhFCVqW50DPDHAWup64((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qErEpw47Tl1ob1s7ymLDvOXzOpw(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        SmartRouteDistributionViewScreen(appNavigator, distributionViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$r_DaaFa-QIKz12WLhvbz1tjLLlM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19719$r8$lambda$r_DaaFaQIKz12WLhvbz1tjLLlM(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.PyusdOptInModalDismissed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rhZ3Dmcumx00BgkbFS3XKiqDT6Y(com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState distributionScreenState, kotlin.jvm.functions.Function1 function1) {
        if (distributionScreenState.isAutoReloadFlowError()) {
            function1.invoke(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.SystemEvent.AutoReloadFlowRetryClicked.INSTANCE);
        } else {
            function1.invoke(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.SaveErrorRetryClicked.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sW8wLy1r5JSWtEuH7vCEMqaepO0(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState distributionState, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(distributionState, (kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit>) function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sjPYs88hXVz8S0mvcrcE8DHshyU(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.PyusdOptInButtonClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$tleEadpN-LUe9T8OAIjT5kpSLDE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19720$r8$lambda$tleEadpNLUe9T8OAIjT5kpSLDE(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.SavingsOnboardingDismissed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xSWrBmLI17ABfFMc4pAdxidbGSE(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.SaveErrorDialogDismissed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vtOesa3axhUlxtN44XwNEt0oXHs(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.PyusdOptOutConfirmationCancelled.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState access$SmartRouteDistributionViewScreen$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState) state.getValue();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType.values().length];
            try {
                iArr[com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType.RETRY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType.NO_NETWORK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType.FATAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.smartroute.ui.error.SmartRouteErrorType.FEATURE_UNAVAILABLE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
