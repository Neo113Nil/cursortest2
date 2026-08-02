package com.paypal.oslo.feature.wallet.cards.ui.details;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¨\u0006\u0006"}, d2 = {"<anonymous>", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailViewModelImpl$special$$inlined$flatMapLatest$1", f = "CardDetailViewModelImpl.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m = "invokeSuspend", n = {"$this$transformLatest", "it"}, nl = {-1}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
public final class CardDetailViewModelImpl$special$$inlined$flatMapLatest$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailScreenState>, java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailViewModelImpl getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDetailUseCase getCardDetailUseCase;
        kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailScreenState> flow;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.Camera2StreamConfigurationMap;
            java.lang.Object obj2 = this.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailViewModelImpl$special$$inlined$flatMapLatest$1 cardDetailViewModelImpl$special$$inlined$flatMapLatest$1 = this;
            java.lang.String str = (java.lang.String) obj2;
            if (str != null) {
                getCardDetailUseCase = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                final kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetailError, com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetail>> invoke = getCardDetailUseCase.invoke(str);
                flow = new kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailScreenState>() { // from class: com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailViewModelImpl$uiState$lambda$0$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailScreenState> flowCollector2, kotlin.coroutines.Continuation continuation) {
                        java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailViewModelImpl$uiState$lambda$0$$inlined$map$1.AnonymousClass2(flowCollector2), continuation);
                        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                    }

                    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                    /* renamed from: com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailViewModelImpl$uiState$lambda$0$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoSizes;

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                            com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailViewModelImpl$uiState$lambda$0$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                            int i;
                            com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailScreenState error;
                            if (continuation instanceof com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailViewModelImpl$uiState$lambda$0$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                                anonymousClass1 = (com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailViewModelImpl$uiState$lambda$0$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                                if ((anonymousClass1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.getOutputMinFrameDuration -= 2147483648;
                                    java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoSizesFor;
                                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.getOutputMinFrameDuration;
                                    if (i != 0) {
                                        kotlin.ResultKt.throwOnFailure(obj2);
                                        kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoSizes;
                                        arrow.core.Either either = (arrow.core.Either) obj;
                                        if (either instanceof arrow.core.Either.Right) {
                                            error = new com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailScreenState.Success(com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailInfoKtKt.toCardDetailInfo((com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetail) ((arrow.core.Either.Right) either).getValue()));
                                        } else {
                                            if (!(either instanceof arrow.core.Either.Left)) {
                                                throw new kotlin.NoWhenBranchMatchedException();
                                            }
                                            error = new com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailScreenState.Error((com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetailError) ((arrow.core.Either.Left) either).getValue());
                                        }
                                        anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                        anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                        anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                        anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                        anonymousClass1.getHighSpeedVideoSizes = 0;
                                        anonymousClass1.getOutputMinFrameDuration = 1;
                                        if (flowCollector.emit(error, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        int i2 = anonymousClass1.getHighSpeedVideoSizes;
                                        java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                        java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                        kotlin.ResultKt.throwOnFailure(obj2);
                                    }
                                    return kotlin.Unit.INSTANCE;
                                }
                            }
                            anonymousClass1 = new com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailViewModelImpl$uiState$lambda$0$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                            java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoSizesFor;
                            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getOutputMinFrameDuration;
                            if (i != 0) {
                            }
                            return kotlin.Unit.INSTANCE;
                        }

                        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailViewModelImpl$uiState$lambda$0$$inlined$map$1$2", f = "CardDetailViewModelImpl.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                        /* renamed from: com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailViewModelImpl$uiState$lambda$0$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                            java.lang.Object Camera2StreamConfigurationMap;
                            java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                            java.lang.Object getHighSpeedVideoFpsRanges;
                            java.lang.Object getHighSpeedVideoFpsRangesFor;
                            int getHighSpeedVideoSizes;
                            /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
                            int getOutputMinFrameDuration;

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                this.getHighSpeedVideoSizesFor = obj;
                                this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
                                return com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailViewModelImpl$uiState$lambda$0$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                            }

                            public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                                super(continuation);
                            }
                        }

                        public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                            this.getHighSpeedVideoSizes = flowCollector;
                        }
                    }
                };
            } else {
                flow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailScreenState.Loading.INSTANCE);
            }
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (kotlinx.coroutines.flow.FlowKt.emitAll(flowCollector, flow, cardDetailViewModelImpl$special$$inlined$flatMapLatest$1) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailScreenState> flowCollector, java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailViewModelImpl$special$$inlined$flatMapLatest$1 cardDetailViewModelImpl$special$$inlined$flatMapLatest$1 = new com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailViewModelImpl$special$$inlined$flatMapLatest$1(continuation, this.getHighResolutionOutputSizeshNQ4ISI);
        cardDetailViewModelImpl$special$$inlined$flatMapLatest$1.Camera2StreamConfigurationMap = flowCollector;
        cardDetailViewModelImpl$special$$inlined$flatMapLatest$1.getHighSpeedVideoSizes = str;
        return cardDetailViewModelImpl$special$$inlined$flatMapLatest$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDetailViewModelImpl$special$$inlined$flatMapLatest$1(kotlin.coroutines.Continuation continuation, com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailViewModelImpl cardDetailViewModelImpl) {
        super(3, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = cardDetailViewModelImpl;
    }
}
