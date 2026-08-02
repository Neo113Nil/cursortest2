package com.paypal.oslo.feature.taptopay.data.repository.thales;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/thales/ThalesTransactionRepositoryAdapter;", "Lcom/paypal/oslo/feature/taptopay/domain/repository/payment/TransactionRepository;", "Lcom/paypal/android/taptopay/data/thales/payment/ThalesTransactionRepository;", "thalesTransactionRepository", "<init>", "(Lcom/paypal/android/taptopay/data/thales/payment/ThalesTransactionRepository;)V", "", "digitizedCardId", "Ljava/util/Date;", "from", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/GetTransactionHistoryError;", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/Transaction;", "getTransactionHistory", "(Ljava/lang/String;Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "observeTransactions", "()Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/android/taptopay/data/thales/payment/ThalesTransactionRepository;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ThalesTransactionRepositoryAdapter implements com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public ThalesTransactionRepositoryAdapter(com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository thalesTransactionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thalesTransactionRepository, "");
        this.getHighSpeedVideoFpsRanges = thalesTransactionRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getTransactionHistory(java.lang.String str, java.util.Date date, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.payment.GetTransactionHistoryError, ? extends java.util.List<com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction>>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesTransactionRepositoryAdapter$getTransactionHistory$1 thalesTransactionRepositoryAdapter$getTransactionHistory$1;
        int i;
        arrow.core.Either either;
        arrow.core.Either.Right right;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesTransactionRepositoryAdapter$getTransactionHistory$1) {
            thalesTransactionRepositoryAdapter$getTransactionHistory$1 = (com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesTransactionRepositoryAdapter$getTransactionHistory$1) continuation;
            if ((thalesTransactionRepositoryAdapter$getTransactionHistory$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                thalesTransactionRepositoryAdapter$getTransactionHistory$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = thalesTransactionRepositoryAdapter$getTransactionHistory$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = thalesTransactionRepositoryAdapter$getTransactionHistory$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository thalesTransactionRepository = this.getHighSpeedVideoFpsRanges;
                    thalesTransactionRepositoryAdapter$getTransactionHistory$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    thalesTransactionRepositoryAdapter$getTransactionHistory$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(date);
                    thalesTransactionRepositoryAdapter$getTransactionHistory$1.getHighSpeedVideoSizes = 1;
                    obj = thalesTransactionRepository.getTransactionHistory(str, date, thalesTransactionRepositoryAdapter$getTransactionHistory$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesResultMapperKt.toEither((com.paypal.android.taptopay.domain.Result) obj);
                if (!(either instanceof arrow.core.Either.Left)) {
                    right = new arrow.core.Either.Left(com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesPaymentModelMapperKt.toOslo((com.paypal.android.taptopay.domain.model.payment.GetTransactionHistoryError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                if (!(right instanceof arrow.core.Either.Right)) {
                    java.util.List list = (java.util.List) ((arrow.core.Either.Right) right).getValue();
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesPaymentModelMapperKt.toOslo((com.paypal.android.taptopay.domain.model.payment.Transaction) it.next()));
                    }
                    return new arrow.core.Either.Right(arrayList);
                }
                if (right instanceof arrow.core.Either.Left) {
                    return right;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        thalesTransactionRepositoryAdapter$getTransactionHistory$1 = new com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesTransactionRepositoryAdapter$getTransactionHistory$1(this, continuation);
        java.lang.Object obj2 = thalesTransactionRepositoryAdapter$getTransactionHistory$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = thalesTransactionRepositoryAdapter$getTransactionHistory$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = com.paypal.oslo.feature.taptopay.data.thales.mapper.ThalesResultMapperKt.toEither((com.paypal.android.taptopay.domain.Result) obj2);
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        if (!(right instanceof arrow.core.Either.Right)) {
        }
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction>> observeTransactions() {
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.taptopay.data.repository.thales.ThalesTransactionRepositoryAdapter$observeTransactions$1(this, null));
    }
}
