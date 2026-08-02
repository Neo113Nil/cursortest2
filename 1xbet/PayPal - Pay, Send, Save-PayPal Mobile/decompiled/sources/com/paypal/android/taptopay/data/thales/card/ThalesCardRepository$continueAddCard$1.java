package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/paypal/android/taptopay/domain/model/card/AddCardState;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$continueAddCard$1", f = "ThalesCardRepository.kt", i = {}, l = {391, 399, 421}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class ThalesCardRepository$continueAddCard$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.paypal.android.taptopay.domain.model.card.AddCardState>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.android.taptopay.data.thales.card.ThalesCardRepository getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
    
        if (r12.send(new com.paypal.android.taptopay.domain.model.card.AddCardState.Failure.DefaultError("-1", "Invalid card enrollment state ".concat(java.lang.String.valueOf(r1))), r11) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$continueAddCard$1.AnonymousClass1(r12, r11.Camera2StreamConfigurationMap, null), r11) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a5, code lost:
    
        if (com.paypal.android.taptopay.data.thales.card.ThalesCardRepository.access$digitizeCard(r11.getHighSpeedVideoSizes, r12, null, r11) == r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoFpsRanges;
            com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "continue AddCard", null, null, 6, null);
            com.gemalto.mfs.mwsdk.provisioning.model.EnrollmentStatus isEnrolled = com.gemalto.mfs.mwsdk.provisioning.ProvisioningServiceManager.getEnrollingBusinessService().isEnrolled();
            com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "EnrollingBusinessService", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("isEnrolled", isEnrolled)), null, 4, null);
            int i2 = isEnrolled == null ? -1 : com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$continueAddCard$1.WhenMappings.$EnumSwitchMapping$0[isEnrolled.ordinal()];
            if (i2 == 1) {
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
            } else if (i2 == 2 || i2 == 3) {
                this.getHighResolutionOutputSizeshNQ4ISI = 2;
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI = 3;
            }
        } else {
            if (i != 1 && i != 2 && i != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$continueAddCard$1$1", f = "ThalesCardRepository.kt", i = {}, l = {400, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_PATH_ROTATE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$continueAddCard$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<com.paypal.android.taptopay.domain.model.card.AddCardState> Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
        java.lang.Object getHighSpeedVideoSizes;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0069, code lost:
        
            if (r7.Camera2StreamConfigurationMap.send(com.paypal.android.taptopay.domain.model.card.AddCardState.Failure.ContinueAddCardError.INSTANCE, r7) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
        
            if (r8 != r0) goto L14;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.String str = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoSizes = str;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$continueAddCard$1.AnonymousClass1 anonymousClass1 = this;
                kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(anonymousClass1));
                final kotlin.coroutines.SafeContinuation safeContinuation2 = safeContinuation;
                com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager.INSTANCE.getCardLifeCycleManager().deleteCard(str, new com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener() { // from class: com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$continueAddCard$1$1$1$1
                    @Override // com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener
                    public final void onSuccess(java.lang.String p0) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "onSuccess, Card deleted", null, null, 6, null);
                        kotlin.coroutines.Continuation<kotlin.Unit> continuation = safeContinuation2;
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        continuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE));
                    }

                    @Override // com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener
                    public final void onError(java.lang.String p0, com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError p1) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "onError, Card delete", null, null, 6, null);
                        kotlin.coroutines.Continuation<kotlin.Unit> continuation = safeContinuation2;
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        continuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE));
                    }
                });
                java.lang.Object orThrow = safeContinuation.getOrThrow();
                if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(anonymousClass1);
                }
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
            this.getHighSpeedVideoSizes = null;
            this.getHighResolutionOutputSizeshNQ4ISI = 2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$continueAddCard$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$continueAddCard$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.android.taptopay.domain.model.card.AddCardState> producerScope, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$continueAddCard$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = producerScope;
            this.getHighSpeedVideoFpsRanges = str;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.android.taptopay.domain.model.card.AddCardState> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$continueAddCard$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.gemalto.mfs.mwsdk.provisioning.model.EnrollmentStatus.values().length];
            try {
                iArr[com.gemalto.mfs.mwsdk.provisioning.model.EnrollmentStatus.ENROLLMENT_IN_PROGRESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.provisioning.model.EnrollmentStatus.ENROLLMENT_NEEDED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.provisioning.model.EnrollmentStatus.ENROLLMENT_COMPLETE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$continueAddCard$1 thalesCardRepository$continueAddCard$1 = new com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$continueAddCard$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
        thalesCardRepository$continueAddCard$1.getHighSpeedVideoFpsRanges = obj;
        return thalesCardRepository$continueAddCard$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThalesCardRepository$continueAddCard$1(com.paypal.android.taptopay.data.thales.card.ThalesCardRepository thalesCardRepository, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$continueAddCard$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = thalesCardRepository;
        this.Camera2StreamConfigurationMap = str;
    }
}
