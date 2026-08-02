package com.paypal.oslo.feature.taptopay.data.repository.payair;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/payair/PayairTransactionRepository;", "Lcom/paypal/oslo/feature/taptopay/domain/repository/payment/TransactionRepository;", "Lcom/payair/logic/managers/TransactionHistoryManager;", "transactionHistoryManager", "<init>", "(Lcom/payair/logic/managers/TransactionHistoryManager;)V", "", "digitizedCardId", "Ljava/util/Date;", "from", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/GetTransactionHistoryError;", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/Transaction;", "getTransactionHistory", "(Ljava/lang/String;Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "observeTransactions", "()Lkotlinx/coroutines/flow/Flow;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/payair/logic/managers/TransactionHistoryManager;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayairTransactionRepository implements com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.payair.logic.managers.TransactionHistoryManager getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public PayairTransactionRepository(com.payair.logic.managers.TransactionHistoryManager transactionHistoryManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionHistoryManager, "");
        this.getHighSpeedVideoFpsRanges = transactionHistoryManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0083 A[Catch: Exception -> 0x003b, TryCatch #0 {Exception -> 0x003b, blocks: (B:11:0x0037, B:12:0x0078, B:14:0x0083, B:15:0x00b9, B:16:0x00cc, B:18:0x00d2, B:20:0x00e0, B:24:0x00a5), top: B:10:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d2 A[Catch: Exception -> 0x003b, LOOP:0: B:16:0x00cc->B:18:0x00d2, LOOP_END, TryCatch #0 {Exception -> 0x003b, blocks: (B:11:0x0037, B:12:0x0078, B:14:0x0083, B:15:0x00b9, B:16:0x00cc, B:18:0x00d2, B:20:0x00e0, B:24:0x00a5), top: B:10:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a5 A[Catch: Exception -> 0x003b, TryCatch #0 {Exception -> 0x003b, blocks: (B:11:0x0037, B:12:0x0078, B:14:0x0083, B:15:0x00b9, B:16:0x00cc, B:18:0x00d2, B:20:0x00e0, B:24:0x00a5), top: B:10:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getTransactionHistory(java.lang.String str, java.util.Date date, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.payment.GetTransactionHistoryError, ? extends java.util.List<com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction>>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.payair.PayairTransactionRepository$getTransactionHistory$1 payairTransactionRepository$getTransactionHistory$1;
        int i;
        java.lang.String str2;
        java.util.List list;
        java.util.Iterator it;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.payair.PayairTransactionRepository$getTransactionHistory$1) {
            payairTransactionRepository$getTransactionHistory$1 = (com.paypal.oslo.feature.taptopay.data.repository.payair.PayairTransactionRepository$getTransactionHistory$1) continuation;
            if ((payairTransactionRepository$getTransactionHistory$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                payairTransactionRepository$getTransactionHistory$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                com.paypal.oslo.feature.taptopay.data.repository.payair.PayairTransactionRepository$getTransactionHistory$1 payairTransactionRepository$getTransactionHistory$12 = payairTransactionRepository$getTransactionHistory$1;
                java.lang.Object obj = payairTransactionRepository$getTransactionHistory$12.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = payairTransactionRepository$getTransactionHistory$12.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Fetching transaction history", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardId", str)), 2, null);
                    try {
                        com.payair.logic.managers.TransactionHistoryManager transactionHistoryManager = this.getHighSpeedVideoFpsRanges;
                        payairTransactionRepository$getTransactionHistory$12.getHighSpeedVideoSizes = str;
                        payairTransactionRepository$getTransactionHistory$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(date);
                        payairTransactionRepository$getTransactionHistory$12.getHighResolutionOutputSizeshNQ4ISI = 1;
                        obj = com.payair.logic.managers.TransactionHistoryManager.DefaultImpls.getTransactionHistoryForToken$default(transactionHistoryManager, str, date, null, payairTransactionRepository$getTransactionHistory$12, 4, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str2 = str;
                    } catch (java.lang.Exception e) {
                        e = e;
                        str2 = str;
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
                        java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardId", str2));
                        java.lang.Exception exc = e;
                        com.paypal.android.logger.Logger.e$default(logger, "Failed to fetch transaction history", null, mapOf, exc, 2, null);
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.payment.GetTransactionHistoryError.DefaultError("Failed to fetch transaction history: ".concat(java.lang.String.valueOf(e.getMessage())), exc));
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (java.lang.String) payairTransactionRepository$getTransactionHistory$12.getHighSpeedVideoSizes;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Exception e2) {
                        e = e2;
                        com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.taptopay.LoggerKt.log;
                        java.util.Map mapOf2 = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardId", str2));
                        java.lang.Exception exc2 = e;
                        com.paypal.android.logger.Logger.e$default(logger2, "Failed to fetch transaction history", null, mapOf2, exc2, 2, null);
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.payment.GetTransactionHistoryError.DefaultError("Failed to fetch transaction history: ".concat(java.lang.String.valueOf(e.getMessage())), exc2));
                    }
                }
                list = (java.util.List) obj;
                if (list.isEmpty()) {
                    com.paypal.oslo.feature.taptopay.LoggerKt.log.i("Transaction history retrieved", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, kotlin.coroutines.jvm.internal.Boxing.boxInt(list.size()))), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardId", str2)));
                } else {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Transaction history is empty", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardId", str2)), 2, null);
                }
                java.util.List list2 = list;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(com.paypal.oslo.feature.taptopay.data.repository.payair.PayairTransactionRepositoryKt.access$toTransaction((com.payair.db.transactionhistory.TransactionHistoryEntry) it.next()));
                }
                return arrow.core.EitherKt.right(arrayList);
            }
        }
        payairTransactionRepository$getTransactionHistory$1 = new com.paypal.oslo.feature.taptopay.data.repository.payair.PayairTransactionRepository$getTransactionHistory$1(this, continuation);
        com.paypal.oslo.feature.taptopay.data.repository.payair.PayairTransactionRepository$getTransactionHistory$1 payairTransactionRepository$getTransactionHistory$122 = payairTransactionRepository$getTransactionHistory$1;
        java.lang.Object obj2 = payairTransactionRepository$getTransactionHistory$122.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payairTransactionRepository$getTransactionHistory$122.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        list = (java.util.List) obj2;
        if (list.isEmpty()) {
        }
        java.util.List list22 = list;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list22, 10));
        it = list22.iterator();
        while (it.hasNext()) {
        }
        return arrow.core.EitherKt.right(arrayList2);
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction>> observeTransactions() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "observeTransactions called - setting up flow collection", null, null, 6, null);
        final kotlinx.coroutines.flow.Flow observeTransactionHistory$default = com.payair.logic.managers.TransactionHistoryManager.DefaultImpls.observeTransactionHistory$default(this.getHighSpeedVideoFpsRanges, new java.util.Date(), null, 2, null);
        return (kotlinx.coroutines.flow.Flow) new kotlinx.coroutines.flow.Flow<java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction>>() { // from class: com.paypal.oslo.feature.taptopay.data.repository.payair.PayairTransactionRepository$observeTransactions$$inlined$map$1

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.feature.taptopay.data.repository.payair.PayairTransactionRepository$observeTransactions$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighResolutionOutputSizeshNQ4ISI;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.taptopay.data.repository.payair.PayairTransactionRepository$observeTransactions$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.payair.PayairTransactionRepository$observeTransactions$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.feature.taptopay.data.repository.payair.PayairTransactionRepository$observeTransactions$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getInputSizeshNQ4ISI -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getOutputMinFrameDuration;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getInputSizeshNQ4ISI;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighResolutionOutputSizeshNQ4ISI;
                                java.util.List list = (java.util.List) obj;
                                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                                java.util.Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(com.paypal.oslo.feature.taptopay.data.repository.payair.PayairTransactionRepositoryKt.access$toTransaction((com.payair.db.transactionhistory.TransactionHistoryEntry) it.next()));
                                }
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighSpeedVideoSizes = 0;
                                anonymousClass1.getInputSizeshNQ4ISI = 1;
                                if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighSpeedVideoSizes;
                                java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                java.lang.Object obj4 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.feature.taptopay.data.repository.payair.PayairTransactionRepository$observeTransactions$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getOutputMinFrameDuration;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getInputSizeshNQ4ISI;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.payair.PayairTransactionRepository$observeTransactions$$inlined$map$1$2", f = "PayairTransactionRepository.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.feature.taptopay.data.repository.payair.PayairTransactionRepository$observeTransactions$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    int getHighSpeedVideoSizes;
                    int getInputSizeshNQ4ISI;
                    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getOutputMinFrameDuration = obj;
                        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
                        return com.paypal.oslo.feature.taptopay.data.repository.payair.PayairTransactionRepository$observeTransactions$$inlined$map$1.AnonymousClass2.this.emit(null, this);
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
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction>> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.taptopay.data.repository.payair.PayairTransactionRepository$observeTransactions$$inlined$map$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
    }
}
