package com.paypal.oslo.feature.taptopay.domain.observer.paypal;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/observer/paypal/SetDefaultCardOnCardStateChangeObserver;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/OrphanedCardLifecycleDependency;", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalObserveCardStateUseCase;", "payPalObserveCardStateUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetAllCardsUseCase;", "payPalGetAllCardsUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalSetDefaultCardUseCase;", "payPalSetDefaultCardUseCase", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalObserveCardStateUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetAllCardsUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalSetDefaultCardUseCase;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$PayPalCardId;", "p0", "", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$PayPalCardId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetAllCardsUseCase;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalSetDefaultCardUseCase;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/CoroutineScope;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SetDefaultCardOnCardStateChangeObserver implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OrphanedCardLifecycleDependency {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSetDefaultCardUseCase Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase getHighSpeedVideoSizes;

    public SetDefaultCardOnCardStateChangeObserver(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase payPalObserveCardStateUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase payPalGetAllCardsUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSetDefaultCardUseCase payPalSetDefaultCardUseCase, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalObserveCardStateUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalGetAllCardsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalSetDefaultCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoSizes = payPalGetAllCardsUseCase;
        this.Camera2StreamConfigurationMap = payPalSetDefaultCardUseCase;
        kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(coroutineDispatcher.plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null)));
        this.getHighSpeedVideoFpsRangesFor = CoroutineScope;
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Observing card state for default card management", null, null, 6, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver.AnonymousClass1(payPalObserveCardStateUseCase, this, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0112, code lost:
    
        if (r17.getHighSpeedVideoSizes(r4, r2) == r9) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0160, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0064, code lost:
    
        if (r1 != r9) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$handleCardStateChanged(com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver setDefaultCardOnCardStateChangeObserver, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver$handleCardStateChanged$1 setDefaultCardOnCardStateChangeObserver$handleCardStateChanged$1;
        int i;
        arrow.core.Either either;
        java.lang.Object obj;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver$handleCardStateChanged$1) {
            setDefaultCardOnCardStateChangeObserver$handleCardStateChanged$1 = (com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver$handleCardStateChanged$1) continuation;
            if ((setDefaultCardOnCardStateChangeObserver$handleCardStateChanged$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                setDefaultCardOnCardStateChangeObserver$handleCardStateChanged$1.getInputFormats -= 2147483648;
                java.lang.Object obj2 = setDefaultCardOnCardStateChangeObserver$handleCardStateChanged$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = setDefaultCardOnCardStateChangeObserver$handleCardStateChanged$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase payPalGetAllCardsUseCase = setDefaultCardOnCardStateChangeObserver.getHighSpeedVideoSizes;
                    setDefaultCardOnCardStateChangeObserver$handleCardStateChanged$1.getInputFormats = 1;
                    obj2 = com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase.invoke$default(payPalGetAllCardsUseCase, false, false, setDefaultCardOnCardStateChangeObserver$handleCardStateChanged$1, 3, null);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = setDefaultCardOnCardStateChangeObserver$handleCardStateChanged$1.Camera2StreamConfigurationMap;
                        int i3 = setDefaultCardOnCardStateChangeObserver$handleCardStateChanged$1.getHighSpeedVideoFpsRangesFor;
                        int i4 = setDefaultCardOnCardStateChangeObserver$handleCardStateChanged$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj2);
                }
                either = (arrow.core.Either) obj2;
                if (!(either instanceof arrow.core.Either.Right)) {
                    java.util.List list = (java.util.List) ((arrow.core.Either.Right) either).getValue();
                    java.util.List list2 = list;
                    if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                        java.util.Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard) it.next()).getDigitizedCard().isDefault()) {
                                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Not setting a new default card; default card already exists", null, null, 6, null);
                                break;
                            }
                        }
                    }
                    java.util.Iterator it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard) obj).getDigitizedCard().getStatus() == com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.Active) {
                            break;
                        }
                    }
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard) obj;
                    if (payPalDigitizedCard != null) {
                        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId = payPalDigitizedCard.getPayPalCardId();
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Setting a new default card", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("paypalCardId", payPalCardId.getId())), 2, null);
                        setDefaultCardOnCardStateChangeObserver$handleCardStateChanged$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                        setDefaultCardOnCardStateChangeObserver$handleCardStateChanged$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                        setDefaultCardOnCardStateChangeObserver$handleCardStateChanged$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(payPalDigitizedCard);
                        setDefaultCardOnCardStateChangeObserver$handleCardStateChanged$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(payPalCardId);
                        setDefaultCardOnCardStateChangeObserver$handleCardStateChanged$1.getHighSpeedVideoFpsRanges = 0;
                        setDefaultCardOnCardStateChangeObserver$handleCardStateChanged$1.getHighSpeedVideoFpsRangesFor = 0;
                        setDefaultCardOnCardStateChangeObserver$handleCardStateChanged$1.Camera2StreamConfigurationMap = 0;
                        setDefaultCardOnCardStateChangeObserver$handleCardStateChanged$1.getInputFormats = 2;
                    } else {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Not setting a new default card; no active card found", null, null, 6, null);
                    }
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetAllCardsError payPalGetAllCardsError = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetAllCardsError) ((arrow.core.Either.Left) either).getValue();
                    if (!(payPalGetAllCardsError instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetAllCardsError.DefaultError)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetAllCardsError.DefaultError defaultError = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetAllCardsError.DefaultError) payPalGetAllCardsError;
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to get cards for default card selection", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", defaultError.getDebugMessage())), null, defaultError.getThrowable(), 4, null);
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        setDefaultCardOnCardStateChangeObserver$handleCardStateChanged$1 = new com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver$handleCardStateChanged$1(setDefaultCardOnCardStateChangeObserver, continuation);
        java.lang.Object obj22 = setDefaultCardOnCardStateChangeObserver$handleCardStateChanged$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = setDefaultCardOnCardStateChangeObserver$handleCardStateChanged$1.getInputFormats;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj22;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public /* synthetic */ SetDefaultCardOnCardStateChangeObserver(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase payPalObserveCardStateUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase payPalGetAllCardsUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSetDefaultCardUseCase payPalSetDefaultCardUseCase, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(payPalObserveCardStateUseCase, payPalGetAllCardsUseCase, payPalSetDefaultCardUseCase, (i & 8) != 0 ? kotlinx.coroutines.Dispatchers.getIO() : coroutineDispatcher);
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver$1", f = "SetDefaultCardOnCardStateChangeObserver.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, nl = {100}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardStateChange> invoke = this.getHighSpeedVideoFpsRangesFor.invoke();
                this.getHighSpeedVideoSizes = 1;
                if (new kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardStateChange>() { // from class: com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver$1$invokeSuspend$$inlined$filter$1

                    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                    /* renamed from: com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector Camera2StreamConfigurationMap;

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                            com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                            int i;
                            if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) {
                                anonymousClass1 = (com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) continuation;
                                if ((anonymousClass1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.getOutputFormats -= 2147483648;
                                    java.lang.Object obj2 = anonymousClass1.getInputFormats;
                                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.getOutputFormats;
                                    if (i != 0) {
                                        kotlin.ResultKt.throwOnFailure(obj2);
                                        kotlinx.coroutines.flow.FlowCollector flowCollector = this.Camera2StreamConfigurationMap;
                                        int i2 = com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardStateChange) obj).getType().ordinal()];
                                        if (i2 == 1 || i2 == 2 || i2 == 3) {
                                            anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                            anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                            anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                            anonymousClass1.getHighSpeedVideoSizes = 0;
                                            anonymousClass1.getOutputFormats = 1;
                                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        int i3 = anonymousClass1.getHighSpeedVideoSizes;
                                        java.lang.Object obj3 = anonymousClass1.Camera2StreamConfigurationMap;
                                        java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                        kotlin.ResultKt.throwOnFailure(obj2);
                                    }
                                    return kotlin.Unit.INSTANCE;
                                }
                            }
                            anonymousClass1 = new com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
                            java.lang.Object obj22 = anonymousClass1.getInputFormats;
                            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getOutputFormats;
                            if (i != 0) {
                            }
                            return kotlin.Unit.INSTANCE;
                        }

                        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver$1$invokeSuspend$$inlined$filter$1$2", f = "SetDefaultCardOnCardStateChangeObserver.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, nl = {57}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                        /* renamed from: com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                            java.lang.Object Camera2StreamConfigurationMap;
                            java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                            java.lang.Object getHighSpeedVideoFpsRanges;
                            java.lang.Object getHighSpeedVideoFpsRangesFor;
                            int getHighSpeedVideoSizes;
                            /* synthetic */ java.lang.Object getInputFormats;
                            int getOutputFormats;

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                this.getInputFormats = obj;
                                this.getOutputFormats |= Integer.MIN_VALUE;
                                return com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.this.emit(null, this);
                            }

                            public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                                super(continuation);
                            }
                        }

                        public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                            this.Camera2StreamConfigurationMap = flowCollector;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardStateChange> flowCollector, kotlin.coroutines.Continuation continuation) {
                        java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver$1$invokeSuspend$$inlined$filter$1.AnonymousClass2(flowCollector), continuation);
                        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                    }
                }.collect(new com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver.AnonymousClass1.AnonymousClass2(this.getHighResolutionOutputSizeshNQ4ISI), this) == coroutine_suspended) {
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

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver$1$2, reason: invalid class name */
        static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
            final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver getHighSpeedVideoFpsRangesFor;

            /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
            
                r8 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
            
                com.paypal.oslo.feature.taptopay.LoggerKt.log.e("Failed to handle card state change for default card selection", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("changeType", r7.getType())), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("paypalCardId", r7.getCard().getPayPalCardId().getId())), r8);
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardStateChange payPalCardStateChange, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver$1$2$emit$1 setDefaultCardOnCardStateChangeObserver$1$2$emit$1;
                int i;
                if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver$1$2$emit$1) {
                    setDefaultCardOnCardStateChangeObserver$1$2$emit$1 = (com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver$1$2$emit$1) continuation;
                    if ((setDefaultCardOnCardStateChangeObserver$1$2$emit$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                        setDefaultCardOnCardStateChangeObserver$1$2$emit$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                        java.lang.Object obj = setDefaultCardOnCardStateChangeObserver$1$2$emit$1.getHighSpeedVideoFpsRanges;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = setDefaultCardOnCardStateChangeObserver$1$2$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
                            kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("paypalCardId", payPalCardStateChange.getCard().getPayPalCardId().getId()));
                            kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("changeType", payPalCardStateChange.getType()));
                            com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver setDefaultCardOnCardStateChangeObserver = this.getHighSpeedVideoFpsRangesFor;
                            setDefaultCardOnCardStateChangeObserver$1$2$emit$1.getHighSpeedVideoFpsRangesFor = payPalCardStateChange;
                            setDefaultCardOnCardStateChangeObserver$1$2$emit$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                            java.lang.Object access$handleCardStateChanged = com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver.access$handleCardStateChanged(setDefaultCardOnCardStateChangeObserver, setDefaultCardOnCardStateChangeObserver$1$2$emit$1);
                            payPalCardStateChange = access$handleCardStateChanged;
                            if (access$handleCardStateChanged == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardStateChange payPalCardStateChange2 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardStateChange) setDefaultCardOnCardStateChangeObserver$1$2$emit$1.getHighSpeedVideoFpsRangesFor;
                            kotlin.ResultKt.throwOnFailure(obj);
                            payPalCardStateChange = payPalCardStateChange2;
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }
                setDefaultCardOnCardStateChangeObserver$1$2$emit$1 = new com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver$1$2$emit$1(this, continuation);
                java.lang.Object obj2 = setDefaultCardOnCardStateChangeObserver$1$2$emit$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = setDefaultCardOnCardStateChangeObserver$1$2$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                }
                return kotlin.Unit.INSTANCE;
            }

            AnonymousClass2(com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver setDefaultCardOnCardStateChangeObserver) {
                this.getHighSpeedVideoFpsRangesFor = setDefaultCardOnCardStateChangeObserver;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver$1$WhenMappings */
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange.Type.values().length];
                try {
                    iArr[com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange.Type.DELETED.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange.Type.SUSPENDED.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange.Type.RESUMED.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase payPalObserveCardStateUseCase, com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver setDefaultCardOnCardStateChangeObserver, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = payPalObserveCardStateUseCase;
            this.getHighResolutionOutputSizeshNQ4ISI = setDefaultCardOnCardStateChangeObserver;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver$setDefaultCard$1 setDefaultCardOnCardStateChangeObserver$setDefaultCard$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver$setDefaultCard$1) {
            setDefaultCardOnCardStateChangeObserver$setDefaultCard$1 = (com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver$setDefaultCard$1) continuation;
            if ((setDefaultCardOnCardStateChangeObserver$setDefaultCard$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                setDefaultCardOnCardStateChangeObserver$setDefaultCard$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = setDefaultCardOnCardStateChangeObserver$setDefaultCard$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = setDefaultCardOnCardStateChangeObserver$setDefaultCard$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    setDefaultCardOnCardStateChangeObserver$setDefaultCard$1.Camera2StreamConfigurationMap = payPalCardId;
                    setDefaultCardOnCardStateChangeObserver$setDefaultCard$1.getHighSpeedVideoFpsRanges = 1;
                    obj = this.Camera2StreamConfigurationMap.invoke(payPalCardId, setDefaultCardOnCardStateChangeObserver$setDefaultCard$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    payPalCardId = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId) setDefaultCardOnCardStateChangeObserver$setDefaultCard$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Set default card success", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("paypalCardId", payPalCardId.getId())), 2, null);
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalSetDefaultCardError payPalSetDefaultCardError = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalSetDefaultCardError) ((arrow.core.Either.Left) either).getValue();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(payPalSetDefaultCardError, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalSetDefaultCardError.CardNotFound.INSTANCE)) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Set default card failed, card not found", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("paypalCardId", payPalCardId.getId())), 2, null);
                    } else if (payPalSetDefaultCardError instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalSetDefaultCardError.InitCheckFailed) {
                        com.paypal.oslo.feature.taptopay.LoggerKt.log.w("Set default card failed, SDK init check failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalSetDefaultCardError.InitCheckFailed) payPalSetDefaultCardError).getDebugMessage())), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("paypalCardId", payPalCardId.getId())));
                    } else {
                        if (!(payPalSetDefaultCardError instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalSetDefaultCardError.DefaultError)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.taptopay.LoggerKt.log.w("Set default card failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalSetDefaultCardError.DefaultError) payPalSetDefaultCardError).getDebugMessage())), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("paypalCardId", payPalCardId.getId())));
                    }
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        setDefaultCardOnCardStateChangeObserver$setDefaultCard$1 = new com.paypal.oslo.feature.taptopay.domain.observer.paypal.SetDefaultCardOnCardStateChangeObserver$setDefaultCard$1(this, continuation);
        java.lang.Object obj2 = setDefaultCardOnCardStateChangeObserver$setDefaultCard$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = setDefaultCardOnCardStateChangeObserver$setDefaultCard$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
