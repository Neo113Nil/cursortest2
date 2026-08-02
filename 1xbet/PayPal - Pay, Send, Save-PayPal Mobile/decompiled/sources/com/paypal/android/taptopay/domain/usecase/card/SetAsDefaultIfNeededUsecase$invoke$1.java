package com.paypal.android.taptopay.domain.usecase.card;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/paypal/android/taptopay/domain/model/card/AddCardState;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase$invoke$1", f = "SetAsDefaultIfNeededUsecase.kt", i = {2}, l = {55, 55, 57, 58}, m = "invokeSuspend", n = {"$this$channelFlow"}, s = {"L$0"})
/* loaded from: classes10.dex */
final class SetAsDefaultIfNeededUsecase$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.paypal.android.taptopay.domain.model.card.AddCardState>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.android.taptopay.domain.model.card.SetAsDefault getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.android.taptopay.domain.model.card.AddCardState.Success.CardActivated getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d6, code lost:
    
        if (r1.send(r13.getHighSpeedVideoSizes, r13) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a0, code lost:
    
        if (r1.send(r14, r13) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
    
        if (r14 != r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c7, code lost:
    
        if (r1.send(new com.paypal.android.taptopay.domain.model.card.AddCardState.SetDefaultCardSkipped("Card not active; status = ".concat(java.lang.String.valueOf(r13.getHighSpeedVideoSizes.getCard().getStatus()))), r13) != r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ProducerScope producerScope;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoFpsRangesFor;
            com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.domain.logging.LoggerKt.getLog(), "Running SetAsDefaultIfNeeded use case", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitizedCardId", this.getHighSpeedVideoSizes.getCard().getCardId()), kotlin.TuplesKt.to("setAsDefault", this.getHighSpeedVideoFpsRanges.getClass().getSimpleName())), null, 4, null);
            if (this.getHighSpeedVideoSizes.getCard().getStatus() == com.paypal.android.taptopay.domain.model.card.DigitizedCard.Status.Active) {
                this.getHighSpeedVideoFpsRangesFor = producerScope;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                obj = com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase.access$setAsDefaultIfNeeded(this.Camera2StreamConfigurationMap, producerScope, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this);
            } else {
                this.getHighSpeedVideoFpsRangesFor = producerScope;
                this.getHighResolutionOutputSizeshNQ4ISI = 3;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getHighSpeedVideoFpsRangesFor = null;
                    this.getHighResolutionOutputSizeshNQ4ISI = 4;
                } else if (i != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoFpsRangesFor;
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighResolutionOutputSizeshNQ4ISI = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.android.taptopay.domain.model.card.AddCardState> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase$invoke$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase$invoke$1 setAsDefaultIfNeededUsecase$invoke$1 = new com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase$invoke$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
        setAsDefaultIfNeededUsecase$invoke$1.getHighSpeedVideoFpsRangesFor = obj;
        return setAsDefaultIfNeededUsecase$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SetAsDefaultIfNeededUsecase$invoke$1(com.paypal.android.taptopay.domain.model.card.AddCardState.Success.CardActivated cardActivated, com.paypal.android.taptopay.domain.model.card.SetAsDefault setAsDefault, com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase setAsDefaultIfNeededUsecase, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.usecase.card.SetAsDefaultIfNeededUsecase$invoke$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = cardActivated;
        this.getHighSpeedVideoFpsRanges = setAsDefault;
        this.Camera2StreamConfigurationMap = setAsDefaultIfNeededUsecase;
    }
}
