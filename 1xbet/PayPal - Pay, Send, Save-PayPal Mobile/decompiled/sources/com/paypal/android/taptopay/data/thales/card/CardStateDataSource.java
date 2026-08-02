package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/card/CardStateDataSource;", "", "Lcom/paypal/android/taptopay/data/thales/card/CardDataSource;", "cardDataSource", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/paypal/android/taptopay/data/thales/card/CardDataSource;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/android/taptopay/domain/model/card/CardStateChange;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Camera2StreamConfigurationMap", "Lcom/paypal/android/taptopay/data/thales/card/CardDataSource;", "Lkotlinx/coroutines/flow/SharedFlow;", "cardStateChange", "Lkotlinx/coroutines/flow/SharedFlow;", "getCardStateChange", "()Lkotlinx/coroutines/flow/SharedFlow;", "", "Lcom/paypal/android/taptopay/domain/model/card/DigitizedCard;", "getHighSpeedVideoFpsRanges", "Ljava/util/Set;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/CoroutineDispatcher;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CardStateDataSource {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.data.thales.card.CardDataSource getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.android.taptopay.domain.model.card.CardStateChange> cardStateChange;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.android.taptopay.domain.model.card.CardStateChange> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private java.util.Set<com.paypal.android.taptopay.domain.model.card.DigitizedCard> getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoSizes;

    public CardStateDataSource(com.paypal.android.taptopay.data.thales.card.CardDataSource cardDataSource, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighResolutionOutputSizeshNQ4ISI = cardDataSource;
        this.getHighSpeedVideoSizes = coroutineDispatcher;
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.android.taptopay.domain.model.card.CardStateChange> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.Camera2StreamConfigurationMap = MutableSharedFlow$default;
        this.cardStateChange = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
        this.getHighSpeedVideoFpsRangesFor = kotlin.collections.CollectionsKt.toSet(cardDataSource.getCards().getValue());
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher2 = coroutineDispatcher;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(coroutineDispatcher2), null, null, new com.paypal.android.taptopay.data.thales.card.CardStateDataSource.AnonymousClass1(null), 3, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(coroutineDispatcher2), null, null, new com.paypal.android.taptopay.data.thales.card.CardStateDataSource.AnonymousClass2(null), 3, null);
    }

    public /* synthetic */ CardStateDataSource(com.paypal.android.taptopay.data.thales.card.CardDataSource cardDataSource, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(cardDataSource, (i & 2) != 0 ? kotlinx.coroutines.Dispatchers.getIO() : coroutineDispatcher);
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.android.taptopay.domain.model.card.CardStateChange> getCardStateChange() {
        return this.cardStateChange;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.CardStateDataSource$1", f = "CardStateDataSource.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.paypal.android.taptopay.data.thales.card.CardStateDataSource$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighResolutionOutputSizeshNQ4ISI;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                if (com.paypal.android.taptopay.data.thales.card.CardStateDataSource.this.Camera2StreamConfigurationMap.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.android.taptopay.data.thales.card.CardStateDataSource.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                    public final java.lang.Object emit(com.paypal.android.taptopay.domain.model.card.CardStateChange cardStateChange, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "CardStateChange event", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("card", cardStateChange.getDigitizedCard()), kotlin.TuplesKt.to("change", cardStateChange.getType())), null, 4, null);
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
            return ((com.paypal.android.taptopay.data.thales.card.CardStateDataSource.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.paypal.android.taptopay.data.thales.card.CardStateDataSource.this.new AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.CardStateDataSource.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.CardStateDataSource$2", f = "CardStateDataSource.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.paypal.android.taptopay.data.thales.card.CardStateDataSource$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRanges;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.StateFlow<java.util.List<com.paypal.android.taptopay.domain.model.card.DigitizedCard>> cards = com.paypal.android.taptopay.data.thales.card.CardStateDataSource.this.getHighResolutionOutputSizeshNQ4ISI.getCards();
                final com.paypal.android.taptopay.data.thales.card.CardStateDataSource cardStateDataSource = com.paypal.android.taptopay.data.thales.card.CardStateDataSource.this;
                this.getHighSpeedVideoFpsRanges = 1;
                if (cards.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.android.taptopay.data.thales.card.CardStateDataSource.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public final java.lang.Object emit(java.util.List<com.paypal.android.taptopay.domain.model.card.DigitizedCard> list, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        com.paypal.android.taptopay.data.thales.card.CardStateDataSource.access$updateStateChange(com.paypal.android.taptopay.data.thales.card.CardStateDataSource.this, list);
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
            return ((com.paypal.android.taptopay.data.thales.card.CardStateDataSource.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.paypal.android.taptopay.data.thales.card.CardStateDataSource.this.new AnonymousClass2(continuation);
        }

        AnonymousClass2(kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.CardStateDataSource.AnonymousClass2> continuation) {
            super(2, continuation);
        }
    }

    public static final /* synthetic */ void access$updateStateChange(com.paypal.android.taptopay.data.thales.card.CardStateDataSource cardStateDataSource, java.util.List list) {
        java.lang.Object obj;
        java.lang.Object obj2;
        kotlin.Unit unit;
        com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Detecting cards state changes", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("currentCards", cardStateDataSource.getHighSpeedVideoFpsRangesFor), kotlin.TuplesKt.to("updatedCards", list)), null, 4, null);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.paypal.android.taptopay.domain.model.card.DigitizedCard digitizedCard = (com.paypal.android.taptopay.domain.model.card.DigitizedCard) it.next();
            java.util.Iterator<T> it2 = cardStateDataSource.getHighSpeedVideoFpsRangesFor.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.android.taptopay.domain.model.card.DigitizedCard) obj2).getCardId(), digitizedCard.getCardId())) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            com.paypal.android.taptopay.domain.model.card.DigitizedCard digitizedCard2 = (com.paypal.android.taptopay.domain.model.card.DigitizedCard) obj2;
            if (digitizedCard2 != null) {
                if (digitizedCard2.getStatus() != digitizedCard.getStatus()) {
                    if (digitizedCard.getStatus() == com.paypal.android.taptopay.domain.model.card.DigitizedCard.Status.Suspended && digitizedCard2.getStatus() == com.paypal.android.taptopay.domain.model.card.DigitizedCard.Status.Active) {
                        com.paypal.android.logger.Logger.i$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "A card was suspended. Emitting SUSPENDED lifecycle change", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("card", digitizedCard)), null, 4, null);
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(cardStateDataSource.getHighSpeedVideoSizes), null, null, new com.paypal.android.taptopay.data.thales.card.CardStateDataSource$emit$1(cardStateDataSource, new com.paypal.android.taptopay.domain.model.card.CardStateChange(digitizedCard, com.paypal.android.taptopay.domain.model.card.CardStateChange.Type.SUSPENDED), null), 3, null);
                    } else if (digitizedCard.getStatus() == com.paypal.android.taptopay.domain.model.card.DigitizedCard.Status.Active && (digitizedCard2.getStatus() == com.paypal.android.taptopay.domain.model.card.DigitizedCard.Status.Suspended || digitizedCard2.getStatus() == com.paypal.android.taptopay.domain.model.card.DigitizedCard.Status.PendingActivation)) {
                        com.paypal.android.logger.Logger.i$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "A card was activated. Emitting RESUMED lifecycle change", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("card", digitizedCard)), null, 4, null);
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(cardStateDataSource.getHighSpeedVideoSizes), null, null, new com.paypal.android.taptopay.data.thales.card.CardStateDataSource$emit$1(cardStateDataSource, new com.paypal.android.taptopay.domain.model.card.CardStateChange(digitizedCard, com.paypal.android.taptopay.domain.model.card.CardStateChange.Type.RESUMED), null), 3, null);
                    }
                } else if (digitizedCard2.isDefault() != digitizedCard.isDefault()) {
                    if (!digitizedCard.isDefault()) {
                        com.paypal.android.logger.Logger.i$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "A card was unset as being the default one. Emitting NOT_DEFAULT lifecycle change", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("card", digitizedCard)), null, 4, null);
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(cardStateDataSource.getHighSpeedVideoSizes), null, null, new com.paypal.android.taptopay.data.thales.card.CardStateDataSource$emit$1(cardStateDataSource, new com.paypal.android.taptopay.domain.model.card.CardStateChange(digitizedCard, com.paypal.android.taptopay.domain.model.card.CardStateChange.Type.NOT_DEFAULT), null), 3, null);
                    } else {
                        com.paypal.android.logger.Logger.i$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "A card was set as being the default one. Emitting DEFAULT lifecycle change", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("card", digitizedCard)), null, 4, null);
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(cardStateDataSource.getHighSpeedVideoSizes), null, null, new com.paypal.android.taptopay.data.thales.card.CardStateDataSource$emit$1(cardStateDataSource, new com.paypal.android.taptopay.domain.model.card.CardStateChange(digitizedCard, com.paypal.android.taptopay.domain.model.card.CardStateChange.Type.DEFAULT), null), 3, null);
                    }
                } else if (!kotlin.jvm.internal.Intrinsics.areEqual(digitizedCard2, digitizedCard)) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Unhandled potential card state change", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("currentCards", cardStateDataSource.getHighSpeedVideoFpsRangesFor), kotlin.TuplesKt.to("updatedCards", list)), null, 4, null);
                }
                unit = kotlin.Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                com.paypal.android.logger.Logger.i$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "A card was added. Emitting card PROVISIONED lifecycle change", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("card", digitizedCard)), null, 4, null);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(cardStateDataSource.getHighSpeedVideoSizes), null, null, new com.paypal.android.taptopay.data.thales.card.CardStateDataSource$emit$1(cardStateDataSource, new com.paypal.android.taptopay.domain.model.card.CardStateChange(digitizedCard, com.paypal.android.taptopay.domain.model.card.CardStateChange.Type.PROVISIONED), null), 3, null);
            }
        }
        for (com.paypal.android.taptopay.domain.model.card.DigitizedCard digitizedCard3 : cardStateDataSource.getHighSpeedVideoFpsRangesFor) {
            java.util.Iterator it3 = list.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj = it3.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.android.taptopay.domain.model.card.DigitizedCard) obj).getCardId(), digitizedCard3.getCardId())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj == null) {
                com.paypal.android.logger.Logger.i$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "A card was removed. Emitting DELETED lifecycle change", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("card", digitizedCard3)), null, 4, null);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(cardStateDataSource.getHighSpeedVideoSizes), null, null, new com.paypal.android.taptopay.data.thales.card.CardStateDataSource$emit$1(cardStateDataSource, new com.paypal.android.taptopay.domain.model.card.CardStateChange(digitizedCard3, com.paypal.android.taptopay.domain.model.card.CardStateChange.Type.DELETED), null), 3, null);
            }
        }
        cardStateDataSource.getHighSpeedVideoFpsRangesFor = kotlin.collections.CollectionsKt.toSet(list);
    }
}
