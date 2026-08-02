package com.paypal.android.taptopay.data.thales.replenishment;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/replenishment/ReplenishmentPushNotificationHandler;", "Lcom/paypal/android/taptopay/domain/di/OrphanedCardLifecycleDependency;", "Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationDataSource;", "pushNotificationDataSource", "Lcom/paypal/android/taptopay/data/thales/replenishment/CardPaymentKeysReplenisher;", "cardPaymentKeysReplenisher", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationDataSource;Lcom/paypal/android/taptopay/data/thales/replenishment/CardPaymentKeysReplenisher;Lkotlinx/coroutines/CoroutineDispatcher;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/android/taptopay/data/thales/replenishment/CardPaymentKeysReplenisher;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReplenishmentPushNotificationHandler implements com.paypal.android.taptopay.domain.di.OrphanedCardLifecycleDependency {
    public static final java.lang.String REPLENISHMENT_ACTION = "MG:ReplenishmentNeededNotification";
    public static final java.lang.String REPLENISHMENT_ERROR_MESSAGE = "Failed to replenish payment keys on MG notification";

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher getHighSpeedVideoFpsRanges;

    public ReplenishmentPushNotificationHandler(com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource pushNotificationDataSource, com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher cardPaymentKeysReplenisher, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationDataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardPaymentKeysReplenisher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoFpsRanges = cardPaymentKeysReplenisher;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(coroutineDispatcher), null, null, new com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler.AnonymousClass1(pushNotificationDataSource, this, null), 3, null);
    }

    public /* synthetic */ ReplenishmentPushNotificationHandler(com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource pushNotificationDataSource, com.paypal.android.taptopay.data.thales.replenishment.CardPaymentKeysReplenisher cardPaymentKeysReplenisher, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(pushNotificationDataSource, cardPaymentKeysReplenisher, (i & 4) != 0 ? kotlinx.coroutines.Dispatchers.getIO() : coroutineDispatcher);
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$1", f = "ReplenishmentPushNotificationHandler.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                final kotlinx.coroutines.flow.SharedFlow<com.paypal.android.taptopay.data.thales.fcm.model.PushNotification> pushNotification = this.getHighSpeedVideoFpsRanges.getPushNotification();
                final kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.data.thales.fcm.model.PushNotification> flow = new kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.data.thales.fcm.model.PushNotification>() { // from class: com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$1$invokeSuspend$$inlined$filter$1

                    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $getHighResolutionOutputSizeshNQ4ISI;

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                            com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                            int i;
                            if (continuation instanceof com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) {
                                anonymousClass1 = (com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) continuation;
                                if ((anonymousClass1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                                    java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                    if (i != 0) {
                                        kotlin.ResultKt.throwOnFailure(obj2);
                                        kotlinx.coroutines.flow.FlowCollector flowCollector = this.$getHighResolutionOutputSizeshNQ4ISI;
                                        if (((com.paypal.android.taptopay.data.thales.fcm.model.PushNotification) obj).getSender() == com.paypal.android.taptopay.data.thales.fcm.model.PushSender.MG) {
                                            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 1;
                                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
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
                            anonymousClass1 = new com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
                            java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                            if (i != 0) {
                            }
                            return kotlin.Unit.INSTANCE;
                        }

                        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$1$invokeSuspend$$inlined$filter$1$2", f = "ReplenishmentPushNotificationHandler.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "emit", n = {}, s = {})
                        /* renamed from: com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                            int getHighResolutionOutputSizeshNQ4ISI;
                            /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                this.getHighSpeedVideoFpsRangesFor = obj;
                                this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
                                return com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.this.emit(null, this);
                            }

                            public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                                super(continuation);
                            }
                        }

                        public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                            this.$getHighResolutionOutputSizeshNQ4ISI = flowCollector;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.android.taptopay.data.thales.fcm.model.PushNotification> flowCollector, kotlin.coroutines.Continuation continuation) {
                        java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$1$invokeSuspend$$inlined$filter$1.AnonymousClass2(flowCollector), continuation);
                        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                    }
                };
                final kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.data.thales.fcm.model.PushNotification> flow2 = new kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.data.thales.fcm.model.PushNotification>() { // from class: com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$1$invokeSuspend$$inlined$filter$2

                    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$1$invokeSuspend$$inlined$filter$2$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $getHighSpeedVideoSizes;

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                            com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$1$invokeSuspend$$inlined$filter$2.AnonymousClass2.AnonymousClass1 anonymousClass1;
                            int i;
                            if (continuation instanceof com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$1$invokeSuspend$$inlined$filter$2.AnonymousClass2.AnonymousClass1) {
                                anonymousClass1 = (com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$1$invokeSuspend$$inlined$filter$2.AnonymousClass2.AnonymousClass1) continuation;
                                if ((anonymousClass1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.getHighSpeedVideoSizes -= 2147483648;
                                    java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.getHighSpeedVideoSizes;
                                    if (i != 0) {
                                        kotlin.ResultKt.throwOnFailure(obj2);
                                        kotlinx.coroutines.flow.FlowCollector flowCollector = this.$getHighSpeedVideoSizes;
                                        if (kotlin.text.StringsKt.equals(com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler.REPLENISHMENT_ACTION, ((com.paypal.android.taptopay.data.thales.fcm.model.PushNotification) obj).getAction(), true)) {
                                            anonymousClass1.getHighSpeedVideoSizes = 1;
                                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
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
                            anonymousClass1 = new com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$1$invokeSuspend$$inlined$filter$2.AnonymousClass2.AnonymousClass1(continuation);
                            java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoFpsRanges;
                            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighSpeedVideoSizes;
                            if (i != 0) {
                            }
                            return kotlin.Unit.INSTANCE;
                        }

                        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$1$invokeSuspend$$inlined$filter$2$2", f = "ReplenishmentPushNotificationHandler.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "emit", n = {}, s = {})
                        /* renamed from: com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$1$invokeSuspend$$inlined$filter$2$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                            /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
                            int getHighSpeedVideoSizes;

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                this.getHighSpeedVideoFpsRanges = obj;
                                this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
                                return com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$1$invokeSuspend$$inlined$filter$2.AnonymousClass2.this.emit(null, this);
                            }

                            public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                                super(continuation);
                            }
                        }

                        public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                            this.$getHighSpeedVideoSizes = flowCollector;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.android.taptopay.data.thales.fcm.model.PushNotification> flowCollector, kotlin.coroutines.Continuation continuation) {
                        java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$1$invokeSuspend$$inlined$filter$2.AnonymousClass2(flowCollector), continuation);
                        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                    }
                };
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (new kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.data.thales.fcm.model.PushNotification>() { // from class: com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$1$invokeSuspend$$inlined$filter$3

                    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$1$invokeSuspend$$inlined$filter$3$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $getHighSpeedVideoSizes;

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                            com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$1$invokeSuspend$$inlined$filter$3.AnonymousClass2.AnonymousClass1 anonymousClass1;
                            int i;
                            if (continuation instanceof com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$1$invokeSuspend$$inlined$filter$3.AnonymousClass2.AnonymousClass1) {
                                anonymousClass1 = (com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$1$invokeSuspend$$inlined$filter$3.AnonymousClass2.AnonymousClass1) continuation;
                                if ((anonymousClass1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                                    java.lang.Object obj2 = anonymousClass1.Camera2StreamConfigurationMap;
                                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                    if (i != 0) {
                                        kotlin.ResultKt.throwOnFailure(obj2);
                                        kotlinx.coroutines.flow.FlowCollector flowCollector = this.$getHighSpeedVideoSizes;
                                        if (((com.paypal.android.taptopay.data.thales.fcm.model.PushNotification) obj).getDigitalCardId().length() > 0) {
                                            anonymousClass1.getHighSpeedVideoFpsRangesFor = 1;
                                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
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
                            anonymousClass1 = new com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$1$invokeSuspend$$inlined$filter$3.AnonymousClass2.AnonymousClass1(continuation);
                            java.lang.Object obj22 = anonymousClass1.Camera2StreamConfigurationMap;
                            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                            if (i != 0) {
                            }
                            return kotlin.Unit.INSTANCE;
                        }

                        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$1$invokeSuspend$$inlined$filter$3$2", f = "ReplenishmentPushNotificationHandler.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "emit", n = {}, s = {})
                        /* renamed from: com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$1$invokeSuspend$$inlined$filter$3$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                            /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
                            int getHighSpeedVideoFpsRangesFor;

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                this.Camera2StreamConfigurationMap = obj;
                                this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
                                return com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$1$invokeSuspend$$inlined$filter$3.AnonymousClass2.this.emit(null, this);
                            }

                            public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                                super(continuation);
                            }
                        }

                        public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                            this.$getHighSpeedVideoSizes = flowCollector;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.android.taptopay.data.thales.fcm.model.PushNotification> flowCollector, kotlin.coroutines.Continuation continuation) {
                        java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$1$invokeSuspend$$inlined$filter$3.AnonymousClass2(flowCollector), continuation);
                        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                    }
                }.collect(new com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler.AnonymousClass1.AnonymousClass4(this.getHighSpeedVideoSizes), this) == coroutine_suspended) {
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

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$1$4, reason: invalid class name */
        final /* synthetic */ class AnonymousClass4 implements kotlinx.coroutines.flow.FlowCollector, kotlin.jvm.internal.FunctionAdapter {
            final /* synthetic */ com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                java.lang.Object access$handleReplenishmentPushNotification = com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler.access$handleReplenishmentPushNotification(this.getHighResolutionOutputSizeshNQ4ISI, (com.paypal.android.taptopay.data.thales.fcm.model.PushNotification) obj, continuation);
                return access$handleReplenishmentPushNotification == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? access$handleReplenishmentPushNotification : kotlin.Unit.INSTANCE;
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final kotlin.Function<?> getFunctionDelegate() {
                return new kotlin.jvm.internal.FunctionReferenceImpl(2, this.getHighResolutionOutputSizeshNQ4ISI, com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler.class, "handleReplenishmentPushNotification", "handleReplenishmentPushNotification(Lcom/paypal/android/taptopay/data/thales/fcm/model/PushNotification;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final boolean equals(java.lang.Object obj) {
                if ((obj instanceof kotlinx.coroutines.flow.FlowCollector) && (obj instanceof kotlin.jvm.internal.FunctionAdapter)) {
                    return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            AnonymousClass4(com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler replenishmentPushNotificationHandler) {
                this.getHighResolutionOutputSizeshNQ4ISI = replenishmentPushNotificationHandler;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource pushNotificationDataSource, com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler replenishmentPushNotificationHandler, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = pushNotificationDataSource;
            this.getHighSpeedVideoSizes = replenishmentPushNotificationHandler;
        }
    }

    public static final /* synthetic */ java.lang.Object access$handleReplenishmentPushNotification(com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler replenishmentPushNotificationHandler, com.paypal.android.taptopay.data.thales.fcm.model.PushNotification pushNotification, kotlin.coroutines.Continuation continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.paypal.android.taptopay.data.thales.replenishment.ReplenishmentPushNotificationHandler$handleReplenishmentPushNotification$2(pushNotification, replenishmentPushNotificationHandler, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }
}
