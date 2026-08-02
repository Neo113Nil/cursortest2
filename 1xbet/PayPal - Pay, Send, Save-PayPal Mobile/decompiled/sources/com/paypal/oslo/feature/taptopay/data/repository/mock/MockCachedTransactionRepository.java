package com.paypal.oslo.feature.taptopay.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/mock/MockCachedTransactionRepository;", "Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/transaction/CachedTransactionRepository;", "<init>", "()V", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$PayPalCardId;", "cardId", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/Transaction;", "getTransactionHistory", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$PayPalCardId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transactions", "", "setTransactionHistory", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transaction", "", "addTransaction", "(Lcom/paypal/oslo/feature/taptopay/domain/model/payment/Transaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/sync/Mutex;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/sync/Mutex;", "getHighSpeedVideoFpsRangesFor", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MockCachedTransactionRepository implements com.paypal.oslo.feature.taptopay.domain.repository.paypal.transaction.CachedTransactionRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.sync.Mutex getHighSpeedVideoFpsRangesFor = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.List<com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction> Camera2StreamConfigurationMap = new java.util.ArrayList();

    @javax.inject.Inject
    public MockCachedTransactionRepository() {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0069 A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:11:0x0054, B:12:0x0063, B:14:0x0069, B:17:0x007e, B:22:0x0082), top: B:10:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.paypal.transaction.CachedTransactionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getTransactionHistory(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId, kotlin.coroutines.Continuation<? super java.util.List<com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.mock.MockCachedTransactionRepository$getTransactionHistory$1 mockCachedTransactionRepository$getTransactionHistory$1;
        int i;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId2;
        kotlinx.coroutines.sync.Mutex mutex;
        try {
            if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.mock.MockCachedTransactionRepository$getTransactionHistory$1) {
                mockCachedTransactionRepository$getTransactionHistory$1 = (com.paypal.oslo.feature.taptopay.data.repository.mock.MockCachedTransactionRepository$getTransactionHistory$1) continuation;
                if ((mockCachedTransactionRepository$getTransactionHistory$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    mockCachedTransactionRepository$getTransactionHistory$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj = mockCachedTransactionRepository$getTransactionHistory$1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = mockCachedTransactionRepository$getTransactionHistory$1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex mutex2 = this.getHighSpeedVideoFpsRangesFor;
                        mockCachedTransactionRepository$getTransactionHistory$1.getHighResolutionOutputSizeshNQ4ISI = payPalCardId;
                        mockCachedTransactionRepository$getTransactionHistory$1.getHighSpeedVideoFpsRangesFor = mutex2;
                        mockCachedTransactionRepository$getTransactionHistory$1.getHighSpeedVideoFpsRanges = 0;
                        mockCachedTransactionRepository$getTransactionHistory$1.Camera2StreamConfigurationMap = 1;
                        if (mutex2.lock(null, mockCachedTransactionRepository$getTransactionHistory$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        payPalCardId2 = payPalCardId;
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = mockCachedTransactionRepository$getTransactionHistory$1.getHighSpeedVideoFpsRanges;
                        mutex = (kotlinx.coroutines.sync.Mutex) mockCachedTransactionRepository$getTransactionHistory$1.getHighSpeedVideoFpsRangesFor;
                        payPalCardId2 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId) mockCachedTransactionRepository$getTransactionHistory$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    java.util.List<com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction> list = this.Camera2StreamConfigurationMap;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : list) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction) obj2).getCardId(), payPalCardId2.getId())) {
                            arrayList.add(obj2);
                        }
                    }
                    return arrayList;
                }
            }
            java.util.List<com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction> list2 = this.Camera2StreamConfigurationMap;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (r8.hasNext()) {
            }
            return arrayList2;
        } finally {
            mutex.unlock(null);
        }
        mockCachedTransactionRepository$getTransactionHistory$1 = new com.paypal.oslo.feature.taptopay.data.repository.mock.MockCachedTransactionRepository$getTransactionHistory$1(this, continuation);
        java.lang.Object obj3 = mockCachedTransactionRepository$getTransactionHistory$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockCachedTransactionRepository$getTransactionHistory$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.paypal.transaction.CachedTransactionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object setTransactionHistory(java.util.List<com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction> list, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.mock.MockCachedTransactionRepository$setTransactionHistory$1 mockCachedTransactionRepository$setTransactionHistory$1;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        try {
            if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.mock.MockCachedTransactionRepository$setTransactionHistory$1) {
                mockCachedTransactionRepository$setTransactionHistory$1 = (com.paypal.oslo.feature.taptopay.data.repository.mock.MockCachedTransactionRepository$setTransactionHistory$1) continuation;
                if ((mockCachedTransactionRepository$setTransactionHistory$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    mockCachedTransactionRepository$setTransactionHistory$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = mockCachedTransactionRepository$setTransactionHistory$1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = mockCachedTransactionRepository$setTransactionHistory$1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = this.getHighSpeedVideoFpsRangesFor;
                        mockCachedTransactionRepository$setTransactionHistory$1.getHighResolutionOutputSizeshNQ4ISI = list;
                        mockCachedTransactionRepository$setTransactionHistory$1.Camera2StreamConfigurationMap = mutex;
                        mockCachedTransactionRepository$setTransactionHistory$1.getHighSpeedVideoFpsRanges = 0;
                        mockCachedTransactionRepository$setTransactionHistory$1.getHighSpeedVideoFpsRangesFor = 1;
                        if (mutex.lock(null, mockCachedTransactionRepository$setTransactionHistory$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = mockCachedTransactionRepository$setTransactionHistory$1.getHighSpeedVideoFpsRanges;
                        kotlinx.coroutines.sync.Mutex mutex2 = (kotlinx.coroutines.sync.Mutex) mockCachedTransactionRepository$setTransactionHistory$1.Camera2StreamConfigurationMap;
                        java.util.List<com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction> list2 = (java.util.List) mockCachedTransactionRepository$setTransactionHistory$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                        list = list2;
                    }
                    this.Camera2StreamConfigurationMap.clear();
                    this.Camera2StreamConfigurationMap.addAll(list);
                    mutex.unlock(null);
                    return kotlin.Unit.INSTANCE;
                }
            }
            this.Camera2StreamConfigurationMap.clear();
            this.Camera2StreamConfigurationMap.addAll(list);
            mutex.unlock(null);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        mockCachedTransactionRepository$setTransactionHistory$1 = new com.paypal.oslo.feature.taptopay.data.repository.mock.MockCachedTransactionRepository$setTransactionHistory$1(this, continuation);
        java.lang.Object obj2 = mockCachedTransactionRepository$setTransactionHistory$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockCachedTransactionRepository$setTransactionHistory$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.paypal.transaction.CachedTransactionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object addTransaction(com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction transaction, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.mock.MockCachedTransactionRepository$addTransaction$1 mockCachedTransactionRepository$addTransaction$1;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        try {
            if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.mock.MockCachedTransactionRepository$addTransaction$1) {
                mockCachedTransactionRepository$addTransaction$1 = (com.paypal.oslo.feature.taptopay.data.repository.mock.MockCachedTransactionRepository$addTransaction$1) continuation;
                if ((mockCachedTransactionRepository$addTransaction$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    mockCachedTransactionRepository$addTransaction$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = mockCachedTransactionRepository$addTransaction$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = mockCachedTransactionRepository$addTransaction$1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = this.getHighSpeedVideoFpsRangesFor;
                        mockCachedTransactionRepository$addTransaction$1.getHighSpeedVideoSizes = transaction;
                        mockCachedTransactionRepository$addTransaction$1.getHighSpeedVideoFpsRanges = mutex;
                        mockCachedTransactionRepository$addTransaction$1.Camera2StreamConfigurationMap = 0;
                        mockCachedTransactionRepository$addTransaction$1.getHighSpeedVideoFpsRangesFor = 1;
                        if (mutex.lock(null, mockCachedTransactionRepository$addTransaction$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = mockCachedTransactionRepository$addTransaction$1.Camera2StreamConfigurationMap;
                        kotlinx.coroutines.sync.Mutex mutex2 = (kotlinx.coroutines.sync.Mutex) mockCachedTransactionRepository$addTransaction$1.getHighSpeedVideoFpsRanges;
                        com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction transaction2 = (com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction) mockCachedTransactionRepository$addTransaction$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                        transaction = transaction2;
                    }
                    this.Camera2StreamConfigurationMap.add(transaction);
                    mutex.unlock(null);
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                }
            }
            this.Camera2StreamConfigurationMap.add(transaction);
            mutex.unlock(null);
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
        } catch (java.lang.Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        mockCachedTransactionRepository$addTransaction$1 = new com.paypal.oslo.feature.taptopay.data.repository.mock.MockCachedTransactionRepository$addTransaction$1(this, continuation);
        java.lang.Object obj2 = mockCachedTransactionRepository$addTransaction$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockCachedTransactionRepository$addTransaction$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
    }
}
