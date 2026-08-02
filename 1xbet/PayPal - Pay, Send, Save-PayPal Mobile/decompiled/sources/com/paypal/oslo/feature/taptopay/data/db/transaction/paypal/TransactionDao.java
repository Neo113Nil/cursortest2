package com.paypal.oslo.feature.taptopay.data.db.transaction.paypal;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H¦@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH¦@¢\u0006\u0004\b\u000b\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH¦@¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0011\u0010\fJ\u001e\u0010\u0012\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0096@¢\u0006\u0004\b\u0012\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/db/transaction/paypal/TransactionDao;", "", "Lcom/paypal/oslo/feature/taptopay/data/db/transaction/paypal/TransactionEntity;", "transactionEntity", "", "addTransaction", "(Lcom/paypal/oslo/feature/taptopay/data/db/transaction/paypal/TransactionEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "transactionEntities", "addTransactions", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTransactions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cardId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTransaction", "wipeTransactions", "replaceAllTransactions"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface TransactionDao {
    java.lang.Object addTransaction(com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionEntity transactionEntity, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object addTransactions(java.util.List<com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionEntity> list, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object deleteTransaction(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object getTransactions(java.lang.String str, kotlin.coroutines.Continuation<? super java.util.List<com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionEntity>> continuation);

    java.lang.Object getTransactions(kotlin.coroutines.Continuation<? super java.util.List<com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionEntity>> continuation);

    java.lang.Object wipeTransactions(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static java.lang.Object replaceAllTransactions(com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao transactionDao, java.util.List<com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionEntity> list, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao.super.replaceAllTransactions(list, continuation);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        if (r5.addTransactions(r6, r0) != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (r5.wipeTransactions(r0) != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ java.lang.Object replaceAllTransactions$suspendImpl(com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao transactionDao, java.util.List<com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionEntity> list, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao$replaceAllTransactions$1 transactionDao$replaceAllTransactions$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao$replaceAllTransactions$1) {
            transactionDao$replaceAllTransactions$1 = (com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao$replaceAllTransactions$1) continuation;
            if ((transactionDao$replaceAllTransactions$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                transactionDao$replaceAllTransactions$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = transactionDao$replaceAllTransactions$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = transactionDao$replaceAllTransactions$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    transactionDao$replaceAllTransactions$1.getHighSpeedVideoSizes = transactionDao;
                    transactionDao$replaceAllTransactions$1.getHighSpeedVideoFpsRangesFor = list;
                    transactionDao$replaceAllTransactions$1.Camera2StreamConfigurationMap = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    list = (java.util.List) transactionDao$replaceAllTransactions$1.getHighSpeedVideoFpsRangesFor;
                    transactionDao = (com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao) transactionDao$replaceAllTransactions$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                transactionDao$replaceAllTransactions$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(transactionDao);
                transactionDao$replaceAllTransactions$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                transactionDao$replaceAllTransactions$1.Camera2StreamConfigurationMap = 2;
            }
        }
        transactionDao$replaceAllTransactions$1 = new com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionDao$replaceAllTransactions$1(transactionDao, continuation);
        java.lang.Object obj2 = transactionDao$replaceAllTransactions$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = transactionDao$replaceAllTransactions$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        transactionDao$replaceAllTransactions$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(transactionDao);
        transactionDao$replaceAllTransactions$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
        transactionDao$replaceAllTransactions$1.Camera2StreamConfigurationMap = 2;
    }

    default java.lang.Object replaceAllTransactions(java.util.List<com.paypal.oslo.feature.taptopay.data.db.transaction.paypal.TransactionEntity> list, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return replaceAllTransactions$suspendImpl(this, list, continuation);
    }
}
