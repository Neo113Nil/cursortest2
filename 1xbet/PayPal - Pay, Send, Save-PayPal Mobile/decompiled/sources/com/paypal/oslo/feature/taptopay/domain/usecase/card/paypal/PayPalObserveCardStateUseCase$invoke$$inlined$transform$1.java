package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n¨\u0006\u0004"}, d2 = {"<anonymous>", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase$invoke$$inlined$transform$1", f = "PayPalObserveCardStateUseCase.kt", i = {0}, l = {36}, m = "invokeSuspend", n = {"$this$flow"}, nl = {40}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
public final class PayPalObserveCardStateUseCase$invoke$$inlined$transform$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardStateChange>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlinx.coroutines.flow.Flow getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase$invoke$$inlined$transform$1$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase Camera2StreamConfigurationMap;
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardStateChange> getHighSpeedVideoSizes;

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00ff, code lost:
        
            if (r8.emit(r13, r2) == r3) goto L27;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase$invoke$$inlined$transform$1.AnonymousClass1.C01491 c01491;
            int i;
            kotlinx.coroutines.flow.FlowCollector<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardStateChange> flowCollector;
            com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase$invoke$$inlined$transform$1.AnonymousClass1.C01491 c014912;
            com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange cardStateChange;
            com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase payPalGetCardIdGroupUseCase;
            java.lang.Object obj;
            com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard;
            int i2;
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup;
            if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase$invoke$$inlined$transform$1.AnonymousClass1.C01491) {
                c01491 = (com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase$invoke$$inlined$transform$1.AnonymousClass1.C01491) continuation;
                if ((c01491.getInputFormats & Integer.MIN_VALUE) != 0) {
                    c01491.getInputFormats -= 2147483648;
                    java.lang.Object obj2 = c01491.getHighSpeedVideoSizesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c01491.getInputFormats;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        flowCollector = this.getHighSpeedVideoSizes;
                        c014912 = c01491;
                        cardStateChange = (com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange) t;
                        com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard2 = cardStateChange.getDigitizedCard();
                        payPalGetCardIdGroupUseCase = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
                        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DigitizedCardId digitizedCardId = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DigitizedCardId(digitizedCard2.getCardId());
                        c01491.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(t);
                        c01491.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(c014912);
                        c01491.getHighSpeedVideoSizes = cardStateChange;
                        c01491.getInputSizeshNQ4ISI = flowCollector;
                        c01491.getOutputFormats = digitizedCard2;
                        c01491.getHighSpeedVideoFpsRanges = 0;
                        c01491.getInputFormats = 1;
                        java.lang.Object invoke = payPalGetCardIdGroupUseCase.invoke(digitizedCardId, c01491);
                        if (invoke != coroutine_suspended) {
                            obj = t;
                            digitizedCard = digitizedCard2;
                            obj2 = invoke;
                            i2 = 0;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i3 = c01491.Camera2StreamConfigurationMap;
                        int i4 = c01491.getHighSpeedVideoFpsRanges;
                        java.lang.Object obj3 = c01491.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        return kotlin.Unit.INSTANCE;
                    }
                    i2 = c01491.getHighSpeedVideoFpsRanges;
                    digitizedCard = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) c01491.getOutputFormats;
                    flowCollector = (kotlinx.coroutines.flow.FlowCollector) c01491.getInputSizeshNQ4ISI;
                    cardStateChange = (com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange) c01491.getHighSpeedVideoSizes;
                    c014912 = (kotlin.coroutines.Continuation) c01491.getHighResolutionOutputSizeshNQ4ISI;
                    obj = c01491.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    cardIdGroup = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) obj2;
                    if (cardIdGroup == null) {
                        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardStateChange payPalCardStateChange = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardStateChange(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard(cardIdGroup.getPayPalCardId(), cardIdGroup.getDeviceWalletServiceCardId(), cardStateChange.getDigitizedCard(), (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection) null, (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo) null, 24, (kotlin.jvm.internal.DefaultConstructorMarker) null), cardStateChange.getType());
                        c01491.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                        c01491.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(c014912);
                        c01491.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardStateChange);
                        c01491.getInputSizeshNQ4ISI = flowCollector;
                        c01491.getOutputFormats = digitizedCard;
                        c01491.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardIdGroup);
                        c01491.getHighSpeedVideoFpsRanges = i2;
                        c01491.Camera2StreamConfigurationMap = 0;
                        c01491.getInputFormats = 2;
                    } else {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "No mapped card ID found", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardId", digitizedCard.getCardId())), null, 4, null);
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            c01491 = new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase$invoke$$inlined$transform$1.AnonymousClass1.C01491(continuation);
            java.lang.Object obj22 = c01491.getHighSpeedVideoSizesFor;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c01491.getInputFormats;
            if (i != 0) {
            }
            cardIdGroup = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) obj22;
            if (cardIdGroup == null) {
            }
            return kotlin.Unit.INSTANCE;
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase$invoke$$inlined$transform$1$1", f = "PayPalObserveCardStateUseCase.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {40, 41}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", "changed", "$this$invoke_u24lambda_u240", "card", "$i$a$-transform-PayPalObserveCardStateUseCase$invoke$1", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", "changed", "$this$invoke_u24lambda_u240", "card", "result", "$i$a$-transform-PayPalObserveCardStateUseCase$invoke$1", "$i$a$-let-PayPalObserveCardStateUseCase$invoke$1$1"}, nl = {41, 51}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1"}, v = 2)
        /* renamed from: com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase$invoke$$inlined$transform$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01491 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
            int Camera2StreamConfigurationMap;
            java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
            int getHighSpeedVideoFpsRanges;
            java.lang.Object getHighSpeedVideoFpsRangesFor;
            java.lang.Object getHighSpeedVideoSizes;
            /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
            int getInputFormats;
            java.lang.Object getInputSizeshNQ4ISI;
            java.lang.Object getOutputFormats;
            java.lang.Object getOutputMinFrameDuration;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                this.getHighSpeedVideoSizesFor = obj;
                this.getInputFormats |= Integer.MIN_VALUE;
                return com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase$invoke$$inlined$transform$1.AnonymousClass1.this.emit(null, this);
            }

            public C01491(kotlin.coroutines.Continuation continuation) {
                super(continuation);
            }
        }

        public AnonymousClass1(kotlinx.coroutines.flow.FlowCollector flowCollector, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase payPalObserveCardStateUseCase) {
            this.Camera2StreamConfigurationMap = payPalObserveCardStateUseCase;
            this.getHighSpeedVideoSizes = flowCollector;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
            this.getHighSpeedVideoSizes = 1;
            if (this.getHighSpeedVideoFpsRanges.collect(new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase$invoke$$inlined$transform$1.AnonymousClass1(flowCollector, this.getHighSpeedVideoFpsRangesFor), this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardStateChange> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase$invoke$$inlined$transform$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase$invoke$$inlined$transform$1 payPalObserveCardStateUseCase$invoke$$inlined$transform$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase$invoke$$inlined$transform$1(this.getHighSpeedVideoFpsRanges, continuation, this.getHighSpeedVideoFpsRangesFor);
        payPalObserveCardStateUseCase$invoke$$inlined$transform$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return payPalObserveCardStateUseCase$invoke$$inlined$transform$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayPalObserveCardStateUseCase$invoke$$inlined$transform$1(kotlinx.coroutines.flow.Flow flow, kotlin.coroutines.Continuation continuation, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase payPalObserveCardStateUseCase) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = flow;
        this.getHighSpeedVideoFpsRangesFor = payPalObserveCardStateUseCase;
    }
}
