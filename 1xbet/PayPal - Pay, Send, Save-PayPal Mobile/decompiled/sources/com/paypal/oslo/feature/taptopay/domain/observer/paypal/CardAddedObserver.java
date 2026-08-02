package com.paypal.oslo.feature.taptopay.domain.observer.paypal;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/observer/paypal/CardAddedObserver;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/OrphanedCardLifecycleDependency;", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalObserveCardStateUseCase;", "payPalObserveCardStateUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalNotifyCardAddedUseCase;", "payPalNotifyCardAddedUseCase", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalObserveCardStateUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalNotifyCardAddedUseCase;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardIdGroup;", "p0", "", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardIdGroup;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalNotifyCardAddedUseCase;", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardAddedObserver implements com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OrphanedCardLifecycleDependency {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalNotifyCardAddedUseCase getHighResolutionOutputSizeshNQ4ISI;

    public CardAddedObserver(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase payPalObserveCardStateUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalNotifyCardAddedUseCase payPalNotifyCardAddedUseCase, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalObserveCardStateUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalNotifyCardAddedUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighResolutionOutputSizeshNQ4ISI = payPalNotifyCardAddedUseCase;
        kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(coroutineDispatcher.plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null)));
        this.getHighSpeedVideoFpsRanges = CoroutineScope;
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Observing card provisioned state", null, null, 6, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new com.paypal.oslo.feature.taptopay.domain.observer.paypal.CardAddedObserver.AnonymousClass1(payPalObserveCardStateUseCase, this, null), 3, null);
    }

    public /* synthetic */ CardAddedObserver(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase payPalObserveCardStateUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalNotifyCardAddedUseCase payPalNotifyCardAddedUseCase, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(payPalObserveCardStateUseCase, payPalNotifyCardAddedUseCase, (i & 4) != 0 ? kotlinx.coroutines.Dispatchers.getIO() : coroutineDispatcher);
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.observer.paypal.CardAddedObserver$1", f = "CardAddedObserver.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, nl = {61}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.taptopay.domain.observer.paypal.CardAddedObserver$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.observer.paypal.CardAddedObserver getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRanges;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardStateChange> invoke = this.getHighSpeedVideoFpsRangesFor.invoke();
                kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardStateChange> flow = new kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardStateChange>() { // from class: com.paypal.oslo.feature.taptopay.domain.observer.paypal.CardAddedObserver$1$invokeSuspend$$inlined$filter$1

                    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                    /* renamed from: com.paypal.oslo.feature.taptopay.domain.observer.paypal.CardAddedObserver$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighResolutionOutputSizeshNQ4ISI;

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                            com.paypal.oslo.feature.taptopay.domain.observer.paypal.CardAddedObserver$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                            int i;
                            if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.observer.paypal.CardAddedObserver$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) {
                                anonymousClass1 = (com.paypal.oslo.feature.taptopay.domain.observer.paypal.CardAddedObserver$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) continuation;
                                if ((anonymousClass1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.getOutputFormats -= 2147483648;
                                    java.lang.Object obj2 = anonymousClass1.getInputFormats;
                                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.getOutputFormats;
                                    if (i != 0) {
                                        kotlin.ResultKt.throwOnFailure(obj2);
                                        kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighResolutionOutputSizeshNQ4ISI;
                                        if (((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardStateChange) obj).getType() == com.paypal.oslo.feature.taptopay.domain.model.card.CardStateChange.Type.PROVISIONED) {
                                            anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                            anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                            anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                            anonymousClass1.getHighSpeedVideoFpsRangesFor = 0;
                                            anonymousClass1.getOutputFormats = 1;
                                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        int i2 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                        java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoSizes;
                                        java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                        kotlin.ResultKt.throwOnFailure(obj2);
                                    }
                                    return kotlin.Unit.INSTANCE;
                                }
                            }
                            anonymousClass1 = new com.paypal.oslo.feature.taptopay.domain.observer.paypal.CardAddedObserver$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
                            java.lang.Object obj22 = anonymousClass1.getInputFormats;
                            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getOutputFormats;
                            if (i != 0) {
                            }
                            return kotlin.Unit.INSTANCE;
                        }

                        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.observer.paypal.CardAddedObserver$1$invokeSuspend$$inlined$filter$1$2", f = "CardAddedObserver.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, nl = {52}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                        /* renamed from: com.paypal.oslo.feature.taptopay.domain.observer.paypal.CardAddedObserver$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                            java.lang.Object Camera2StreamConfigurationMap;
                            java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                            java.lang.Object getHighSpeedVideoFpsRanges;
                            int getHighSpeedVideoFpsRangesFor;
                            java.lang.Object getHighSpeedVideoSizes;
                            /* synthetic */ java.lang.Object getInputFormats;
                            int getOutputFormats;

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                this.getInputFormats = obj;
                                this.getOutputFormats |= Integer.MIN_VALUE;
                                return com.paypal.oslo.feature.taptopay.domain.observer.paypal.CardAddedObserver$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.this.emit(null, this);
                            }

                            public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                                super(continuation);
                            }
                        }

                        public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                            this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardStateChange> flowCollector, kotlin.coroutines.Continuation continuation) {
                        java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.taptopay.domain.observer.paypal.CardAddedObserver$1$invokeSuspend$$inlined$filter$1.AnonymousClass2(flowCollector), continuation);
                        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                    }
                };
                final com.paypal.oslo.feature.taptopay.domain.observer.paypal.CardAddedObserver cardAddedObserver = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighSpeedVideoFpsRanges = 1;
                if (flow.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.taptopay.domain.observer.paypal.CardAddedObserver.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                        java.lang.Object access$handleCardAdded = com.paypal.oslo.feature.taptopay.domain.observer.paypal.CardAddedObserver.access$handleCardAdded(com.paypal.oslo.feature.taptopay.domain.observer.paypal.CardAddedObserver.this, ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardStateChange) obj2).getCard(), continuation);
                        return access$handleCardAdded == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? access$handleCardAdded : kotlin.Unit.INSTANCE;
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
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.taptopay.domain.observer.paypal.CardAddedObserver.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.taptopay.domain.observer.paypal.CardAddedObserver.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalObserveCardStateUseCase payPalObserveCardStateUseCase, com.paypal.oslo.feature.taptopay.domain.observer.paypal.CardAddedObserver cardAddedObserver, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.observer.paypal.CardAddedObserver.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = payPalObserveCardStateUseCase;
            this.getHighResolutionOutputSizeshNQ4ISI = cardAddedObserver;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.taptopay.domain.observer.paypal.CardAddedObserver$notifyCardAdded$1 cardAddedObserver$notifyCardAdded$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.observer.paypal.CardAddedObserver$notifyCardAdded$1) {
            cardAddedObserver$notifyCardAdded$1 = (com.paypal.oslo.feature.taptopay.domain.observer.paypal.CardAddedObserver$notifyCardAdded$1) continuation;
            if ((cardAddedObserver$notifyCardAdded$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                cardAddedObserver$notifyCardAdded$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = cardAddedObserver$notifyCardAdded$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cardAddedObserver$notifyCardAdded$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalNotifyCardAddedUseCase payPalNotifyCardAddedUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                    cardAddedObserver$notifyCardAdded$1.getHighSpeedVideoFpsRangesFor = cardIdGroup;
                    cardAddedObserver$notifyCardAdded$1.getHighSpeedVideoSizes = 1;
                    obj = payPalNotifyCardAddedUseCase.invoke(cardIdGroup, cardAddedObserver$notifyCardAdded$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cardIdGroup = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) cardAddedObserver$notifyCardAdded$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Successfully notified card added", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("paypalCardId", cardIdGroup.getPayPalCardId().getId()), kotlin.TuplesKt.to("digitizedCardId", cardIdGroup.getDigitizedCardId().getId()), kotlin.TuplesKt.to("deviceWalletServiceCardId", cardIdGroup.getDeviceWalletServiceCardId().getId())), 2, null);
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.taptopay.LoggerKt.log.w("Failed to notify card added", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.NotifyCardAddedError) ((arrow.core.Either.Left) either).getValue()).getServiceApiError().toString())), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("paypalCardId", cardIdGroup.getPayPalCardId().getId())));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        cardAddedObserver$notifyCardAdded$1 = new com.paypal.oslo.feature.taptopay.domain.observer.paypal.CardAddedObserver$notifyCardAdded$1(this, continuation);
        java.lang.Object obj2 = cardAddedObserver$notifyCardAdded$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cardAddedObserver$notifyCardAdded$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.Object access$handleCardAdded(com.paypal.oslo.feature.taptopay.domain.observer.paypal.CardAddedObserver cardAddedObserver, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard, kotlin.coroutines.Continuation continuation) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Handling card added event", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("paypalCardId", payPalDigitizedCard.getPayPalCardId().getId())), 2, null);
        java.lang.Object highResolutionOutputSizeshNQ4ISI = cardAddedObserver.getHighResolutionOutputSizeshNQ4ISI(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DigitizedCardId(payPalDigitizedCard.getDigitizedCard().getCardId()), new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId(payPalDigitizedCard.getPayPalCardId().getId()), new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId(payPalDigitizedCard.getDeviceWalletServiceCardId().getId())), continuation);
        return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
    }
}
