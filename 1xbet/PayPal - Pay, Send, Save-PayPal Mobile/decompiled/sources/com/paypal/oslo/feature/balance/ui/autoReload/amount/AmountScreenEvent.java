package com.paypal.oslo.feature.balance.ui.autoReload.amount;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountScreenEvent;", "", "OnAmountSelected", "OnNumberInput", "OnSaveButtonClick", "Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountScreenEvent$OnAmountSelected;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountScreenEvent$OnNumberInput;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountScreenEvent$OnSaveButtonClick;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AmountScreenEvent {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountScreenEvent$OnAmountSelected;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountScreenEvent;", "", "amount", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountScreenEvent$OnAmountSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAmountSelected implements com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEvent {
        public static final int $stable = 0;
        private final java.lang.String amount;

        public OnAmountSelected(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.amount = str;
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnAmountSelected(amount=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.amount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEvent.OnAmountSelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, ((com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEvent.OnAmountSelected) other).amount);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEvent.OnAmountSelected copy(java.lang.String amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEvent.OnAmountSelected(amount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEvent.OnAmountSelected copy$default(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEvent.OnAmountSelected onAmountSelected, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onAmountSelected.amount;
            }
            return onAmountSelected.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountScreenEvent$OnNumberInput;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountScreenEvent;", "", "number", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountScreenEvent$OnNumberInput;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnNumberInput implements com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEvent {
        public static final int $stable = 0;
        private final java.lang.String number;

        public OnNumberInput(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.number = str;
        }

        public final java.lang.String getNumber() {
            return this.number;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.number;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnNumberInput(number=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.number.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEvent.OnNumberInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.number, ((com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEvent.OnNumberInput) other).number);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEvent.OnNumberInput copy(java.lang.String number) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEvent.OnNumberInput(number);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getNumber() {
            return this.number;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEvent.OnNumberInput copy$default(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEvent.OnNumberInput onNumberInput, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onNumberInput.number;
            }
            return onNumberInput.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountScreenEvent$OnSaveButtonClick;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountScreenEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSaveButtonClick implements com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEvent.OnSaveButtonClick INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEvent.OnSaveButtonClick();

        public final int hashCode() {
            return -132591141;
        }

        private OnSaveButtonClick() {
        }

        public final java.lang.String toString() {
            return "OnSaveButtonClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenEvent.OnSaveButtonClick)) {
                return false;
            }
            return true;
        }
    }
}
