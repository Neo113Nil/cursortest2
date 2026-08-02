package com.paypal.oslo.feature.wallet.cards.ui.add;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010$R \u0010'\u001a\b\u0012\u0004\u0012\u00020#0&8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/add/AddCardFlowRouterViewModelImpl;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/AddCardFlowRouterViewModel;", "<init>", "()V", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;", "analyticsContext", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$InitScreen;", "initialScreen", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header;", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$Config;", "addCardFormConfig", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Options;", "flowOptions", "", "initialize", "(Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$InitScreen;Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header;Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$Config;Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Options;)V", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult;", "result", "handleScannerResult", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Header;Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardForm$Config;Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Options;)V", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$CancellationReason;", "p0", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$CancellationReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;", "handleFormResult", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;)V", "", "getHighSpeedVideoFpsRanges", "Z", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Options;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/AddCardFlowNavEvent;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/Flow;", "navEvent", "Lkotlinx/coroutines/flow/Flow;", "getNavEvent", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddCardFlowRouterViewModelImpl extends com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent> getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent> navEvent;

    @javax.inject.Inject
    public AddCardFlowRouterViewModelImpl() {
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.getHighSpeedVideoFpsRangesFor = MutableSharedFlow$default;
        this.navEvent = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModel
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent> getNavEvent() {
        return this.navEvent;
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModel
    public final void initialize(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext analyticsContext, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen initialScreen, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header header, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config addCardFormConfig, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options flowOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialScreen, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(header, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addCardFormConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowOptions, "");
        if (this.getHighSpeedVideoFpsRanges) {
            return;
        }
        this.getHighSpeedVideoFpsRanges = true;
        this.getHighResolutionOutputSizeshNQ4ISI = flowOptions;
        int i = com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModelImpl.WhenMappings.$EnumSwitchMapping$0[initialScreen.ordinal()];
        if (i == 1) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModelImpl$initialize$1(this, null), 3, null);
        } else {
            if (i == 2) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModelImpl$initialize$2(this, analyticsContext, header, addCardFormConfig, flowOptions, null), 3, null);
                return;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModel
    public final void handleScannerResult(com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult result, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext analyticsContext, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header header, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config addCardFormConfig, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options flowOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(header, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addCardFormConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowOptions, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModelImpl$handleScannerResult$1(result, this, analyticsContext, header, addCardFormConfig, flowOptions, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason cancellationReason, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object emit = this.getHighSpeedVideoFpsRangesFor.emit(new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.ExitFlow(new com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult(new com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Cancelled(cancellationReason))), continuation);
        return emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModel
    public final void handleFormResult(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModelImpl$handleFormResult$1(this, result, null), 3, null);
    }

    public static final /* synthetic */ java.lang.Object access$handleScanCancellation(com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModelImpl addCardFlowRouterViewModelImpl, com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Cancelled cancelled, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header header, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config config, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options options, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason reason = cancelled.getReason();
        if (kotlin.jvm.internal.Intrinsics.areEqual(reason, com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserNavigatedToManualEntry.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(reason, com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.CameraPermissionDenied.INSTANCE)) {
            java.lang.Object emit = addCardFlowRouterViewModelImpl.getHighSpeedVideoFpsRangesFor.emit(new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.NavigateToForm(new com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenArgs(addFIAnalyticsContext, header, config, options, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 112, (kotlin.jvm.internal.DefaultConstructorMarker) null)), continuation);
            return emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : kotlin.Unit.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(reason, com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserNavigatedBack.INSTANCE)) {
            java.lang.Object highSpeedVideoSizes = addCardFlowRouterViewModelImpl.getHighSpeedVideoSizes(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserNavigatedBack.INSTANCE, continuation);
            return highSpeedVideoSizes == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoSizes : kotlin.Unit.INSTANCE;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(reason, com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserClosedTheScanner.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(reason, com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserNavigatedToVerifyWithBank.INSTANCE)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.Object highSpeedVideoSizes2 = addCardFlowRouterViewModelImpl.getHighSpeedVideoSizes(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserClosedFlow.INSTANCE, continuation);
        return highSpeedVideoSizes2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoSizes2 : kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.Object access$handleScanError(com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModelImpl addCardFlowRouterViewModelImpl, com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Error error, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header header, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config config, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options options, kotlin.coroutines.Continuation continuation) {
        java.lang.Object emit = addCardFlowRouterViewModelImpl.getHighSpeedVideoFpsRangesFor.emit(new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.NavigateToForm(new com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenArgs(addFIAnalyticsContext, header, config, options, (java.lang.String) null, (java.lang.String) null, error.getErrMsg(), 48, (kotlin.jvm.internal.DefaultConstructorMarker) null)), continuation);
        return emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.Object access$handleScanSuccess(com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModelImpl addCardFlowRouterViewModelImpl, com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Success success, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header header, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config config, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options options, kotlin.coroutines.Continuation continuation) {
        java.lang.Object emit = addCardFlowRouterViewModelImpl.getHighSpeedVideoFpsRangesFor.emit(new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.NavigateToForm(new com.paypal.oslo.feature.wallet.cards.ui.add.manual.screen.AddCardScreenArgs(addFIAnalyticsContext, header, config, options, success.getCardNumber(), success.getExpiryDate(), (java.lang.String) null, 64, (kotlin.jvm.internal.DefaultConstructorMarker) null)), continuation);
        return emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen.SCANNER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen.FORM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
