package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1$eventsFlow$1", f = "ActivationCodeSubmissionHandler.kt", i = {0}, l = {77}, m = "invokeSuspend", n = {"$this$callbackFlow"}, nl = {78}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class ActivationCodeSubmissionHandler$invoke$1$eventsFlow$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super java.lang.String>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1$eventsFlow$1$1", f = "ActivationCodeSubmissionHandler.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, nl = {76}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1$eventsFlow$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler Camera2StreamConfigurationMap;
        int getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<java.lang.String> getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRanges;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRanges = 1;
                if (this.getHighSpeedVideoSizes.send(new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.HandleOtpIdentityVerification(new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1$eventsFlow$1.AnonymousClass1.C01401(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, null)), this) == coroutine_suspended) {
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

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "otp", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1$eventsFlow$1$1$1", f = "ActivationCodeSubmissionHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
        /* renamed from: com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1$eventsFlow$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01401 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
            final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler getHighResolutionOutputSizeshNQ4ISI;
            final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<java.lang.String> getHighSpeedVideoFpsRangesFor;
            int getHighSpeedVideoSizes;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimer tokenizationTimer;
                java.lang.String str = (java.lang.String) this.Camera2StreamConfigurationMap;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.getHighSpeedVideoSizes == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    tokenizationTimer = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                    tokenizationTimer.resume("OTP entered");
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "OTP input received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("otp_length", kotlin.coroutines.jvm.internal.Boxing.boxInt(str.length()))), null, 4, null);
                    this.getHighSpeedVideoFpsRangesFor.mo9266trySendJP2dKIU(str);
                    return kotlin.Unit.INSTANCE;
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1$eventsFlow$1.AnonymousClass1.C01401) create(str, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1$eventsFlow$1.AnonymousClass1.C01401 c01401 = new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1$eventsFlow$1.AnonymousClass1.C01401(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
                c01401.Camera2StreamConfigurationMap = obj;
                return c01401;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C01401(com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler activationCodeSubmissionHandler, kotlinx.coroutines.channels.ProducerScope<? super java.lang.String> producerScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1$eventsFlow$1.AnonymousClass1.C01401> continuation) {
                super(2, continuation);
                this.getHighResolutionOutputSizeshNQ4ISI = activationCodeSubmissionHandler;
                this.getHighSpeedVideoFpsRangesFor = producerScope;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1$eventsFlow$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1$eventsFlow$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope, com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler activationCodeSubmissionHandler, kotlinx.coroutines.channels.ProducerScope<? super java.lang.String> producerScope2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1$eventsFlow$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = producerScope;
            this.Camera2StreamConfigurationMap = activationCodeSubmissionHandler;
            this.getHighSpeedVideoFpsRangesFor = producerScope2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1$eventsFlow$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, producerScope, null), 3, null);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
            this.getHighSpeedVideoSizes = 1;
            if (kotlinx.coroutines.channels.ProduceKt.awaitClose$default(producerScope, null, this, 1, null) == coroutine_suspended) {
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
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super java.lang.String> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1$eventsFlow$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1$eventsFlow$1 activationCodeSubmissionHandler$invoke$1$eventsFlow$1 = new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1$eventsFlow$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
        activationCodeSubmissionHandler$invoke$1$eventsFlow$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return activationCodeSubmissionHandler$invoke$1$eventsFlow$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ActivationCodeSubmissionHandler$invoke$1$eventsFlow$1(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope, com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler activationCodeSubmissionHandler, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeSubmissionHandler$invoke$1$eventsFlow$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = producerScope;
        this.getHighSpeedVideoFpsRanges = activationCodeSubmissionHandler;
    }
}
