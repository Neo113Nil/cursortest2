package com.paypal.oslo.feature.balance.ui.autoReload.amount;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountScreenEffect;", "", "GoBackWithResult", "Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountScreenEffect$GoBackWithResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AmountScreenEffect {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountScreenEffect$GoBackWithResult;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountScreenEffect;", "", "amount", "formattedAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountScreenEffect$GoBackWithResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAmount", "getFormattedAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GoBackWithResult implements com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEffect {
        public static final int $stable = 0;
        private final java.lang.String amount;
        private final java.lang.String formattedAmount;

        public GoBackWithResult(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.amount = str;
            this.formattedAmount = str2;
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.amount;
            java.lang.String str2 = this.formattedAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GoBackWithResult(amount=");
            sb.append(str);
            sb.append(", formattedAmount=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.amount.hashCode() * 31) + this.formattedAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEffect.GoBackWithResult)) {
                return false;
            }
            com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEffect.GoBackWithResult goBackWithResult = (com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEffect.GoBackWithResult) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, goBackWithResult.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedAmount, goBackWithResult.formattedAmount);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEffect.GoBackWithResult copy(java.lang.String amount, java.lang.String formattedAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedAmount, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEffect.GoBackWithResult(amount, formattedAmount);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEffect.GoBackWithResult copy$default(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEffect.GoBackWithResult goBackWithResult, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = goBackWithResult.amount;
            }
            if ((i & 2) != 0) {
                str2 = goBackWithResult.formattedAmount;
            }
            return goBackWithResult.copy(str, str2);
        }
    }
}
