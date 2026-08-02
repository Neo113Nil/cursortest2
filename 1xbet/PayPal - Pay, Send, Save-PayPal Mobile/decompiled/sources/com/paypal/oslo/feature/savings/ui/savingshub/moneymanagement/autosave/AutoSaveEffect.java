package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveEffect;", "", "<init>", "()V", "NavigateBackWithResult", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveEffect$NavigateBackWithResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class AutoSaveEffect {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveEffect$NavigateBackWithResult;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveEffect;", "Lcom/paypal/oslo/feature/savings/api/navigation/result/SavingsAutoSaveNavResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/savings/api/navigation/result/SavingsAutoSaveNavResult;)V", "component1", "()Lcom/paypal/oslo/feature/savings/api/navigation/result/SavingsAutoSaveNavResult;", "copy", "(Lcom/paypal/oslo/feature/savings/api/navigation/result/SavingsAutoSaveNavResult;)Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveEffect$NavigateBackWithResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/api/navigation/result/SavingsAutoSaveNavResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBackWithResult extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateBackWithResult(com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult savingsAutoSaveNavResult) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsAutoSaveNavResult, "");
            this.result = savingsAutoSaveNavResult;
        }

        public final com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult getResult() {
            return this.result;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult savingsAutoSaveNavResult = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateBackWithResult(result=");
            sb.append(savingsAutoSaveNavResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveEffect.NavigateBackWithResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveEffect.NavigateBackWithResult) other).result);
        }

        public final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveEffect.NavigateBackWithResult copy(com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveEffect.NavigateBackWithResult(result);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveEffect.NavigateBackWithResult copy$default(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveEffect.NavigateBackWithResult navigateBackWithResult, com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult savingsAutoSaveNavResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                savingsAutoSaveNavResult = navigateBackWithResult.result;
            }
            return navigateBackWithResult.copy(savingsAutoSaveNavResult);
        }
    }

    private AutoSaveEffect() {
    }

    public /* synthetic */ AutoSaveEffect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
