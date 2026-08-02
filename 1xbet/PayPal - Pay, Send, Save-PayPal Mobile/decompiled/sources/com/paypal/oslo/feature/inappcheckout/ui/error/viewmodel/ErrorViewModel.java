package com.paypal.oslo.feature.inappcheckout.ui.error.viewmodel;

@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020&0)8\u0007¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u00100R \u00102\u001a\b\u0012\u0004\u0012\u00020/018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/error/viewmodel/ErrorViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "logger", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;", "analyticsTracer", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/HandleInAppLinkUseCase;", "handleInAppLinkUseCase", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/HandleInAppLinkUseCase;)V", "Lcom/paypal/oslo/feature/inappcheckout/ui/error/contract/ErrorContract$Event;", "event", "", "onEvent", "(Lcom/paypal/oslo/feature/inappcheckout/ui/error/contract/ErrorContract$Event;)V", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/ErrorScreenType;", "errorScreenType", "logErrorDisplayed", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/ErrorScreenType;)V", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;", "getHighResolutionOutputSizeshNQ4ISI", "getInputFormats", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/HandleInAppLinkUseCase;", "Lcom/paypal/oslo/feature/inappcheckout/navigation/route/ErrorDestination;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/inappcheckout/navigation/route/ErrorDestination;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/ErrorScreenType;", "getHighSpeedVideoFpsRanges", "", "getOutputMinFrameDuration", "Ljava/lang/String;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/inappcheckout/ui/error/contract/ErrorContract$State;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getOutputFormats", "Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/inappcheckout/ui/error/contract/ErrorContract$Effect;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "effect", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ErrorViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Effect> effect;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Effect> getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.State> getOutputFormats;
    private final com.paypal.oslo.feature.inappcheckout.navigation.route.ErrorDestination getHighSpeedVideoSizes;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.HandleInAppLinkUseCase Camera2StreamConfigurationMap;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final java.lang.String getInputFormats;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.State> state;

    @javax.inject.Inject
    public ErrorViewModel(androidx.view.SavedStateHandle savedStateHandle, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer, com.paypal.oslo.feature.inappcheckout.domain.usecase.HandleInAppLinkUseCase handleInAppLinkUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateHandle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsTracer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handleInAppLinkUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = checkoutLogger;
        this.getHighResolutionOutputSizeshNQ4ISI = analyticsTracer;
        this.Camera2StreamConfigurationMap = handleInAppLinkUseCase;
        com.paypal.oslo.feature.inappcheckout.navigation.route.ErrorDestination errorDestination = (com.paypal.oslo.feature.inappcheckout.navigation.route.ErrorDestination) androidx.view.SavedStateHandleKt.toRoute(savedStateHandle, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.navigation.route.ErrorDestination.class), kotlin.collections.MapsKt.emptyMap());
        this.getHighSpeedVideoSizes = errorDestination;
        com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType = errorDestination.getErrorScreenType();
        this.getHighSpeedVideoFpsRanges = errorScreenType;
        java.lang.String returnUrl = errorDestination.getReturnUrl();
        this.getInputFormats = returnUrl;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.State> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.State(errorScreenType, returnUrl));
        this.getOutputFormats = MutableStateFlow;
        this.state = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Effect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.getInputSizeshNQ4ISI = MutableSharedFlow$default;
        this.effect = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.State> getState() {
        return this.state;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Effect> getEffect() {
        return this.effect;
    }

    public final void onEvent(com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Event.Retry) {
            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.i$default(this.getHighSpeedVideoFpsRangesFor, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerMessages.SHOWING_RECOVERABLE_ERROR_VIEW_MSG, com.paypal.android.logger.categories.UI.NavigationTransition.INSTANCE, null, null, 12, null);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.error.viewmodel.ErrorViewModel$onEvent$1(this, null), 3, null);
            return;
        }
        if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Event.ReturnToMerchant) {
            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.i$default(this.getHighSpeedVideoFpsRangesFor, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerMessages.SHOWING_NON_RECOVERABLE_ERROR_VIEW_MSG, com.paypal.android.logger.categories.UI.NavigationTransition.INSTANCE, null, null, 12, null);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.error.viewmodel.ErrorViewModel$onEvent$2(this, null), 3, null);
        } else if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Event.CheckAccount) {
            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.i$default(this.getHighSpeedVideoFpsRangesFor, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerMessages.SHOWING_NON_RECOVERABLE_ERROR_VIEW_MSG, com.paypal.android.logger.categories.UI.NavigationTransition.INSTANCE, null, null, 12, null);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.error.viewmodel.ErrorViewModel$onEvent$3(this, null), 3, null);
        } else {
            if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.error.contract.ErrorContract.Event.ContactUs) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.error.viewmodel.ErrorViewModel$onEvent$4(this, null), 3, null);
                return;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public final void logErrorDisplayed(com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType errorScreenType) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorScreenType, "");
        int i = com.paypal.oslo.feature.inappcheckout.ui.error.viewmodel.ErrorViewModel.WhenMappings.$EnumSwitchMapping$0[errorScreenType.ordinal()];
        if (i == 1) {
            str = com.paypal.oslo.feature.inappcheckout.domain.util.LoggerMessages.SHOWING_RECOVERABLE_ERROR_VIEW_MSG;
        } else if (i == 2) {
            this.getHighResolutionOutputSizeshNQ4ISI.trackNonRecoverableErrorScreenShown();
            str = com.paypal.oslo.feature.inappcheckout.domain.util.LoggerMessages.SHOWING_NON_RECOVERABLE_ERROR_VIEW_MSG;
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            str = "showing_non_recoverable_error_view: Buyer restriction";
        }
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.i$default(this.getHighSpeedVideoFpsRangesFor, str, com.paypal.android.logger.categories.UI.Interaction.INSTANCE, null, null, 12, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType.values().length];
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType.RECOVERABLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType.NON_RECOVERABLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType.BUYER_RESTRICTION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
