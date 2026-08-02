package com.paypal.oslo.feature.taptopay.data.repository.paypal.transaction;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/transaction/TransactionDatabaseRepository;", "Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/transaction/CachedTransactionRepository;", "Lcom/paypal/oslo/feature/taptopay/data/db/transaction/paypal/TransactionDao;", "transactionDao", "<init>", "(Lcom/paypal/oslo/feature/taptopay/data/db/transaction/paypal/TransactionDao;)V", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$PayPalCardId;", "cardId", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/Transaction;", "getTransactionHistory", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$PayPalCardId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transactions", "", "setTransactionHistory", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transaction", "", "addTransaction", "(Lcom/paypal/oslo/feature/taptopay/domain/model/payment/Transaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/taptopay/data/db/transaction/paypal/TransactionEntity;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/taptopay/domain/model/payment/Transaction;)Lcom/paypal/oslo/feature/taptopay/data/db/transaction/paypal/TransactionEntity;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/data/db/transaction/paypal/TransactionDao;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TransactionDatabaseRepository implements com.paypal.oslo.feature.taptopay.domain.repository.paypal.transaction.CachedTransactionRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao Camera2StreamConfigurationMap;

    public TransactionDatabaseRepository(com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao transactionDao) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionDao, "");
        this.Camera2StreamConfigurationMap = transactionDao;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006b A[LOOP:0: B:11:0x0065->B:13:0x006b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.paypal.transaction.CachedTransactionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getTransactionHistory(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId, kotlin.coroutines.Continuation<? super java.util.List<com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.paypal.transaction.TransactionDatabaseRepository$getTransactionHistory$1 transactionDatabaseRepository$getTransactionHistory$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.transaction.TransactionDatabaseRepository$getTransactionHistory$1) {
            transactionDatabaseRepository$getTransactionHistory$1 = (com.paypal.oslo.feature.taptopay.data.repository.paypal.transaction.TransactionDatabaseRepository$getTransactionHistory$1) continuation;
            if ((transactionDatabaseRepository$getTransactionHistory$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                transactionDatabaseRepository$getTransactionHistory$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = transactionDatabaseRepository$getTransactionHistory$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = transactionDatabaseRepository$getTransactionHistory$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao transactionDao = this.Camera2StreamConfigurationMap;
                    java.lang.String id = payPalCardId.getId();
                    transactionDatabaseRepository$getTransactionHistory$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(payPalCardId);
                    transactionDatabaseRepository$getTransactionHistory$1.getHighSpeedVideoFpsRanges = 1;
                    obj = transactionDao.getTransactions(id, transactionDatabaseRepository$getTransactionHistory$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.Iterable<com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionEntity> iterable = (java.lang.Iterable) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionEntity transactionEntity : iterable) {
                    arrayList.add(new com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction(transactionEntity.getId(), transactionEntity.getCardId(), transactionEntity.getStatus(), transactionEntity.getType(), transactionEntity.getAmount(), transactionEntity.getCurrencyCode(), transactionEntity.getDisplayAmount(), transactionEntity.getTransactionDate(), transactionEntity.getMerchantName(), transactionEntity.getMerchantPostalCode(), transactionEntity.getMerchantCategoryCode()));
                }
                return arrayList;
            }
        }
        transactionDatabaseRepository$getTransactionHistory$1 = new com.paypal.oslo.feature.taptopay.data.repository.paypal.transaction.TransactionDatabaseRepository$getTransactionHistory$1(this, continuation);
        java.lang.Object obj2 = transactionDatabaseRepository$getTransactionHistory$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = transactionDatabaseRepository$getTransactionHistory$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        java.lang.Iterable<com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionEntity> iterable2 = (java.lang.Iterable) obj2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        while (r1.hasNext()) {
        }
        return arrayList2;
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.paypal.transaction.CachedTransactionRepository
    public final java.lang.Object setTransactionHistory(java.util.List<com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction> list, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao transactionDao = this.Camera2StreamConfigurationMap;
        java.util.List<com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Camera2StreamConfigurationMap((com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction) it.next()));
        }
        java.lang.Object replaceAllTransactions = transactionDao.replaceAllTransactions(arrayList, continuation);
        return replaceAllTransactions == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? replaceAllTransactions : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(1:25))|12|13|(1:15)|16|17))|28|6|7|(0)(0)|12|13|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        r0 = kotlin.Result.INSTANCE;
        r7 = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(r7));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.paypal.transaction.CachedTransactionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object addTransaction(com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction transaction, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.paypal.transaction.TransactionDatabaseRepository$addTransaction$1 transactionDatabaseRepository$addTransaction$1;
        int i;
        java.lang.Throwable m23439exceptionOrNullimpl;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.transaction.TransactionDatabaseRepository$addTransaction$1) {
            transactionDatabaseRepository$addTransaction$1 = (com.paypal.oslo.feature.taptopay.data.repository.paypal.transaction.TransactionDatabaseRepository$addTransaction$1) continuation;
            if ((transactionDatabaseRepository$addTransaction$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                transactionDatabaseRepository$addTransaction$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = transactionDatabaseRepository$addTransaction$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = transactionDatabaseRepository$addTransaction$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    com.paypal.oslo.feature.taptopay.data.repository.paypal.transaction.TransactionDatabaseRepository transactionDatabaseRepository = this;
                    com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao transactionDao = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionEntity Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(transaction);
                    transactionDatabaseRepository$addTransaction$1.getHighSpeedVideoSizes = transaction;
                    transactionDatabaseRepository$addTransaction$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(this);
                    transactionDatabaseRepository$addTransaction$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    transactionDatabaseRepository$addTransaction$1.getHighSpeedVideoFpsRanges = 1;
                    if (transactionDao.addTransaction(Camera2StreamConfigurationMap, transactionDatabaseRepository$addTransaction$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = transactionDatabaseRepository$addTransaction$1.getHighResolutionOutputSizeshNQ4ISI;
                    transaction = (com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction) transactionDatabaseRepository$addTransaction$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.Object m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
                m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
                if (m23439exceptionOrNullimpl != null) {
                    com.paypal.oslo.feature.taptopay.LoggerKt.log.e("Failed to add transaction to cache", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("transactionId", transaction.getId())), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cardId", transaction.getCardId())), m23439exceptionOrNullimpl);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(kotlin.Result.m23442isSuccessimpl(m23436constructorimpl));
            }
        }
        transactionDatabaseRepository$addTransaction$1 = new com.paypal.oslo.feature.taptopay.data.repository.paypal.transaction.TransactionDatabaseRepository$addTransaction$1(this, continuation);
        java.lang.Object obj2 = transactionDatabaseRepository$addTransaction$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = transactionDatabaseRepository$addTransaction$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        java.lang.Object m23436constructorimpl2 = kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
        m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl2);
        if (m23439exceptionOrNullimpl != null) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(kotlin.Result.m23442isSuccessimpl(m23436constructorimpl2));
    }

    private static com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionEntity Camera2StreamConfigurationMap(com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction transaction) {
        return new com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionEntity(transaction.getId(), transaction.getCardId(), transaction.getStatus(), transaction.getType(), transaction.getAmount(), transaction.getCurrencyCode(), transaction.getDisplayAmount(), transaction.getTransactionDate(), transaction.getMerchantName(), transaction.getMerchantPostalCode(), transaction.getMerchantCategoryCode());
    }
}
