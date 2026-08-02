package com.paypal.oslo.feature.helpcenter.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R#\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00158\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/viewmodel/CallUsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/helpcenter/domain/usecase/FetchCallUsDataUseCase;", "fetchCallUsDataUseCase", "Lcom/paypal/oslo/feature/helpcenter/domain/remoteconfig/HelpCenterConfig$Manager;", "helpCenterConfig", "<init>", "(Lcom/paypal/oslo/feature/helpcenter/domain/usecase/FetchCallUsDataUseCase;Lcom/paypal/oslo/feature/helpcenter/domain/remoteconfig/HelpCenterConfig$Manager;)V", "", "fetchCallUsData", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/helpcenter/domain/usecase/FetchCallUsDataUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/helpcenter/domain/remoteconfig/HelpCenterConfig$Manager;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/ScreenState;", "Lcom/paypal/oslo/feature/helpcenter/domain/models/CallUsData;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/StateFlow;", "callUsState", "Lkotlinx/coroutines/flow/StateFlow;", "getCallUsState", "()Lkotlinx/coroutines/flow/StateFlow;", "", "showWifiOption", "Z", "getShowWifiOption", "()Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CallUsViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.helpcenter.domain.remoteconfig.HelpCenterConfig.Manager getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<com.paypal.oslo.feature.helpcenter.domain.models.CallUsData>> callUsState;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.helpcenter.domain.usecase.FetchCallUsDataUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<com.paypal.oslo.feature.helpcenter.domain.models.CallUsData>> getHighSpeedVideoFpsRangesFor;
    private final boolean showWifiOption;

    @javax.inject.Inject
    public CallUsViewModel(com.paypal.oslo.feature.helpcenter.domain.usecase.FetchCallUsDataUseCase fetchCallUsDataUseCase, com.paypal.oslo.feature.helpcenter.domain.remoteconfig.HelpCenterConfig.Manager manager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchCallUsDataUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manager, "");
        this.Camera2StreamConfigurationMap = fetchCallUsDataUseCase;
        this.getHighSpeedVideoSizes = manager;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<com.paypal.oslo.feature.helpcenter.domain.models.CallUsData>> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Loading.INSTANCE);
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow;
        this.callUsState = MutableStateFlow;
        this.showWifiOption = manager.isWifiCallingEnabled();
        fetchCallUsData();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<com.paypal.oslo.feature.helpcenter.domain.models.CallUsData>> getCallUsState() {
        return this.callUsState;
    }

    public final boolean getShowWifiOption() {
        return this.showWifiOption;
    }

    public final void fetchCallUsData() {
        this.getHighSpeedVideoFpsRangesFor.setValue(com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Loading.INSTANCE);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.helpcenter.ui.viewmodel.CallUsViewModel$fetchCallUsData$1(this, null), 3, null);
    }
}
