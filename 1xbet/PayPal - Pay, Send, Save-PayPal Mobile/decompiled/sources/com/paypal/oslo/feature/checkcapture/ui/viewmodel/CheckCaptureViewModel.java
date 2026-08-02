package com.paypal.oslo.feature.checkcapture.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00168\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020$8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010\r\u001a\u00020)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010*"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/ui/viewmodel/CheckCaptureViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/checkcapture/manager/CheckCaptureFeatureManager;", "featureManager", "Lcom/paypal/oslo/feature/checkcapture/domain/usecase/AuthenticateCheckCaptureUserUseCase;", "authenticateUseCase", "<init>", "(Lcom/paypal/oslo/feature/checkcapture/manager/CheckCaptureFeatureManager;Lcom/paypal/oslo/feature/checkcapture/domain/usecase/AuthenticateCheckCaptureUserUseCase;)V", "Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureIntent;", "intent", "", "processIntent", "(Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureIntent;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/checkcapture/manager/CheckCaptureFeatureManager;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/checkcapture/domain/usecase/AuthenticateCheckCaptureUserUseCase;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureState;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/channels/Channel;", "Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureEffect;", "Lkotlinx/coroutines/channels/Channel;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/Flow;", "effects", "Lkotlinx/coroutines/flow/Flow;", "getEffects", "()Lkotlinx/coroutines/flow/Flow;", "", "flowAttemptId", "Ljava/lang/String;", "getFlowAttemptId", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CheckCaptureViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState> Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureEffect> effects;
    private final java.lang.String flowAttemptId;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.checkcapture.manager.CheckCaptureFeatureManager getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureEffect> getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.checkcapture.domain.usecase.AuthenticateCheckCaptureUserUseCase getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState> state;

    @javax.inject.Inject
    public CheckCaptureViewModel(com.paypal.oslo.feature.checkcapture.manager.CheckCaptureFeatureManager checkCaptureFeatureManager, com.paypal.oslo.feature.checkcapture.domain.usecase.AuthenticateCheckCaptureUserUseCase authenticateCheckCaptureUserUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkCaptureFeatureManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticateCheckCaptureUserUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = checkCaptureFeatureManager;
        this.getHighSpeedVideoSizes = authenticateCheckCaptureUserUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.Idle.INSTANCE);
        this.Camera2StreamConfigurationMap = MutableStateFlow;
        this.state = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureEffect> Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(-2, null, null, 6, null);
        this.getHighResolutionOutputSizeshNQ4ISI = Channel$default;
        this.effects = kotlinx.coroutines.flow.FlowKt.receiveAsFlow(Channel$default);
        java.lang.String obj = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        this.flowAttemptId = obj;
        this.getHighSpeedVideoFpsRanges = new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext("cash_a_check", obj);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState> getState() {
        return this.state;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureEffect> getEffects() {
        return this.effects;
    }

    public final java.lang.String getFlowAttemptId() {
        return this.flowAttemptId;
    }

    public final void processIntent(com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(intent, com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent.Initialize.INSTANCE)) {
            if (intent instanceof com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent.RetryAuthentication) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel$authenticateUser$1(this, ((com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent.RetryAuthentication) intent).getCurrentRetryCount() + 1, null), 3, null);
                return;
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(intent, com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent.LaunchIngoSDK.INSTANCE)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(intent, com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent.ProceedFromLanding.INSTANCE)) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel$handleProceedFromLanding$1(this, null), 3, null);
                    return;
                } else {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(intent, com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent.PermissionsHandled.INSTANCE)) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel$authenticateUser$1(this, 0, null), 3, null);
                        return;
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState value = this.Camera2StreamConfigurationMap.getValue();
            if (value instanceof com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.Success) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel$handleLaunchIngoSDK$1(this, value, null), 3, null);
                return;
            }
            return;
        }
        if (!this.getHighSpeedVideoFpsRangesFor.isCheckCaptureFeatureEnabled()) {
            this.Camera2StreamConfigurationMap.setValue(new com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.Error(com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType.FEATURE_DISABLED, null, 0, 4, null));
            com.paypal.oslo.feature.checkcapture.analytics.AnalyticsActionsKt.appeared(com.paypal.oslo.feature.checkcapture.analytics.CheckCaptureAnalytics.INSTANCE.createErrorScreenAppearedEvent(com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType.FEATURE_DISABLED, this.getHighSpeedVideoFpsRanges));
        } else {
            this.Camera2StreamConfigurationMap.setValue(com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.ShowLandingScreen.INSTANCE);
            com.paypal.oslo.feature.checkcapture.analytics.AnalyticsActionsKt.appeared(com.paypal.oslo.feature.checkcapture.analytics.CheckCaptureAnalytics.INSTANCE.createLandingScreenAppearedEvent(this.getHighSpeedVideoFpsRanges));
        }
    }
}
