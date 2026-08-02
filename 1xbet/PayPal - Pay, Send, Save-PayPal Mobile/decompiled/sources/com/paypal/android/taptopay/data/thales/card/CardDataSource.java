package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0080@¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00120\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R#\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00120\u00198\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Lcom/paypal/android/taptopay/data/thales/card/CardDataSource;", "", "Lcom/paypal/android/taptopay/data/thales/card/ThalesGetAllCardsUseCase;", "thalesGetAllCardsUseCase", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/paypal/android/taptopay/data/thales/card/ThalesGetAllCardsUseCase;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "cardId", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/android/taptopay/domain/model/card/DigitizedCard;", "observeCard", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "", "rehydrate$tap_to_pay_data_thales_release", "()V", "Lcom/paypal/android/taptopay/domain/Result;", "", "Lcom/paypal/android/taptopay/domain/model/card/GetAllCardsError;", "rehydrateSuspending$tap_to_pay_data_thales_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "cards", "Lkotlinx/coroutines/flow/StateFlow;", "getCards", "()Lkotlinx/coroutines/flow/StateFlow;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineDispatcher;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Lcom/paypal/android/taptopay/data/thales/card/ThalesGetAllCardsUseCase;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CardDataSource {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.data.thales.card.ThalesGetAllCardsUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.paypal.android.taptopay.domain.model.card.DigitizedCard>> cards;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.paypal.android.taptopay.domain.model.card.DigitizedCard>> getHighSpeedVideoFpsRanges;

    public CardDataSource(com.paypal.android.taptopay.data.thales.card.ThalesGetAllCardsUseCase thalesGetAllCardsUseCase, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thalesGetAllCardsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighResolutionOutputSizeshNQ4ISI = thalesGetAllCardsUseCase;
        this.getHighSpeedVideoSizes = coroutineDispatcher;
        kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.paypal.android.taptopay.domain.model.card.DigitizedCard>> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(kotlin.collections.CollectionsKt.emptyList());
        this.getHighSpeedVideoFpsRanges = MutableStateFlow;
        this.cards = MutableStateFlow;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(coroutineDispatcher), null, null, new com.paypal.android.taptopay.data.thales.card.CardDataSource.AnonymousClass1(null), 3, null);
    }

    public /* synthetic */ CardDataSource(com.paypal.android.taptopay.data.thales.card.ThalesGetAllCardsUseCase thalesGetAllCardsUseCase, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(thalesGetAllCardsUseCase, (i & 2) != 0 ? kotlinx.coroutines.Dispatchers.getIO() : coroutineDispatcher);
    }

    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.paypal.android.taptopay.domain.model.card.DigitizedCard>> getCards() {
        return this.cards;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.CardDataSource$1", f = "CardDataSource.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.paypal.android.taptopay.data.thales.card.CardDataSource$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRanges;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRanges = 1;
                if (com.paypal.android.taptopay.data.thales.card.CardDataSource.this.getHighSpeedVideoFpsRanges.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.android.taptopay.data.thales.card.CardDataSource.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                    public final java.lang.Object emit(java.util.List<com.paypal.android.taptopay.domain.model.card.DigitizedCard> list, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "cards flow update", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cards", list)), null, 4, null);
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
            return ((com.paypal.android.taptopay.data.thales.card.CardDataSource.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.paypal.android.taptopay.data.thales.card.CardDataSource.this.new AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.CardDataSource.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.domain.model.card.DigitizedCard> observeCard(final java.lang.String cardId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
        final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.paypal.android.taptopay.domain.model.card.DigitizedCard>> mutableStateFlow = this.getHighSpeedVideoFpsRanges;
        return new kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.domain.model.card.DigitizedCard>() { // from class: com.paypal.android.taptopay.data.thales.card.CardDataSource$observeCard$$inlined$map$1

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.paypal.android.taptopay.data.thales.card.CardDataSource$observeCard$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ java.lang.String $Camera2StreamConfigurationMap;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $getHighSpeedVideoSizes;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.android.taptopay.data.thales.card.CardDataSource$observeCard$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    T t;
                    if (continuation instanceof com.paypal.android.taptopay.data.thales.card.CardDataSource$observeCard$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.android.taptopay.data.thales.card.CardDataSource$observeCard$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.Camera2StreamConfigurationMap -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoFpsRanges;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.Camera2StreamConfigurationMap;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.$getHighSpeedVideoSizes;
                                java.util.Iterator<T> it = ((java.util.List) obj).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        t = (T) null;
                                        break;
                                    }
                                    t = it.next();
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.android.taptopay.domain.model.card.DigitizedCard) t).getCardId(), this.$Camera2StreamConfigurationMap)) {
                                        break;
                                    }
                                }
                                anonymousClass1.Camera2StreamConfigurationMap = 1;
                                if (flowCollector.emit(t, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.android.taptopay.data.thales.card.CardDataSource$observeCard$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.CardDataSource$observeCard$$inlined$map$1$2", f = "CardDataSource.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.paypal.android.taptopay.data.thales.card.CardDataSource$observeCard$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    int Camera2StreamConfigurationMap;
                    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighSpeedVideoFpsRanges = obj;
                        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
                        return com.paypal.android.taptopay.data.thales.card.CardDataSource$observeCard$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, java.lang.String str) {
                    this.$getHighSpeedVideoSizes = flowCollector;
                    this.$Camera2StreamConfigurationMap = str;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.android.taptopay.domain.model.card.DigitizedCard> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.android.taptopay.data.thales.card.CardDataSource$observeCard$$inlined$map$1.AnonymousClass2(flowCollector, cardId), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
    }

    public final void rehydrate$tap_to_pay_data_thales_release() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(this.getHighSpeedVideoSizes), null, null, new com.paypal.android.taptopay.data.thales.card.CardDataSource$rehydrate$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object rehydrateSuspending$tap_to_pay_data_thales_release(kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends java.util.List<com.paypal.android.taptopay.domain.model.card.DigitizedCard>, com.paypal.android.taptopay.domain.model.card.GetAllCardsError>> continuation) {
        com.paypal.android.taptopay.data.thales.card.CardDataSource$rehydrateSuspending$1 cardDataSource$rehydrateSuspending$1;
        int i;
        com.paypal.android.taptopay.data.thales.card.CardDataSource cardDataSource;
        com.paypal.android.taptopay.domain.Result result;
        if (continuation instanceof com.paypal.android.taptopay.data.thales.card.CardDataSource$rehydrateSuspending$1) {
            cardDataSource$rehydrateSuspending$1 = (com.paypal.android.taptopay.data.thales.card.CardDataSource$rehydrateSuspending$1) continuation;
            if ((cardDataSource$rehydrateSuspending$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                cardDataSource$rehydrateSuspending$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = cardDataSource$rehydrateSuspending$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cardDataSource$rehydrateSuspending$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Rehydrating cards", null, null, 6, null);
                    com.paypal.android.taptopay.data.thales.card.ThalesGetAllCardsUseCase thalesGetAllCardsUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                    cardDataSource$rehydrateSuspending$1.Camera2StreamConfigurationMap = this;
                    cardDataSource$rehydrateSuspending$1.getHighSpeedVideoFpsRanges = 1;
                    obj = thalesGetAllCardsUseCase.invoke(cardDataSource$rehydrateSuspending$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    cardDataSource = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cardDataSource = (com.paypal.android.taptopay.data.thales.card.CardDataSource) cardDataSource$rehydrateSuspending$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                result = (com.paypal.android.taptopay.domain.Result) obj;
                if (!(result instanceof com.paypal.android.taptopay.domain.Result.Success)) {
                    java.util.List<com.paypal.android.taptopay.domain.model.card.DigitizedCard> list = (java.util.List) ((com.paypal.android.taptopay.domain.Result.Success) result).getResult();
                    cardDataSource.getHighSpeedVideoFpsRanges.setValue(list);
                    return new com.paypal.android.taptopay.domain.Result.Success(list);
                }
                if (result instanceof com.paypal.android.taptopay.domain.Result.Failure) {
                    com.paypal.android.logger.Logger log = com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog();
                    com.paypal.android.taptopay.domain.Result.Failure failure = (com.paypal.android.taptopay.domain.Result.Failure) result;
                    com.paypal.android.taptopay.domain.model.card.GetAllCardsError getAllCardsError = (com.paypal.android.taptopay.domain.model.card.GetAllCardsError) failure.getError();
                    if (getAllCardsError instanceof com.paypal.android.taptopay.domain.model.card.GetAllCardsError.DefaultError) {
                        com.paypal.android.logger.Logger.d$default(log, "Failed to initialize _cards.", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.android.taptopay.domain.model.card.GetAllCardsError.DefaultError) getAllCardsError).getDebugMessage())), null, 4, null);
                        return new com.paypal.android.taptopay.domain.Result.Failure(failure.getError());
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        cardDataSource$rehydrateSuspending$1 = new com.paypal.android.taptopay.data.thales.card.CardDataSource$rehydrateSuspending$1(this, continuation);
        java.lang.Object obj2 = cardDataSource$rehydrateSuspending$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cardDataSource$rehydrateSuspending$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        result = (com.paypal.android.taptopay.domain.Result) obj2;
        if (!(result instanceof com.paypal.android.taptopay.domain.Result.Success)) {
        }
    }
}
