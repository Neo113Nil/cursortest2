package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/TransactionErrorToastManagerViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/TransactionErrorToastManager;", "transactionErrorToastManager", "<init>", "(Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/TransactionErrorToastManager;)V", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/TransactionErrorToastManager;", "getTransactionErrorToastManager", "()Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/TransactionErrorToastManager;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TransactionErrorToastManagerViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.TransactionErrorToastManager transactionErrorToastManager;

    @javax.inject.Inject
    public TransactionErrorToastManagerViewModel(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.TransactionErrorToastManager transactionErrorToastManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionErrorToastManager, "");
        this.transactionErrorToastManager = transactionErrorToastManager;
    }

    public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.TransactionErrorToastManager getTransactionErrorToastManager() {
        return this.transactionErrorToastManager;
    }
}
