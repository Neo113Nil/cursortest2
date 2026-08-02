package com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel;

@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u001f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010$R\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010%\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010*R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020)0+8\u0007¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u0019008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u00101R \u00104\u001a\b\u0012\u0004\u0012\u00020\u0019038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/viewmodel/OneShotViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/reducer/OneShotReducer;", "reducer", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/GetAuthDataUseCase;", "getAuthDataUseCase", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/InitializeNativeRypCheckoutUseCase;", "initializeNativeRypCheckoutUseCase", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "appSwitchSession", "Lcom/paypal/oslo/feature/inappcheckout/domain/provider/mock/MockFileNameProvider;", "mockFileNameProvider", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;", "analyticsTracer", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/reducer/OneShotReducer;Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/GetAuthDataUseCase;Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/InitializeNativeRypCheckoutUseCase;Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;Lcom/paypal/oslo/feature/inappcheckout/domain/provider/mock/MockFileNameProvider;Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;)V", "Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Event;", "event", "", "onEvent", "(Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Event;)V", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "p0", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;)V", "Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Effect;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;)Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Effect;", "getOutputFormats", "Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/reducer/OneShotReducer;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/GetAuthDataUseCase;", "getHighSpeedVideoSizes", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/InitializeNativeRypCheckoutUseCase;", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/inappcheckout/domain/provider/mock/MockFileNameProvider;", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$State;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getHighSpeedVideoSizesFor", "Lkotlinx/coroutines/flow/SharedFlow;", "effect", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OneShotViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer getInputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect> effect;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect> getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.GetAuthDataUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.State> getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession getHighSpeedVideoFpsRanges;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider Camera2StreamConfigurationMap;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.ui.oneshot.reducer.OneShotReducer getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.InitializeNativeRypCheckoutUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.State> state;

    @javax.inject.Inject
    public OneShotViewModel(com.paypal.oslo.feature.inappcheckout.ui.oneshot.reducer.OneShotReducer oneShotReducer, com.paypal.oslo.feature.inappcheckout.domain.usecase.GetAuthDataUseCase getAuthDataUseCase, com.paypal.oslo.feature.inappcheckout.domain.usecase.InitializeNativeRypCheckoutUseCase initializeNativeRypCheckoutUseCase, com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider mockFileNameProvider, com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneShotReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAuthDataUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializeNativeRypCheckoutUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSwitchSession, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockFileNameProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsTracer, "");
        this.getHighSpeedVideoFpsRangesFor = oneShotReducer;
        this.getHighSpeedVideoSizes = getAuthDataUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = initializeNativeRypCheckoutUseCase;
        this.getHighSpeedVideoFpsRanges = appSwitchSession;
        this.Camera2StreamConfigurationMap = mockFileNameProvider;
        this.getInputSizeshNQ4ISI = analyticsTracer;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.State> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.State(false, false, false, null, 15, null));
        this.getOutputMinFrameDuration = MutableStateFlow;
        this.state = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.getHighSpeedVideoSizesFor = MutableSharedFlow$default;
        this.effect = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.State> getState() {
        return this.state;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect> getEffect() {
        return this.effect;
    }

    public final void onEvent(com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        boolean z = event instanceof com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Event.Initialize;
        if (z) {
            com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Event.Initialize initialize = (com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Event.Initialize) event;
            if (initialize.getResponse() != null) {
                Camera2StreamConfigurationMap(initialize.getResponse());
                return;
            }
        }
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.State> mutableStateFlow = this.getOutputMinFrameDuration;
        mutableStateFlow.setValue(this.getHighSpeedVideoFpsRangesFor.reduce(mutableStateFlow.getValue(), event));
        if (z) {
            Camera2StreamConfigurationMap(((com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Event.Initialize) event).getResponse());
        } else {
            if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Event.RetryAuthentication)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.getInputSizeshNQ4ISI.trackInitiatedAuthFlow();
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel$authenticate$1(this, null), 3, null);
        }
    }

    private final void Camera2StreamConfigurationMap(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse p0) {
        if (p0 != null) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel$handleOnInitialize$1(this, p0, null), 3, null);
            return;
        }
        this.getInputSizeshNQ4ISI.trackInitiatedAuthFlow();
        if (this.Camera2StreamConfigurationMap.getGetInputFormats()) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel$authenticate$1(this, null), 3, null);
        } else {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel$executeDirectApiCall$1(this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse p0) {
        java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity> contingencies;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionConfig config;
        com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity = p0.getBuyerInfoEntity();
        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity fundingSelectionEntity = p0.getFundingSelectionEntity();
        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity fundingSelectionEntity2 = p0.getFundingSelectionEntity();
        com.paypal.oslo.feature.inappcheckout.domain.entity.InstantVaultMetadata instantVault = (fundingSelectionEntity2 == null || (config = fundingSelectionEntity2.getConfig()) == null) ? null : config.getInstantVault();
        if (buyerInfoEntity == null) {
            return new com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToError(com.paypal.oslo.feature.inappcheckout.domain.model.ErrorScreenType.BUYER_RESTRICTION, com.paypal.oslo.feature.inappcheckout.extensions.EntityExtensionsKt.cancelUrl(p0.getInitializeCheckoutEntity()));
        }
        java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity> contingencies2 = buyerInfoEntity.getContingencies();
        if (contingencies2 != null) {
            java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity> list = contingencies2;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity) it.next()) instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentContingency) {
                        return new com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToEConsent(p0);
                    }
                }
            }
        }
        if (instantVault != null && (((contingencies = buyerInfoEntity.getContingencies()) == null || contingencies.isEmpty()) && fundingSelectionEntity.getContingency() == null)) {
            return new com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToInstantVaultScreen(p0);
        }
        return new com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToRyp(p0);
    }

    public static final /* synthetic */ java.lang.Object access$handleError(com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel oneShotViewModel, com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity nativeXOErrorEntity, kotlin.coroutines.Continuation continuation) {
        java.lang.Object emit = oneShotViewModel.getHighSpeedVideoSizesFor.emit(new com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect.NavigateToError(com.paypal.oslo.feature.inappcheckout.extensions.EntityExtensionsKt.toErrorScreenType(nativeXOErrorEntity), nativeXOErrorEntity.getReturnUrl()), continuation);
        return emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.Object access$handleSuccess(com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel oneShotViewModel, com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity initializeNativeRypCheckoutResponseEntity, kotlin.coroutines.Continuation continuation) {
        java.lang.Object emit = oneShotViewModel.getHighSpeedVideoSizesFor.emit(getHighResolutionOutputSizeshNQ4ISI(new com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse(initializeNativeRypCheckoutResponseEntity.getInitializeCheckout(), initializeNativeRypCheckoutResponseEntity.getFundingSelection(), initializeNativeRypCheckoutResponseEntity.getBuyerInfo())), continuation);
        return emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : kotlin.Unit.INSTANCE;
    }
}
