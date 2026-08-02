package com.paypal.android.taptopay.data.thales.payment;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/payment/TransactionPushNotificationHandler;", "Lcom/paypal/android/taptopay/domain/di/OrphanedCardLifecycleDependency;", "Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationDataSource;", "pushNotificationDataSource", "Lcom/paypal/android/taptopay/data/thales/payment/TransactionDataSource;", "transactionDataSource", "Lcom/paypal/android/taptopay/data/thales/payment/ThalesTransactionRepository;", "transactionRepository", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationDataSource;Lcom/paypal/android/taptopay/data/thales/payment/TransactionDataSource;Lcom/paypal/android/taptopay/data/thales/payment/ThalesTransactionRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "p0", "", "Lcom/paypal/android/taptopay/domain/model/payment/Transaction;", "Camera2StreamConfigurationMap", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/CoroutineDispatcher;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/android/taptopay/data/thales/payment/TransactionDataSource;", "getHighSpeedVideoSizes", "Lcom/paypal/android/taptopay/data/thales/payment/ThalesTransactionRepository;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TransactionPushNotificationHandler implements com.paypal.android.taptopay.domain.di.OrphanedCardLifecycleDependency {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.data.thales.payment.TransactionDataSource getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoFpsRangesFor;

    public TransactionPushNotificationHandler(com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource pushNotificationDataSource, com.paypal.android.taptopay.data.thales.payment.TransactionDataSource transactionDataSource, com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository thalesTransactionRepository, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationDataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionDataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thalesTransactionRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoSizes = transactionDataSource;
        this.getHighSpeedVideoFpsRanges = thalesTransactionRepository;
        this.getHighSpeedVideoFpsRangesFor = coroutineDispatcher;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(coroutineDispatcher), null, null, new com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler.AnonymousClass1(pushNotificationDataSource, this, null), 3, null);
    }

    public /* synthetic */ TransactionPushNotificationHandler(com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource pushNotificationDataSource, com.paypal.android.taptopay.data.thales.payment.TransactionDataSource transactionDataSource, com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository thalesTransactionRepository, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(pushNotificationDataSource, transactionDataSource, thalesTransactionRepository, (i & 8) != 0 ? kotlinx.coroutines.Dispatchers.getIO() : coroutineDispatcher);
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler$1", f = "TransactionPushNotificationHandler.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                final kotlinx.coroutines.flow.SharedFlow<com.paypal.android.taptopay.data.thales.fcm.model.PushNotification> pushNotification = this.getHighResolutionOutputSizeshNQ4ISI.getPushNotification();
                this.Camera2StreamConfigurationMap = 1;
                if (new kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.data.thales.fcm.model.PushNotification>() { // from class: com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler$1$invokeSuspend$$inlined$filter$1

                    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $getHighResolutionOutputSizeshNQ4ISI;

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                            com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                            int i;
                            if (continuation instanceof com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) {
                                anonymousClass1 = (com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) continuation;
                                if ((anonymousClass1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                                    java.lang.Object obj2 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                    if (i != 0) {
                                        kotlin.ResultKt.throwOnFailure(obj2);
                                        kotlinx.coroutines.flow.FlowCollector flowCollector = this.$getHighResolutionOutputSizeshNQ4ISI;
                                        if (((com.paypal.android.taptopay.data.thales.fcm.model.PushNotification) obj).getSender() == com.paypal.android.taptopay.data.thales.fcm.model.PushSender.TNS) {
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
                            anonymousClass1 = new com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
                            java.lang.Object obj22 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                            if (i != 0) {
                            }
                            return kotlin.Unit.INSTANCE;
                        }

                        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler$1$invokeSuspend$$inlined$filter$1$2", f = "TransactionPushNotificationHandler.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "emit", n = {}, s = {})
                        /* renamed from: com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                            /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                            int getHighSpeedVideoFpsRangesFor;

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                this.getHighResolutionOutputSizeshNQ4ISI = obj;
                                this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
                                return com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.this.emit(null, this);
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
                        java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler$1$invokeSuspend$$inlined$filter$1.AnonymousClass2(flowCollector), continuation);
                        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                    }
                }.collect(new com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler.AnonymousClass1.AnonymousClass2(this.getHighSpeedVideoFpsRanges), this) == coroutine_suspended) {
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
        /* renamed from: com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler$1$2, reason: invalid class name */
        final /* synthetic */ class AnonymousClass2 implements kotlinx.coroutines.flow.FlowCollector, kotlin.jvm.internal.FunctionAdapter {
            final /* synthetic */ com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                java.lang.Object highSpeedVideoFpsRanges = com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler.AnonymousClass1.getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI, (com.paypal.android.taptopay.data.thales.fcm.model.PushNotification) obj);
                return highSpeedVideoFpsRanges == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRanges : kotlin.Unit.INSTANCE;
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final kotlin.Function<?> getFunctionDelegate() {
                return new kotlin.jvm.internal.AdaptedFunctionReference(2, this.getHighResolutionOutputSizeshNQ4ISI, com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler.class, "handleMessage", "handleMessage(Lcom/paypal/android/taptopay/data/thales/fcm/model/PushNotification;)V", 4);
            }

            public final boolean equals(java.lang.Object obj) {
                if ((obj instanceof kotlinx.coroutines.flow.FlowCollector) && (obj instanceof kotlin.jvm.internal.FunctionAdapter)) {
                    return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            AnonymousClass2(com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler transactionPushNotificationHandler) {
                this.getHighResolutionOutputSizeshNQ4ISI = transactionPushNotificationHandler;
            }
        }

        public static final /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges(com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler transactionPushNotificationHandler, com.paypal.android.taptopay.data.thales.fcm.model.PushNotification pushNotification) {
            com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler.access$handleMessage(transactionPushNotificationHandler, pushNotification);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource pushNotificationDataSource, com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler transactionPushNotificationHandler, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = pushNotificationDataSource;
            this.getHighSpeedVideoFpsRanges = transactionPushNotificationHandler;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f A[Catch: all -> 0x00be, TRY_LEAVE, TryCatch #0 {all -> 0x00be, blocks: (B:10:0x0028, B:11:0x0049, B:13:0x004f, B:18:0x005c, B:20:0x006c, B:22:0x007a, B:24:0x007e, B:25:0x00a2, B:27:0x00aa, B:28:0x00b8, B:29:0x00bd, B:33:0x0037), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(java.lang.String str, kotlin.coroutines.Continuation<? super java.util.List<com.paypal.android.taptopay.domain.model.payment.Transaction>> continuation) {
        com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler$getTransactionHistory$1 transactionPushNotificationHandler$getTransactionHistory$1;
        int i;
        com.paypal.android.taptopay.domain.Result result;
        try {
            if (continuation instanceof com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler$getTransactionHistory$1) {
                transactionPushNotificationHandler$getTransactionHistory$1 = (com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler$getTransactionHistory$1) continuation;
                if ((transactionPushNotificationHandler$getTransactionHistory$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    transactionPushNotificationHandler$getTransactionHistory$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler$getTransactionHistory$1 transactionPushNotificationHandler$getTransactionHistory$12 = transactionPushNotificationHandler$getTransactionHistory$1;
                    java.lang.Object obj = transactionPushNotificationHandler$getTransactionHistory$12.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = transactionPushNotificationHandler$getTransactionHistory$12.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository thalesTransactionRepository = this.getHighSpeedVideoFpsRanges;
                        transactionPushNotificationHandler$getTransactionHistory$12.getHighSpeedVideoFpsRangesFor = 1;
                        obj = com.paypal.android.taptopay.domain.repository.payment.TransactionRepository.DefaultImpls.getTransactionHistory$default(thalesTransactionRepository, str, null, transactionPushNotificationHandler$getTransactionHistory$12, 2, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    result = (com.paypal.android.taptopay.domain.Result) obj;
                    if (!(result instanceof com.paypal.android.taptopay.domain.Result.Success)) {
                        return (java.util.List) ((com.paypal.android.taptopay.domain.Result.Success) result).getResult();
                    }
                    if (result instanceof com.paypal.android.taptopay.domain.Result.Failure) {
                        com.paypal.android.taptopay.domain.model.payment.GetTransactionHistoryError getTransactionHistoryError = (com.paypal.android.taptopay.domain.model.payment.GetTransactionHistoryError) ((com.paypal.android.taptopay.domain.Result.Failure) result).getError();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(getTransactionHistoryError, com.paypal.android.taptopay.domain.model.payment.GetTransactionHistoryError.CardNotFound.INSTANCE)) {
                            com.paypal.android.logger.Logger.w$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Failed to get transaction: Card not found", null, null, 6, null);
                        } else if (getTransactionHistoryError instanceof com.paypal.android.taptopay.domain.model.payment.GetTransactionHistoryError.DefaultError) {
                            com.paypal.android.logger.Logger.e$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Failed to get transaction", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("debugMessage", ((com.paypal.android.taptopay.domain.model.payment.GetTransactionHistoryError.DefaultError) getTransactionHistoryError).getDebugMessage())), null, ((com.paypal.android.taptopay.domain.model.payment.GetTransactionHistoryError.DefaultError) getTransactionHistoryError).getThrowable(), 4, null);
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(getTransactionHistoryError, com.paypal.android.taptopay.domain.model.payment.GetTransactionHistoryError.DeviceOffline.INSTANCE)) {
                            com.paypal.android.logger.Logger.w$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Failed to get transaction: device offline", null, null, 6, null);
                        }
                        return null;
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            if (i != 0) {
            }
            result = (com.paypal.android.taptopay.domain.Result) obj;
            if (!(result instanceof com.paypal.android.taptopay.domain.Result.Success)) {
            }
        } catch (java.lang.Throwable th) {
            com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog().e("Failed to process TNS payment transaction notification", th);
            return null;
        }
        transactionPushNotificationHandler$getTransactionHistory$1 = new com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler$getTransactionHistory$1(this, continuation);
        com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler$getTransactionHistory$1 transactionPushNotificationHandler$getTransactionHistory$122 = transactionPushNotificationHandler$getTransactionHistory$1;
        java.lang.Object obj2 = transactionPushNotificationHandler$getTransactionHistory$122.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = transactionPushNotificationHandler$getTransactionHistory$122.getHighSpeedVideoFpsRangesFor;
    }

    public static final /* synthetic */ void access$handleMessage(com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler transactionPushNotificationHandler, com.paypal.android.taptopay.data.thales.fcm.model.PushNotification pushNotification) {
        com.paypal.android.logger.Logger.i$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Handling TNS push notification", com.paypal.android.taptopay.data.thales.logging.ExtensionsKt.toLogAttributes(pushNotification), null, 4, null);
        if (kotlin.text.StringsKt.equals(pushNotification.getAction(), "TNS:PaymentTransactionNotification", true)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(transactionPushNotificationHandler.getHighSpeedVideoFpsRangesFor), null, null, new com.paypal.android.taptopay.data.thales.payment.TransactionPushNotificationHandler$handleMessage$1(pushNotification, transactionPushNotificationHandler, null), 3, null);
        } else {
            com.paypal.android.logger.Logger.w$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Unrecognized action", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", pushNotification.getAction())), null, 4, null);
        }
    }
}
