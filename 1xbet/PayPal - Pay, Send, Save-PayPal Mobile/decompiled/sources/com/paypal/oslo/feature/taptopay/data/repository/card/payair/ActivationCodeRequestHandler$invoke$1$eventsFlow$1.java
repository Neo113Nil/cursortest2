package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/IdentityVerificationMethod;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler$invoke$1$eventsFlow$1", f = "ActivationCodeRequestHandler.kt", i = {0, 1}, l = {77, 94}, m = "invokeSuspend", n = {"$this$callbackFlow", "$this$callbackFlow"}, nl = {94, 95}, s = {"L$0", "L$0"}, v = 2)
/* loaded from: classes15.dex */
final class ActivationCodeRequestHandler$invoke$1$eventsFlow$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        if (kotlinx.coroutines.channels.ProduceKt.awaitClose(r0, new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler$invoke$1$eventsFlow$1$$ExternalSyntheticLambda0(), r7) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (r7.getHighSpeedVideoSizes.send(new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.SelectIdentityVerificationMethod(r7.getHighResolutionOutputSizeshNQ4ISI, new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler$invoke$1$eventsFlow$1.AnonymousClass1(r0, null)), r7) != r1) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = producerScope;
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
        this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
        this.getHighSpeedVideoFpsRanges = 2;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "method", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/IdentityVerificationMethod;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler$invoke$1$eventsFlow$1$1", f = "ActivationCodeRequestHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler$invoke$1$eventsFlow$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighResolutionOutputSizeshNQ4ISI;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod> getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod identityVerificationMethod = (com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod) this.getHighSpeedVideoFpsRanges;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "ActivationCodeRequestHandler onSelected", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("selectedIdentityVerificationMethod", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(identityVerificationMethod.getClass()).getSimpleName())), null, 4, null);
            this.getHighSpeedVideoSizes.mo9266trySendJP2dKIU(identityVerificationMethod);
            kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.getHighSpeedVideoSizes, null, 1, null);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod identityVerificationMethod, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler$invoke$1$eventsFlow$1.AnonymousClass1) create(identityVerificationMethod, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler$invoke$1$eventsFlow$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler$invoke$1$eventsFlow$1.AnonymousClass1(this.getHighSpeedVideoSizes, continuation);
            anonymousClass1.getHighSpeedVideoFpsRanges = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod> producerScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler$invoke$1$eventsFlow$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = producerScope;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler$invoke$1$eventsFlow$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler$invoke$1$eventsFlow$1 activationCodeRequestHandler$invoke$1$eventsFlow$1 = new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler$invoke$1$eventsFlow$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        activationCodeRequestHandler$invoke$1$eventsFlow$1.getHighSpeedVideoFpsRangesFor = obj;
        return activationCodeRequestHandler$invoke$1$eventsFlow$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ActivationCodeRequestHandler$invoke$1$eventsFlow$1(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope, java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.card.IdentityVerificationMethod> list, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler$invoke$1$eventsFlow$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = producerScope;
        this.getHighResolutionOutputSizeshNQ4ISI = list;
    }
}
