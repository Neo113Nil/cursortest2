package com.paypal.oslo.feature.ads.ui.widget;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\"8\u0007¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0018\u0010\u000f\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010(R\u0014\u0010+\u001a\u00020)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010*"}, d2 = {"Lcom/paypal/oslo/feature/ads/ui/widget/AdWidgetViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/ads/domain/usecase/GetAdDataUseCase;", "getAdDataUseCase", "Lcom/paypal/oslo/feature/ads/domain/usecase/TriggerImpressionUseCase;", "triggerImpressionUseCase", "<init>", "(Lcom/paypal/oslo/feature/ads/domain/usecase/GetAdDataUseCase;Lcom/paypal/oslo/feature/ads/domain/usecase/TriggerImpressionUseCase;)V", "Lcom/paypal/oslo/feature/ads/api/widget/configs/AdWidgetConfiguration;", "config", "", "initialize", "(Lcom/paypal/oslo/feature/ads/api/widget/configs/AdWidgetConfiguration;)V", "reload", "()V", "Camera2StreamConfigurationMap", "", "onAdViewableImpression", "()Z", "", "adId", "onAdClick", "(Ljava/lang/String;)Z", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/ads/domain/usecase/GetAdDataUseCase;", "getHighSpeedVideoFpsRangesFor", "getInputFormats", "Lcom/paypal/oslo/feature/ads/domain/usecase/TriggerImpressionUseCase;", "Lcom/paypal/oslo/feature/ads/api/widget/configs/AdWidgetConfiguration;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/ads/ui/widget/AdWidgetState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdWidgetViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.ads.ui.widget.AdWidgetState> getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicBoolean getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.ads.domain.usecase.GetAdDataUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private com.paypal.oslo.feature.ads.api.widget.configs.AdWidgetConfiguration getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private kotlinx.coroutines.Job Camera2StreamConfigurationMap;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.ads.domain.usecase.TriggerImpressionUseCase getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.ads.ui.widget.AdWidgetState> state;

    @javax.inject.Inject
    public AdWidgetViewModel(com.paypal.oslo.feature.ads.domain.usecase.GetAdDataUseCase getAdDataUseCase, com.paypal.oslo.feature.ads.domain.usecase.TriggerImpressionUseCase triggerImpressionUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAdDataUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(triggerImpressionUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = getAdDataUseCase;
        this.getHighSpeedVideoFpsRanges = triggerImpressionUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.ads.ui.widget.AdWidgetState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.ads.ui.widget.AdWidgetState.Loading.INSTANCE);
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.state = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        this.getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.ads.ui.widget.AdWidgetState> getState() {
        return this.state;
    }

    public final void initialize(com.paypal.oslo.feature.ads.api.widget.configs.AdWidgetConfiguration config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        this.getHighResolutionOutputSizeshNQ4ISI = config;
        Camera2StreamConfigurationMap();
    }

    public final void reload() {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.ads.LoggerKt.log, com.paypal.oslo.feature.ads.ui.widget.AdWidgetViewModelKt.ErrorNotInitialized, null, null, 6, null);
        } else {
            Camera2StreamConfigurationMap();
        }
    }

    private final void Camera2StreamConfigurationMap() {
        kotlinx.coroutines.Job launch$default;
        this.getInputSizeshNQ4ISI.set(false);
        this.getHighSpeedVideoSizes.setValue(com.paypal.oslo.feature.ads.ui.widget.AdWidgetState.Loading.INSTANCE);
        kotlinx.coroutines.Job job = this.Camera2StreamConfigurationMap;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.ads.ui.widget.AdWidgetViewModel$loadAdData$1(this, null), 3, null);
        this.Camera2StreamConfigurationMap = launch$default;
    }

    public final boolean onAdViewableImpression() {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.ads.ui.widget.AdWidgetViewModelKt.ErrorNotInitialized.toString());
        }
        if (!this.getInputSizeshNQ4ISI.compareAndSet(false, true)) {
            return true;
        }
        com.paypal.oslo.feature.ads.ui.widget.AdWidgetState value = this.getHighSpeedVideoSizes.getValue();
        com.paypal.oslo.feature.ads.ui.widget.AdWidgetState.Loaded loaded = value instanceof com.paypal.oslo.feature.ads.ui.widget.AdWidgetState.Loaded ? (com.paypal.oslo.feature.ads.ui.widget.AdWidgetState.Loaded) value : null;
        com.paypal.oslo.feature.ads.domain.model.AdData adData = loaded != null ? loaded.getAdData() : null;
        if (adData != null) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.ads.ui.widget.AdWidgetViewModel$onAdViewableImpression$2(this, adData, null), 3, null);
        } else {
            this.getInputSizeshNQ4ISI.set(false);
        }
        return adData != null;
    }

    public final boolean onAdClick(java.lang.String adId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "");
        com.paypal.oslo.feature.ads.api.widget.configs.AdWidgetConfiguration adWidgetConfiguration = this.getHighResolutionOutputSizeshNQ4ISI;
        if (adWidgetConfiguration == null) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.ads.ui.widget.AdWidgetViewModelKt.ErrorNotInitialized.toString());
        }
        if (adWidgetConfiguration == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            adWidgetConfiguration = null;
        }
        com.paypal.oslo.feature.ads.api.widget.interfaces.AdWidgetClickHandler clickHandler = adWidgetConfiguration.getClickHandler();
        if (clickHandler != null) {
            return clickHandler.onAdClick(adId);
        }
        return false;
    }
}
