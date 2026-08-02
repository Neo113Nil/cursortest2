package com.ingo.sdk.android.ux.viewprovider;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/ingo/sdk/android/ux/viewprovider/TransactionCell;", "Lcom/ingo/sdk/android/ux/viewprovider/HistoryCell;", "Lcom/ingo/sdk/kotlin/common/features/history/model/TransactionDetails;", "transactionDetails", "<init>", "(Lcom/ingo/sdk/kotlin/common/features/history/model/TransactionDetails;)V", "Lcom/ingo/sdk/kotlin/common/features/history/model/TransactionDetails;", "getTransactionDetails", "()Lcom/ingo/sdk/kotlin/common/features/history/model/TransactionDetails;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TransactionCell extends com.ingo.sdk.android.ux.viewprovider.HistoryCell {
    public static final int $stable = 8;
    private final com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionCell(com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionDetails, "");
        this.transactionDetails = transactionDetails;
    }

    public final com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails getTransactionDetails() {
        return this.transactionDetails;
    }
}
