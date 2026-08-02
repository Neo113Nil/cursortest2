package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentPreferences/selectamount/AutopayMethodResponse;", "", "<init>", "()V", "MinimumPaymentDue", "RemainingStatementBalance", "CurrentBalance", "CustomAmount", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentPreferences/selectamount/AutopayMethodResponse$CurrentBalance;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentPreferences/selectamount/AutopayMethodResponse$CustomAmount;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentPreferences/selectamount/AutopayMethodResponse$MinimumPaymentDue;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentPreferences/selectamount/AutopayMethodResponse$RemainingStatementBalance;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class AutopayMethodResponse {
    public static final int $stable = 0;

    private AutopayMethodResponse() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentPreferences/selectamount/AutopayMethodResponse$MinimumPaymentDue;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentPreferences/selectamount/AutopayMethodResponse;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MinimumPaymentDue extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayMethodResponse {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayMethodResponse.MinimumPaymentDue INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayMethodResponse.MinimumPaymentDue();

        public final int hashCode() {
            return -1311390420;
        }

        private MinimumPaymentDue() {
            super(null);
        }

        public final java.lang.String toString() {
            return "MinimumPaymentDue";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayMethodResponse.MinimumPaymentDue)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentPreferences/selectamount/AutopayMethodResponse$RemainingStatementBalance;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentPreferences/selectamount/AutopayMethodResponse;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RemainingStatementBalance extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayMethodResponse {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayMethodResponse.RemainingStatementBalance INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayMethodResponse.RemainingStatementBalance();

        public final int hashCode() {
            return 1211057395;
        }

        private RemainingStatementBalance() {
            super(null);
        }

        public final java.lang.String toString() {
            return "RemainingStatementBalance";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayMethodResponse.RemainingStatementBalance)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentPreferences/selectamount/AutopayMethodResponse$CurrentBalance;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentPreferences/selectamount/AutopayMethodResponse;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CurrentBalance extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayMethodResponse {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayMethodResponse.CurrentBalance INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayMethodResponse.CurrentBalance();

        public final int hashCode() {
            return -1108117325;
        }

        private CurrentBalance() {
            super(null);
        }

        public final java.lang.String toString() {
            return "CurrentBalance";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayMethodResponse.CurrentBalance)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentPreferences/selectamount/AutopayMethodResponse$CustomAmount;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentPreferences/selectamount/AutopayMethodResponse;", "", "amount", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentPreferences/selectamount/AutopayMethodResponse$CustomAmount;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CustomAmount extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayMethodResponse {
        public static final int $stable = 0;
        private final java.lang.String amount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomAmount(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.amount = str;
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomAmount(amount=");
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
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayMethodResponse.CustomAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayMethodResponse.CustomAmount) other).amount);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayMethodResponse.CustomAmount copy(java.lang.String amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayMethodResponse.CustomAmount(amount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayMethodResponse.CustomAmount copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentPreferences.selectamount.AutopayMethodResponse.CustomAmount customAmount, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = customAmount.amount;
            }
            return customAmount.copy(str);
        }
    }

    public /* synthetic */ AutopayMethodResponse(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
