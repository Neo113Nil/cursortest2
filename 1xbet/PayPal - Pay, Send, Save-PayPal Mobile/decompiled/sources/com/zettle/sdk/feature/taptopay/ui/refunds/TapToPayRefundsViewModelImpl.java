package com.zettle.sdk.feature.taptopay.ui.refunds;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001'B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0010\u001a\u00020 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010!R \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140\"8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModelImpl;", "Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/zettle/sdk/feature/taptopay/ui/TapToPayFeature$Configuration;", "tapToPayFeature", "<init>", "(Lcom/zettle/sdk/feature/taptopay/ui/TapToPayFeature$Configuration;)V", "Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$Actions;", "action", "", "dispatchAction", "(Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$Actions;)V", "onCleared", "()V", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$Effects;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$UiData;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;", "Lkotlinx/coroutines/flow/SharedFlow;", "effects", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffects", "()Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/Refund;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/Refund;", "Lkotlinx/coroutines/flow/StateFlow;", "uiData", "Lkotlinx/coroutines/flow/StateFlow;", "getUiData", "()Lkotlinx/coroutines/flow/StateFlow;", "Factory"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TapToPayRefundsViewModelImpl extends androidx.view.ViewModel implements com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel {
    public static final int $stable = 8;
    private com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.SharedFlow<com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Effects> effects;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.refunds.Refund getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.UiData> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Effects> getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.StateFlow<com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.UiData> uiData;

    public TapToPayRefundsViewModelImpl(com.zettle.sdk.feature.taptopay.ui.TapToPayFeature.Companion companion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        java.util.Currency currency = java.util.Currency.getInstance(java.util.Locale.getDefault());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currency, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.UiData> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.UiData(0L, 0L, "", "", "", currency, 0, false, false, 448, null));
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow;
        this.uiData = MutableStateFlow;
        kotlinx.coroutines.flow.MutableSharedFlow<com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Effects> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.getHighSpeedVideoFpsRanges = MutableSharedFlow$default;
        this.effects = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
        com.zettle.sdk.feature.taptopay.core.refunds.Refund refund = companion.getManager$ui_publicRelease().getRefund();
        this.getHighSpeedVideoSizes = refund;
        refund.start();
    }

    @Override // com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel
    public final kotlinx.coroutines.flow.StateFlow<com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.UiData> getUiData() {
        return this.uiData;
    }

    @Override // com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel
    public final kotlinx.coroutines.flow.SharedFlow<com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Effects> getEffects() {
        return this.effects;
    }

    @Override // androidx.view.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.getHighSpeedVideoSizes.end();
    }

    @Override // com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel
    public final void dispatchAction(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Actions action) {
        com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.UiData value;
        com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.UiData copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        if (action instanceof com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Actions.DoRefund) {
            com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Actions.DoRefund doRefund = (com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Actions.DoRefund) action;
            java.lang.Long amount = doRefund.getAmount();
            java.lang.String refundReferenceId = doRefund.getRefundReferenceId();
            kotlinx.coroutines.flow.MutableStateFlow<com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.UiData> mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI;
            do {
                value = mutableStateFlow.getValue();
                copy = r5.copy((r24 & 1) != 0 ? r5.refundedAmount : 0L, (r24 & 2) != 0 ? r5.totalAmount : 0L, (r24 & 4) != 0 ? r5.date : null, (r24 & 8) != 0 ? r5.card : null, (r24 & 16) != 0 ? r5.receiptNumber : null, (r24 & 32) != 0 ? r5.currency : null, (r24 & 64) != 0 ? r5.refundButtonText : com.zettle.sdk.feature.taptopay.ui.R.string.tap_to_pay_refunds_confirm_button_please_wait, (r24 & 128) != 0 ? r5.refundButtonEnable : false, (r24 & 256) != 0 ? value.loading : false);
            } while (!mutableStateFlow.compareAndSet(value, copy));
            com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload cardPaymentPayload = this.Camera2StreamConfigurationMap;
            if (cardPaymentPayload != null) {
                this.getHighSpeedVideoSizes.doRefund(cardPaymentPayload, amount, refundReferenceId, new kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.refunds.Refund.DoRefundResult, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl$doRefund$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.feature.taptopay.core.refunds.Refund.DoRefundResult doRefundResult) {
                        getHighSpeedVideoFpsRanges(doRefundResult);
                        return kotlin.Unit.INSTANCE;
                    }

                    @kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl$doRefund$1$1$1", f = "TapToPayRefundsViewModelImpl.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl$doRefund$1$1$1, reason: invalid class name */
                    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                        final /* synthetic */ com.zettle.sdk.feature.taptopay.core.refunds.Refund.DoRefundResult getHighResolutionOutputSizeshNQ4ISI;
                        final /* synthetic */ com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl getHighSpeedVideoFpsRanges;
                        int getHighSpeedVideoSizes;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                            kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.getHighSpeedVideoSizes;
                            if (i == 0) {
                                kotlin.ResultKt.throwOnFailure(obj);
                                mutableSharedFlow = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
                                this.getHighSpeedVideoSizes = 1;
                                if (mutableSharedFlow.emit(new com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Effects.DisplayErrorDoRefund(new com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundFailureReason.FailedDoRefund(((com.zettle.sdk.feature.taptopay.core.refunds.Refund.DoRefundResult.Failed) this.getHighResolutionOutputSizeshNQ4ISI).getFailure().toString())), this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj);
                            }
                            return kotlin.Unit.INSTANCE;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                            return ((com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl$doRefund$1$1.AnonymousClass1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
                            return new com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl$doRefund$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl tapToPayRefundsViewModelImpl, com.zettle.sdk.feature.taptopay.core.refunds.Refund.DoRefundResult doRefundResult, kotlin.coroutines.Continuation<? super com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl$doRefund$1$1.AnonymousClass1> continuation) {
                            super(1, continuation);
                            this.getHighSpeedVideoFpsRanges = tapToPayRefundsViewModelImpl;
                            this.getHighResolutionOutputSizeshNQ4ISI = doRefundResult;
                        }
                    }

                    public final void getHighSpeedVideoFpsRanges(com.zettle.sdk.feature.taptopay.core.refunds.Refund.DoRefundResult doRefundResult) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(doRefundResult, "");
                        if (doRefundResult instanceof com.zettle.sdk.feature.taptopay.core.refunds.Refund.DoRefundResult.Failed) {
                            com.zettle.sdk.core.ZettleScopeKt.monitoredLaunch(androidx.view.ViewModelKt.getViewModelScope(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl.this), new com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl$doRefund$1$1.AnonymousClass1(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl.this, doRefundResult, null));
                        } else if (doRefundResult instanceof com.zettle.sdk.feature.taptopay.core.refunds.Refund.DoRefundResult.Success) {
                            com.zettle.sdk.core.ZettleScopeKt.monitoredLaunch(androidx.view.ViewModelKt.getViewModelScope(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl.this), new com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl$doRefund$1$1.AnonymousClass2(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl.this, doRefundResult, null));
                        }
                    }

                    @kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl$doRefund$1$1$2", f = "TapToPayRefundsViewModelImpl.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl$doRefund$1$1$2, reason: invalid class name */
                    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                        final /* synthetic */ com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl Camera2StreamConfigurationMap;
                        final /* synthetic */ com.zettle.sdk.feature.taptopay.core.refunds.Refund.DoRefundResult getHighSpeedVideoFpsRangesFor;
                        int getHighSpeedVideoSizes;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                            kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.getHighSpeedVideoSizes;
                            if (i == 0) {
                                kotlin.ResultKt.throwOnFailure(obj);
                                mutableSharedFlow = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
                                this.getHighSpeedVideoSizes = 1;
                                if (mutableSharedFlow.emit(new com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Effects.SuccessDoRefund(com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundKt.toRefundPayloadResult(((com.zettle.sdk.feature.taptopay.core.refunds.Refund.DoRefundResult.Success) this.getHighSpeedVideoFpsRangesFor).getRefundPayload())), this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj);
                            }
                            return kotlin.Unit.INSTANCE;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                            return ((com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl$doRefund$1$1.AnonymousClass2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
                            return new com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl$doRefund$1$1.AnonymousClass2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass2(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl tapToPayRefundsViewModelImpl, com.zettle.sdk.feature.taptopay.core.refunds.Refund.DoRefundResult doRefundResult, kotlin.coroutines.Continuation<? super com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl$doRefund$1$1.AnonymousClass2> continuation) {
                            super(1, continuation);
                            this.Camera2StreamConfigurationMap = tapToPayRefundsViewModelImpl;
                            this.getHighSpeedVideoFpsRangesFor = doRefundResult;
                        }
                    }

                    {
                        super(1);
                    }
                });
                return;
            }
            return;
        }
        if (action instanceof com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Actions.RetrievePaymentInfo) {
            com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Actions.RetrievePaymentInfo retrievePaymentInfo = (com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Actions.RetrievePaymentInfo) action;
            java.lang.String paymentReferenceId = retrievePaymentInfo.getPaymentReferenceId();
            final java.lang.Long amount2 = retrievePaymentInfo.getAmount();
            this.getHighSpeedVideoSizes.retrievePaymentInfo(paymentReferenceId, new kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl$retrievePaymentInfo$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult retrieveCardPaymentInfoResult) {
                    getHighSpeedVideoSizes(retrieveCardPaymentInfoResult);
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl$retrievePaymentInfo$1$1", f = "TapToPayRefundsViewModelImpl.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl$retrievePaymentInfo$1$1, reason: invalid class name */
                static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                    final /* synthetic */ com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult Camera2StreamConfigurationMap;
                    int getHighResolutionOutputSizeshNQ4ISI;
                    final /* synthetic */ com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl getHighSpeedVideoFpsRanges;
                    final /* synthetic */ java.lang.Long getHighSpeedVideoSizes;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
                        com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.UiData copy;
                        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.getHighResolutionOutputSizeshNQ4ISI;
                        if (i == 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap = ((com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult.Success) this.Camera2StreamConfigurationMap).getCardPaymentPayload();
                            java.lang.String concat = com.paypal.oslo.feature.merchantbanking.common.MerchantBankingConstants.Masking.BULLET_MASK_PREFIX.concat(java.lang.String.valueOf(((com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult.Success) this.Camera2StreamConfigurationMap).getCardPaymentPayload().getCardLastDigits()));
                            if (this.getHighSpeedVideoSizes == null || ((com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult.Success) this.Camera2StreamConfigurationMap).getCardPaymentPayload().getAmount() >= this.getHighSpeedVideoSizes.longValue()) {
                                mutableStateFlow = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
                                java.lang.Long l = this.getHighSpeedVideoSizes;
                                com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult retrieveCardPaymentInfoResult = this.Camera2StreamConfigurationMap;
                                com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl tapToPayRefundsViewModelImpl = this.getHighSpeedVideoFpsRanges;
                                while (true) {
                                    java.lang.Object value = mutableStateFlow.getValue();
                                    com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.UiData uiData = (com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.UiData) value;
                                    long longValue = l != null ? l.longValue() : ((com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult.Success) retrieveCardPaymentInfoResult).getCardPaymentPayload().getAmount();
                                    com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult.Success success = (com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult.Success) retrieveCardPaymentInfoResult;
                                    long amount = success.getCardPaymentPayload().getAmount();
                                    java.lang.String access$dateFormatter = com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl.access$dateFormatter(tapToPayRefundsViewModelImpl, success.getCardPaymentPayload().getDate());
                                    if (access$dateFormatter == null) {
                                        access$dateFormatter = "";
                                    }
                                    java.lang.String referenceNumber = success.getCardPaymentPayload().getReferenceNumber();
                                    com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl tapToPayRefundsViewModelImpl2 = tapToPayRefundsViewModelImpl;
                                    copy = uiData.copy((r24 & 1) != 0 ? uiData.refundedAmount : longValue, (r24 & 2) != 0 ? uiData.totalAmount : amount, (r24 & 4) != 0 ? uiData.date : access$dateFormatter, (r24 & 8) != 0 ? uiData.card : concat, (r24 & 16) != 0 ? uiData.receiptNumber : referenceNumber != null ? referenceNumber : "", (r24 & 32) != 0 ? uiData.currency : success.getCardPaymentPayload().getCurrency(), (r24 & 64) != 0 ? uiData.refundButtonText : 0, (r24 & 128) != 0 ? uiData.refundButtonEnable : false, (r24 & 256) != 0 ? uiData.loading : false);
                                    if (mutableStateFlow.compareAndSet(value, copy)) {
                                        break;
                                    }
                                    tapToPayRefundsViewModelImpl = tapToPayRefundsViewModelImpl2;
                                }
                            } else {
                                mutableSharedFlow = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
                                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                                if (mutableSharedFlow.emit(new com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Effects.DisplayErrorAmountAboveMaximum(new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AboveMaximum()), this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                        }
                        return kotlin.Unit.INSTANCE;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        return ((com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl$retrievePaymentInfo$1.AnonymousClass1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
                        return new com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl$retrievePaymentInfo$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl tapToPayRefundsViewModelImpl, com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult retrieveCardPaymentInfoResult, java.lang.Long l, kotlin.coroutines.Continuation<? super com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl$retrievePaymentInfo$1.AnonymousClass1> continuation) {
                        super(1, continuation);
                        this.getHighSpeedVideoFpsRanges = tapToPayRefundsViewModelImpl;
                        this.Camera2StreamConfigurationMap = retrieveCardPaymentInfoResult;
                        this.getHighSpeedVideoSizes = l;
                    }
                }

                public final void getHighSpeedVideoSizes(com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult retrieveCardPaymentInfoResult) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retrieveCardPaymentInfoResult, "");
                    if (retrieveCardPaymentInfoResult instanceof com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult.Success) {
                        com.zettle.sdk.core.ZettleScopeKt.monitoredLaunch(androidx.view.ViewModelKt.getViewModelScope(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl.this), new com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl$retrievePaymentInfo$1.AnonymousClass1(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl.this, retrieveCardPaymentInfoResult, amount2, null));
                    } else if (retrieveCardPaymentInfoResult instanceof com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult.Failed) {
                        com.zettle.sdk.core.ZettleScopeKt.monitoredLaunch(androidx.view.ViewModelKt.getViewModelScope(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl.this), new com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl$retrievePaymentInfo$1.AnonymousClass2(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl.this, null));
                    }
                }

                @kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl$retrievePaymentInfo$1$2", f = "TapToPayRefundsViewModelImpl.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl$retrievePaymentInfo$1$2, reason: invalid class name */
                static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                    final /* synthetic */ com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl getHighSpeedVideoFpsRanges;
                    int getHighSpeedVideoFpsRangesFor;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.getHighSpeedVideoFpsRangesFor;
                        if (i == 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            mutableSharedFlow = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
                            this.getHighSpeedVideoFpsRangesFor = 1;
                            if (mutableSharedFlow.emit(new com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Effects.DisplayErrorRetrieveData(new com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundFailureReason.FailedRetrieveRefund()), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                        }
                        return kotlin.Unit.INSTANCE;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        return ((com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl$retrievePaymentInfo$1.AnonymousClass2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
                        return new com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl$retrievePaymentInfo$1.AnonymousClass2(this.getHighSpeedVideoFpsRanges, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl tapToPayRefundsViewModelImpl, kotlin.coroutines.Continuation<? super com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl$retrievePaymentInfo$1.AnonymousClass2> continuation) {
                        super(1, continuation);
                        this.getHighSpeedVideoFpsRanges = tapToPayRefundsViewModelImpl;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
            return;
        }
        if (action instanceof com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Actions.Cancel) {
            com.zettle.sdk.core.ZettleScopeKt.monitoredLaunch(androidx.view.ViewModelKt.getViewModelScope(this), new com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl$cancel$1(this, null));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModelImpl$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "<init>", "()V", "Landroidx/lifecycle/ViewModel;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        public static final int $stable = 0;

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final <T extends androidx.view.ViewModel> T create(java.lang.Class<T> modelClass) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "");
            return new com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl(com.zettle.sdk.feature.taptopay.ui.TapToPayFeature.INSTANCE);
        }
    }

    public static final /* synthetic */ java.lang.String access$dateFormatter(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl tapToPayRefundsViewModelImpl, java.util.Date date) {
        if (date != null) {
            return java.text.DateFormat.getDateTimeInstance(1, 3).format(date);
        }
        return null;
    }
}
