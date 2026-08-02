package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler$invoke$1", f = "ThreeDsAuthenticationHandler.kt", i = {0, 1, 1}, l = {92, 126}, m = "invokeSuspend", n = {"$this$channelFlow", "$this$channelFlow", "e"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 128}, s = {"L$0", "L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class ThreeDsAuthenticationHandler$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r9.collect(new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler$invoke$1.AnonymousClass1(), r8) == r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0079, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if (r0.send(new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DigitizationFailed("Failed to send 3DS activation code", null, 2, null), r8) != r1) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        try {
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            com.paypal.oslo.feature.taptopay.LoggerKt.log.e("ThreeDsAuthenticationHandler: Exception while sending activation code", e2);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(e2);
            this.getHighSpeedVideoFpsRanges = 2;
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow callbackFlow = kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler$invoke$1$eventsFlow$1(producerScope, this.Camera2StreamConfigurationMap, null));
            final java.lang.String str = this.getHighSpeedVideoSizes;
            final com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler threeDsAuthenticationHandler = this.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = producerScope;
            this.getHighSpeedVideoFpsRanges = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler$invoke$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler$invoke$1 threeDsAuthenticationHandler$invoke$1 = new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler$invoke$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
        threeDsAuthenticationHandler$invoke$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return threeDsAuthenticationHandler$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThreeDsAuthenticationHandler$invoke$1(com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler threeDsAuthenticationHandler, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler$invoke$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = threeDsAuthenticationHandler;
        this.getHighSpeedVideoSizes = str;
    }
}
