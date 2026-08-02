package com.paypal.oslo.feature.taptopay.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/mock/MockTransactionRepository;", "Lcom/paypal/oslo/feature/taptopay/domain/repository/payment/TransactionRepository;", "<init>", "()V", "", "digitizedCardId", "Ljava/util/Date;", "from", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/GetTransactionHistoryError;", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/Transaction;", "getTransactionHistory", "(Ljava/lang/String;Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "observeTransactions", "()Lkotlinx/coroutines/flow/Flow;", "transactions", "", "notify$taptopay_prodRelease", "(Ljava/util/List;)V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MockTransactionRepository implements com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository {

    @java.lang.Deprecated
    public static final int CATEGORY_CODE_LENGTH = 3;

    @java.lang.Deprecated
    public static final int CATEGORY_CODE_MAX = 100;

    @java.lang.Deprecated
    public static final double MAX_MOCK_AMOUNT = 100.0d;

    @java.lang.Deprecated
    public static final int MOCK_TRANSACTION_COUNT = 10;

    @java.lang.Deprecated
    public static final int POSTAL_CODE_LENGTH = 5;

    @java.lang.Deprecated
    public static final int POSTAL_CODE_MAX = 10000;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction>> getHighSpeedVideoFpsRanges = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(kotlin.collections.CollectionsKt.emptyList());
    private static final com.paypal.oslo.feature.taptopay.data.repository.mock.MockTransactionRepository.Companion Companion = new com.paypal.oslo.feature.taptopay.data.repository.mock.MockTransactionRepository.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public MockTransactionRepository() {
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\n8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/mock/MockTransactionRepository$Companion;", "", "<init>", "()V", "", "MOCK_TRANSACTION_COUNT", com.visa.cbp.getEncExpo.warmup, "", "MAX_MOCK_AMOUNT", "D", "Lkotlin/UInt;", "POSTAL_CODE_MAX", "POSTAL_CODE_LENGTH", "CATEGORY_CODE_MAX", "CATEGORY_CODE_LENGTH"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository
    public final java.lang.Object getTransactionHistory(java.lang.String str, java.util.Date date, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.payment.GetTransactionHistoryError, ? extends java.util.List<com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction>>> continuation) {
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        for (int i = 0; i < 10; i++) {
            double nextDouble = kotlin.random.Random.INSTANCE.nextDouble() * 100.0d;
            java.lang.String concat = "tx".concat(java.lang.String.valueOf(i));
            com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus transactionStatus = com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus.CLEARED;
            com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType transactionType = com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType.PURCHASE;
            java.lang.String format = java.lang.String.format("%,.2f", java.util.Arrays.copyOf(new java.lang.Object[]{kotlin.coroutines.jvm.internal.Boxing.boxDouble(nextDouble)}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
            createListBuilder.add(new com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction(concat, str, transactionStatus, transactionType, nextDouble, "USD", com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD.concat(java.lang.String.valueOf(format)), new java.util.Date(), "Merchant ".concat(java.lang.String.valueOf(i)), kotlin.text.StringsKt.padStart(java.lang.Integer.toUnsignedString(java.lang.Integer.remainderUnsigned(kotlin.random.URandomKt.nextUInt(kotlin.random.Random.INSTANCE), 10000)), 5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), kotlin.text.StringsKt.padStart(java.lang.Integer.toUnsignedString(java.lang.Integer.remainderUnsigned(kotlin.random.URandomKt.nextUInt(kotlin.random.Random.INSTANCE), 100)), 3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
        }
        return arrow.core.EitherKt.right(kotlin.collections.CollectionsKt.build(createListBuilder));
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.payment.TransactionRepository
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction>> observeTransactions() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final void notify$taptopay_prodRelease(java.util.List<com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction> transactions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactions, "");
        this.getHighSpeedVideoFpsRanges.setValue(transactions);
    }
}
