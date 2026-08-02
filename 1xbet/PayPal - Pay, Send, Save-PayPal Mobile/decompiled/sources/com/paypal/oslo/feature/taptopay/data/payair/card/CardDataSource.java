package com.paypal.oslo.feature.taptopay.data.payair.card;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\u0011H\u0080@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR#\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\u001f8\u0007¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/payair/card/CardDataSource;", "", "Lcom/paypal/oslo/feature/taptopay/data/payair/csdk/SdkTokenManager;", "tokenManager", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/paypal/oslo/feature/taptopay/data/payair/csdk/SdkTokenManager;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "cardId", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard;", "observeCard", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "", "rehydrate$taptopay_prodRelease", "()V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/GetAllCardsError;", "", "rehydrateSuspending$taptopay_prodRelease", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/data/payair/csdk/SdkTokenManager;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "cards", "Lkotlinx/coroutines/flow/StateFlow;", "getCards", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CardDataSource {
    public static final int $stable = 8;
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard>> cards;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard>> getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public CardDataSource(com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager sdkTokenManager, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkTokenManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoSizes = sdkTokenManager;
        kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
        this.getHighSpeedVideoFpsRanges = CoroutineScope;
        kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard>> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(kotlin.collections.CollectionsKt.emptyList());
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow;
        this.cards = MutableStateFlow;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource.AnonymousClass1(null), 3, null);
    }

    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard>> getCards() {
        return this.cards;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource$1", f = "CardDataSource.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRanges;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRanges = 1;
                if (com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource.this.getHighResolutionOutputSizeshNQ4ISI.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "cards flow update", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(((java.util.List) obj2).size()))), null, 4, null);
                        return kotlin.Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource.this.new AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard> observeCard(final java.lang.String cardId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
        final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard>> mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI;
        return new kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard>() { // from class: com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource$observeCard$$inlined$map$1

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource$observeCard$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource$observeCard$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    T t;
                    if (continuation instanceof com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource$observeCard$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource$observeCard$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighSpeedVideoSizesFor -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getOutputMinFrameDuration;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighSpeedVideoSizesFor;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighResolutionOutputSizeshNQ4ISI;
                                java.util.Iterator<T> it = ((java.util.List) obj).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        t = (T) null;
                                        break;
                                    }
                                    t = it.next();
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) t).getCardId(), this.getHighSpeedVideoSizes)) {
                                        break;
                                    }
                                }
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighSpeedVideoSizes = 0;
                                anonymousClass1.getHighSpeedVideoSizesFor = 1;
                                if (flowCollector.emit(t, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighSpeedVideoSizes;
                                java.lang.Object obj3 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource$observeCard$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getOutputMinFrameDuration;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighSpeedVideoSizesFor;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource$observeCard$$inlined$map$1$2", f = "CardDataSource.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource$observeCard$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    int getHighSpeedVideoSizes;
                    int getHighSpeedVideoSizesFor;
                    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getOutputMinFrameDuration = obj;
                        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
                        return com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource$observeCard$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, java.lang.String str) {
                    this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
                    this.getHighSpeedVideoSizes = str;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource$observeCard$$inlined$map$1.AnonymousClass2(flowCollector, cardId), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
    }

    public final void rehydrate$taptopay_prodRelease() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRanges, null, null, new com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource$rehydrate$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object rehydrateSuspending$taptopay_prodRelease(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.GetAllCardsError, ? extends java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard>>> continuation) {
        com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource$rehydrateSuspending$1 cardDataSource$rehydrateSuspending$1;
        int i;
        try {
            if (continuation instanceof com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource$rehydrateSuspending$1) {
                cardDataSource$rehydrateSuspending$1 = (com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource$rehydrateSuspending$1) continuation;
                if ((cardDataSource$rehydrateSuspending$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    cardDataSource$rehydrateSuspending$1.getHighSpeedVideoSizes -= 2147483648;
                    java.lang.Object obj = cardDataSource$rehydrateSuspending$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = cardDataSource$rehydrateSuspending$1.getHighSpeedVideoSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Rehydrating cards", null, null, 6, null);
                        com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager sdkTokenManager = this.getHighSpeedVideoSizes;
                        cardDataSource$rehydrateSuspending$1.getHighSpeedVideoSizes = 1;
                        obj = sdkTokenManager.getCards(cardDataSource$rehydrateSuspending$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard> list = (java.util.List) obj;
                    this.getHighResolutionOutputSizeshNQ4ISI.setValue(list);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Cards rehydrated successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(list.size()))), null, 4, null);
                    return arrow.core.EitherKt.right(list);
                }
            }
            if (i != 0) {
            }
            java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard> list2 = (java.util.List) obj;
            this.getHighResolutionOutputSizeshNQ4ISI.setValue(list2);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Cards rehydrated successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(list2.size()))), null, 4, null);
            return arrow.core.EitherKt.right(list2);
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
            java.lang.String message = e.getMessage();
            java.lang.String str = com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR;
            if (message == null) {
                message = com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR;
            }
            com.paypal.android.logger.Logger.d$default(logger, "Failed to initialize _cards.", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", message)), null, 4, null);
            java.lang.String message2 = e.getMessage();
            if (message2 != null) {
                str = message2;
            }
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.card.GetAllCardsError.DefaultError(str, null, 2, null));
        }
        cardDataSource$rehydrateSuspending$1 = new com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource$rehydrateSuspending$1(this, continuation);
        java.lang.Object obj2 = cardDataSource$rehydrateSuspending$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cardDataSource$rehydrateSuspending$1.getHighSpeedVideoSizes;
    }
}
