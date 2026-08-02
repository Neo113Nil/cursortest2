package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler$invoke$1", f = "ActivationCodeRequestHandler.kt", i = {0, 1, 1}, l = {98, 121}, m = "invokeSuspend", n = {"$this$channelFlow", "$this$channelFlow", "e"}, nl = {117, 127}, s = {"L$0", "L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class ActivationCodeRequestHandler$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod> getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00af, code lost:
    
        if (r13.collect(new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler$invoke$1.AnonymousClass2(), r12) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d8, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d6, code lost:
    
        if (r0.send(new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.DigitizationFailed("Exception in callbackFlow collection during ActivationCodeRequestHandler", null, 2, null), r12) != r1) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        try {
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            com.paypal.oslo.feature.taptopay.LoggerKt.log.e("Exception in callbackFlow collection during ActivationCodeRequestHandler", e2);
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(e2);
            this.Camera2StreamConfigurationMap = 2;
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = kotlin.TuplesKt.to("networkTokenReference", this.getHighResolutionOutputSizeshNQ4ISI);
            java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod> list = this.getHighSpeedVideoFpsRangesFor;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod) it.next()).getClass()).getSimpleName());
            }
            pairArr[1] = kotlin.TuplesKt.to("authenticationMethods", arrayList);
            com.paypal.android.logger.Logger.d$default(logger, "Running ActivationCodeRequestHandler", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            kotlinx.coroutines.flow.Flow take = kotlinx.coroutines.flow.FlowKt.take(kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler$invoke$1$eventsFlow$1(producerScope, this.getHighSpeedVideoFpsRangesFor, null)), 1);
            final java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
            final com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler activationCodeRequestHandler = this.getHighSpeedVideoFpsRanges;
            this.getOutputMinFrameDuration = producerScope;
            this.Camera2StreamConfigurationMap = 1;
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
        return ((com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler$invoke$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler$invoke$1 activationCodeRequestHandler$invoke$1 = new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler$invoke$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
        activationCodeRequestHandler$invoke$1.getOutputMinFrameDuration = obj;
        return activationCodeRequestHandler$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ActivationCodeRequestHandler$invoke$1(java.lang.String str, java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod> list, com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler activationCodeRequestHandler, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler$invoke$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRangesFor = list;
        this.getHighSpeedVideoFpsRanges = activationCodeRequestHandler;
    }
}
