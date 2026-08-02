package com.paypal.oslo.feature.taptopay.data.payair.card;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0082@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00178\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/payair/card/CardStateDataSource;", "", "Lcom/paypal/oslo/feature/taptopay/data/payair/csdk/SdkTokenManager;", "tokenManager", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/paypal/oslo/feature/taptopay/data/payair/csdk/SdkTokenManager;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard;", "p0", "", "Camera2StreamConfigurationMap", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/data/payair/csdk/SdkTokenManager;", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/CardStateChange;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "cardStateChange", "Lkotlinx/coroutines/flow/SharedFlow;", "getCardStateChange", "()Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/sync/Mutex;", "getHighResolutionOutputSizeshNQ4ISI", "", "Ljava/util/Set;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CardStateDataSource {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.sync.Mutex getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange> cardStateChange;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.util.Set<com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange> getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public CardStateDataSource(com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager sdkTokenManager, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkTokenManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoFpsRangesFor = sdkTokenManager;
        kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
        this.getHighSpeedVideoFpsRanges = CoroutineScope;
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.getHighSpeedVideoSizes = MutableSharedFlow$default;
        this.cardStateChange = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
        this.Camera2StreamConfigurationMap = kotlin.collections.CollectionsKt.toSet(sdkTokenManager.cards().getValue());
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource.AnonymousClass1(null), 3, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource.AnonymousClass2(null), 3, null);
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange> getCardStateChange() {
        return this.cardStateChange;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource$1", f = "CardStateDataSource.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource.this.getHighSpeedVideoSizes.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "CardStateChange event", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("change", ((com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange) obj2).getType())), null, 4, null);
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
            return ((com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource.this.new AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource$2", f = "CardStateDataSource.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRanges;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.StateFlow<java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard>> cards = com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource.this.getHighSpeedVideoFpsRangesFor.cards();
                final com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource cardStateDataSource = com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource.this;
                this.getHighSpeedVideoFpsRanges = 1;
                if (cards.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                        java.lang.Object Camera2StreamConfigurationMap = com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource.this.Camera2StreamConfigurationMap((java.util.List) obj2, continuation);
                        return Camera2StreamConfigurationMap == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? Camera2StreamConfigurationMap : kotlin.Unit.INSTANCE;
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
            return ((com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource.this.new AnonymousClass2(continuation);
        }

        AnonymousClass2(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource.AnonymousClass2> continuation) {
            super(2, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b2 A[Catch: all -> 0x031a, LOOP:0: B:12:0x00ac->B:14:0x00b2, LOOP_END, TryCatch #0 {all -> 0x031a, blocks: (B:11:0x005a, B:12:0x00ac, B:14:0x00b2, B:16:0x00c1, B:17:0x00c8, B:20:0x00d0, B:28:0x00e4, B:50:0x010b, B:52:0x0113, B:79:0x011b, B:55:0x0144, B:57:0x014c, B:75:0x0154, B:60:0x017e, B:62:0x0186, B:64:0x018e, B:70:0x0196, B:67:0x01c0, B:31:0x01ed, B:41:0x01f7, B:47:0x01fd, B:44:0x0231, B:34:0x0266, B:37:0x026c, B:24:0x0279, B:83:0x0298, B:84:0x02a0, B:86:0x02a6, B:88:0x02b3, B:91:0x02db, B:94:0x02bc, B:95:0x02c0, B:97:0x02c6, B:105:0x030c), top: B:10:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d0 A[Catch: all -> 0x031a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x031a, blocks: (B:11:0x005a, B:12:0x00ac, B:14:0x00b2, B:16:0x00c1, B:17:0x00c8, B:20:0x00d0, B:28:0x00e4, B:50:0x010b, B:52:0x0113, B:79:0x011b, B:55:0x0144, B:57:0x014c, B:75:0x0154, B:60:0x017e, B:62:0x0186, B:64:0x018e, B:70:0x0196, B:67:0x01c0, B:31:0x01ed, B:41:0x01f7, B:47:0x01fd, B:44:0x0231, B:34:0x0266, B:37:0x026c, B:24:0x0279, B:83:0x0298, B:84:0x02a0, B:86:0x02a6, B:88:0x02b3, B:91:0x02db, B:94:0x02bc, B:95:0x02c0, B:97:0x02c6, B:105:0x030c), top: B:10:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02a6 A[Catch: all -> 0x031a, TryCatch #0 {all -> 0x031a, blocks: (B:11:0x005a, B:12:0x00ac, B:14:0x00b2, B:16:0x00c1, B:17:0x00c8, B:20:0x00d0, B:28:0x00e4, B:50:0x010b, B:52:0x0113, B:79:0x011b, B:55:0x0144, B:57:0x014c, B:75:0x0154, B:60:0x017e, B:62:0x0186, B:64:0x018e, B:70:0x0196, B:67:0x01c0, B:31:0x01ed, B:41:0x01f7, B:47:0x01fd, B:44:0x0231, B:34:0x0266, B:37:0x026c, B:24:0x0279, B:83:0x0298, B:84:0x02a0, B:86:0x02a6, B:88:0x02b3, B:91:0x02db, B:94:0x02bc, B:95:0x02c0, B:97:0x02c6, B:105:0x030c), top: B:10:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard> list, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource$updateStateChange$1 cardStateDataSource$updateStateChange$1;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard> list2;
        try {
            if (continuation instanceof com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource$updateStateChange$1) {
                cardStateDataSource$updateStateChange$1 = (com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource$updateStateChange$1) continuation;
                if ((cardStateDataSource$updateStateChange$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    cardStateDataSource$updateStateChange$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = cardStateDataSource$updateStateChange$1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = cardStateDataSource$updateStateChange$1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex mutex2 = this.getHighResolutionOutputSizeshNQ4ISI;
                        cardStateDataSource$updateStateChange$1.Camera2StreamConfigurationMap = list;
                        cardStateDataSource$updateStateChange$1.getHighSpeedVideoSizes = mutex2;
                        cardStateDataSource$updateStateChange$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        cardStateDataSource$updateStateChange$1.getHighSpeedVideoFpsRanges = 1;
                        if (mutex2.lock(null, cardStateDataSource$updateStateChange$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                        list2 = list;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = cardStateDataSource$updateStateChange$1.getHighResolutionOutputSizeshNQ4ISI;
                        mutex = (kotlinx.coroutines.sync.Mutex) cardStateDataSource$updateStateChange$1.getHighSpeedVideoSizes;
                        list2 = (java.util.List) cardStateDataSource$updateStateChange$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Detecting cards state changes", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("currentCardsCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(this.Camera2StreamConfigurationMap.size())), kotlin.TuplesKt.to("updatedCardsCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(list2.size()))), null, 4, null);
                    java.util.Set<com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard> set = this.Camera2StreamConfigurationMap;
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set, 10)), 16));
                    for (java.lang.Object obj2 : set) {
                        linkedHashMap.put(((com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) obj2).getCardId(), obj2);
                    }
                    for (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard : list2) {
                        com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard2 = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) linkedHashMap.get(digitizedCard.getCardId());
                        if (digitizedCard2 == null) {
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "New card added", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardStatus", digitizedCard.getStatus().toString())), null, 4, null);
                        } else {
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Handling existing card changes", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardStatus", digitizedCard.getStatus().toString())), null, 4, null);
                            if (digitizedCard2.getStatus() == digitizedCard.getStatus()) {
                                if (digitizedCard2.isDefault() == digitizedCard.isDefault()) {
                                    if (!kotlin.jvm.internal.Intrinsics.areEqual(digitizedCard2, digitizedCard)) {
                                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Unhandled potential card state change", null, null, 6, null);
                                    }
                                } else if (digitizedCard.isDefault()) {
                                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "A card was set as being the default one. Emitting DEFAULT lifecycle change", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardId", digitizedCard.getCardId())), 2, null);
                                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRanges, null, null, new com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource$emit$1(this, new com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange(digitizedCard, com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange.Type.DEFAULT), null), 3, null);
                                } else {
                                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "A card was unset as being the default one. Emitting NOT_DEFAULT lifecycle change", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardId", digitizedCard.getCardId())), 2, null);
                                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRanges, null, null, new com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource$emit$1(this, new com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange(digitizedCard, com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange.Type.NOT_DEFAULT), null), 3, null);
                                }
                            } else if (digitizedCard.getStatus() == com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.Suspended && digitizedCard2.getStatus() == com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.Active) {
                                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "A card was suspended. Emitting SUSPENDED lifecycle change", null, null, 6, null);
                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRanges, null, null, new com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource$emit$1(this, new com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange(digitizedCard, com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange.Type.SUSPENDED), null), 3, null);
                            } else if (digitizedCard.getStatus() == com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.Active && digitizedCard2.getStatus() == com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.Suspended) {
                                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "A card was activated. Emitting RESUMED lifecycle change", null, null, 6, null);
                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRanges, null, null, new com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource$emit$1(this, new com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange(digitizedCard, com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange.Type.RESUMED), null), 3, null);
                            } else if (digitizedCard.getStatus() == com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.Active && (digitizedCard2.getStatus() == com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.Unknown || digitizedCard2.getStatus() == com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.PendingActivation)) {
                                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "A card was provisioned. Emitting PROVISIONED lifecycle change", null, null, 6, null);
                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRanges, null, null, new com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource$emit$1(this, new com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange(digitizedCard, com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange.Type.PROVISIONED), null), 3, null);
                            } else {
                                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Unhandled card status change", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("from", digitizedCard2.getStatus()), kotlin.TuplesKt.to(androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, digitizedCard.getStatus())), null, 4, null);
                            }
                        }
                    }
                    for (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard3 : this.Camera2StreamConfigurationMap) {
                        java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard> list3 = list2;
                        if (!(list3 instanceof java.util.Collection) || !list3.isEmpty()) {
                            java.util.Iterator<T> it = list3.iterator();
                            while (it.hasNext()) {
                                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) it.next()).getCardId(), digitizedCard3.getCardId())) {
                                    break;
                                }
                            }
                        }
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "A card was removed. Emitting DELETED lifecycle change", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardId", digitizedCard3.getCardId())), 2, null);
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRanges, null, null, new com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource$emit$1(this, new com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange(digitizedCard3, com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange.Type.DELETED), null), 3, null);
                    }
                    this.Camera2StreamConfigurationMap = kotlin.collections.CollectionsKt.toSet(list2);
                    return kotlin.Unit.INSTANCE;
                }
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Detecting cards state changes", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("currentCardsCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(this.Camera2StreamConfigurationMap.size())), kotlin.TuplesKt.to("updatedCardsCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(list2.size()))), null, 4, null);
            java.util.Set<com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard> set2 = this.Camera2StreamConfigurationMap;
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set2, 10)), 16));
            while (r4.hasNext()) {
            }
            while (r4.hasNext()) {
            }
            while (r0.hasNext()) {
            }
            this.Camera2StreamConfigurationMap = kotlin.collections.CollectionsKt.toSet(list2);
            return kotlin.Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
        cardStateDataSource$updateStateChange$1 = new com.paypal.oslo.feature.taptopay.data.payair.card.CardStateDataSource$updateStateChange$1(this, continuation);
        java.lang.Object obj3 = cardStateDataSource$updateStateChange$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cardStateDataSource$updateStateChange$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
    }
}
