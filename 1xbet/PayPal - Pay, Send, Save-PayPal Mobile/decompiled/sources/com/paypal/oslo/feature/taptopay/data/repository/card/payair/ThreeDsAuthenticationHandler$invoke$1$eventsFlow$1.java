package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$ThreeDsEvent;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler$invoke$1$eventsFlow$1", f = "ThreeDsAuthenticationHandler.kt", i = {0}, l = {88}, m = "invokeSuspend", n = {"$this$callbackFlow"}, nl = {89}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class ThreeDsAuthenticationHandler$invoke$1$eventsFlow$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler$invoke$1$eventsFlow$1$1", f = "ThreeDsAuthenticationHandler.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, nl = {87}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler$invoke$1$eventsFlow$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent> Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (this.getHighSpeedVideoSizes.send(new com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.Handle3dsVerification(new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler$invoke$1$eventsFlow$1.AnonymousClass1.C01431(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, null)), this) == coroutine_suspended) {
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

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "threeDsAuth", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/AddCardState$ThreeDsEvent;"}, k = 3, mv = {2, 3, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler$invoke$1$eventsFlow$1$1$1", f = "ThreeDsAuthenticationHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
        /* renamed from: com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler$invoke$1$eventsFlow$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01431 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            int Camera2StreamConfigurationMap;
            final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler getHighResolutionOutputSizeshNQ4ISI;
            final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent> getHighSpeedVideoFpsRangesFor;
            /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                com.paypal.oslo.feature.taptopay.data.repository.card.payair.TokenizationTimer tokenizationTimer;
                java.lang.String str;
                com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent threeDsEvent = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent) this.getHighSpeedVideoSizes;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.Camera2StreamConfigurationMap == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    tokenizationTimer = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
                    tokenizationTimer.resume("3DS authentication evidence received");
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
                    if (threeDsEvent instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent.Success) {
                        str = "success";
                    } else {
                        if (!(threeDsEvent instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent.Error)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        str = "error";
                    }
                    com.paypal.android.logger.Logger.d$default(logger, "3DS auth received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("threeDsEventType", str)), null, 4, null);
                    this.getHighSpeedVideoFpsRangesFor.mo9266trySendJP2dKIU(threeDsEvent);
                    return kotlin.Unit.INSTANCE;
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent threeDsEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler$invoke$1$eventsFlow$1.AnonymousClass1.C01431) create(threeDsEvent, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler$invoke$1$eventsFlow$1.AnonymousClass1.C01431 c01431 = new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler$invoke$1$eventsFlow$1.AnonymousClass1.C01431(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
                c01431.getHighSpeedVideoSizes = obj;
                return c01431;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C01431(com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler threeDsAuthenticationHandler, kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent> producerScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler$invoke$1$eventsFlow$1.AnonymousClass1.C01431> continuation) {
                super(2, continuation);
                this.getHighResolutionOutputSizeshNQ4ISI = threeDsAuthenticationHandler;
                this.getHighSpeedVideoFpsRangesFor = producerScope;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler$invoke$1$eventsFlow$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler$invoke$1$eventsFlow$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope, com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler threeDsAuthenticationHandler, kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent> producerScope2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler$invoke$1$eventsFlow$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = producerScope;
            this.getHighResolutionOutputSizeshNQ4ISI = threeDsAuthenticationHandler;
            this.Camera2StreamConfigurationMap = producerScope2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler$invoke$1$eventsFlow$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, producerScope, null), 3, null);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
            this.getHighSpeedVideoFpsRanges = 1;
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
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.ThreeDsEvent> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler$invoke$1$eventsFlow$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler$invoke$1$eventsFlow$1 threeDsAuthenticationHandler$invoke$1$eventsFlow$1 = new com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler$invoke$1$eventsFlow$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
        threeDsAuthenticationHandler$invoke$1$eventsFlow$1.Camera2StreamConfigurationMap = obj;
        return threeDsAuthenticationHandler$invoke$1$eventsFlow$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ThreeDsAuthenticationHandler$invoke$1$eventsFlow$1(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState> producerScope, com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler threeDsAuthenticationHandler, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler$invoke$1$eventsFlow$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = producerScope;
        this.getHighSpeedVideoFpsRangesFor = threeDsAuthenticationHandler;
    }
}
