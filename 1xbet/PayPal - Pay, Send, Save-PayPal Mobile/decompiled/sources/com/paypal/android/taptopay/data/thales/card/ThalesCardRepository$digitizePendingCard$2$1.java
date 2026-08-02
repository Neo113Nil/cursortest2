package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$digitizePendingCard$2$1", f = "ThalesCardRepository.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {"awaitCard"}, s = {"L$0"})
/* loaded from: classes10.dex */
final class ThalesCardRepository$digitizePendingCard$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivation getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.android.taptopay.data.thales.card.ThalesCardRepository getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<com.paypal.android.taptopay.domain.model.card.AddCardState> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.coroutines.Continuation<kotlin.Unit> getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
    
        if (r1.await(r11) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Deferred async$default;
        com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase thalesDigitizeCardUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default((kotlinx.coroutines.CoroutineScope) this.getInputSizeshNQ4ISI, null, null, new com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$digitizePendingCard$2$1$awaitCard$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, null), 3, null);
            thalesDigitizeCardUseCase = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
            this.getInputSizeshNQ4ISI = async$default;
            this.Camera2StreamConfigurationMap = 1;
            if (thalesDigitizeCardUseCase.invoke(this.getHighResolutionOutputSizeshNQ4ISI).collect(new com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$digitizePendingCard$2$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, async$default), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.coroutines.Continuation<kotlin.Unit> continuation = this.getHighSpeedVideoSizes;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                continuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE));
                return kotlin.Unit.INSTANCE;
            }
            async$default = (kotlinx.coroutines.Deferred) this.getInputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.getInputSizeshNQ4ISI = null;
        this.Camera2StreamConfigurationMap = 2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardState;", "p0", "", "Camera2StreamConfigurationMap", "(Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$digitizePendingCard$2$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<com.paypal.android.taptopay.domain.model.card.AddCardState> $getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlinx.coroutines.Deferred<kotlin.Unit> $getHighSpeedVideoSizes;
        final /* synthetic */ com.paypal.android.taptopay.data.thales.card.ThalesCardRepository Camera2StreamConfigurationMap;

        /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState thalesDigitizeCardState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$digitizePendingCard$2$1$1$emit$1 thalesCardRepository$digitizePendingCard$2$1$1$emit$1;
            java.lang.Object obj;
            int i;
            com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$digitizePendingCard$2$1.AnonymousClass1<T> anonymousClass1;
            if (continuation instanceof com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$digitizePendingCard$2$1$1$emit$1) {
                thalesCardRepository$digitizePendingCard$2$1$1$emit$1 = (com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$digitizePendingCard$2$1$1$emit$1) continuation;
                if ((thalesCardRepository$digitizePendingCard$2$1$1$emit$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    thalesCardRepository$digitizePendingCard$2$1$1$emit$1.Camera2StreamConfigurationMap -= 2147483648;
                    obj = thalesCardRepository$digitizePendingCard$2$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = thalesCardRepository$digitizePendingCard$2$1$1$emit$1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.android.taptopay.data.thales.card.ThalesCardRepository thalesCardRepository = this.Camera2StreamConfigurationMap;
                        kotlinx.coroutines.channels.ProducerScope<com.paypal.android.taptopay.domain.model.card.AddCardState> producerScope = this.$getHighSpeedVideoFpsRangesFor;
                        thalesCardRepository$digitizePendingCard$2$1$1$emit$1.getHighSpeedVideoSizes = this;
                        thalesCardRepository$digitizePendingCard$2$1$1$emit$1.Camera2StreamConfigurationMap = 1;
                        obj = com.paypal.android.taptopay.data.thales.card.ThalesCardRepository.access$handleDigitizeCardState(thalesCardRepository, producerScope, thalesDigitizeCardState, thalesCardRepository$digitizePendingCard$2$1$1$emit$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        anonymousClass1 = this;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        anonymousClass1 = (com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$digitizePendingCard$2$1.AnonymousClass1) thalesCardRepository$digitizePendingCard$2$1$1$emit$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) anonymousClass1.$getHighSpeedVideoSizes, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            thalesCardRepository$digitizePendingCard$2$1$1$emit$1 = new com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$digitizePendingCard$2$1$1$emit$1(this, continuation);
            obj = thalesCardRepository$digitizePendingCard$2$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = thalesCardRepository$digitizePendingCard$2$1$1$emit$1.Camera2StreamConfigurationMap;
            if (i != 0) {
            }
            if (!((java.lang.Boolean) obj).booleanValue()) {
            }
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(com.paypal.android.taptopay.data.thales.card.ThalesCardRepository thalesCardRepository, kotlinx.coroutines.channels.ProducerScope<? super com.paypal.android.taptopay.domain.model.card.AddCardState> producerScope, kotlinx.coroutines.Deferred<kotlin.Unit> deferred) {
            this.Camera2StreamConfigurationMap = thalesCardRepository;
            this.$getHighSpeedVideoFpsRangesFor = producerScope;
            this.$getHighSpeedVideoSizes = deferred;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$digitizePendingCard$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$digitizePendingCard$2$1 thalesCardRepository$digitizePendingCard$2$1 = new com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$digitizePendingCard$2$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
        thalesCardRepository$digitizePendingCard$2$1.getInputSizeshNQ4ISI = obj;
        return thalesCardRepository$digitizePendingCard$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ThalesCardRepository$digitizePendingCard$2$1(com.paypal.android.taptopay.data.thales.card.ThalesCardRepository thalesCardRepository, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivation pendingCardActivation, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation, kotlinx.coroutines.channels.ProducerScope<? super com.paypal.android.taptopay.domain.model.card.AddCardState> producerScope, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$digitizePendingCard$2$1> continuation2) {
        super(2, continuation2);
        this.getHighSpeedVideoFpsRanges = thalesCardRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = pendingCardActivation;
        this.getHighSpeedVideoSizes = continuation;
        this.getHighSpeedVideoFpsRangesFor = producerScope;
    }
}
