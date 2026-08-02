package com.paypal.oslo.feature.balance.ui.autoReload.amount;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountValidationType;", "", "Valid", "ValidWithWarning", "LowerThanMinimum", "LowerThanThreshold", "HigherThanMaximum", "Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountValidationType$HigherThanMaximum;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountValidationType$LowerThanMinimum;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountValidationType$LowerThanThreshold;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountValidationType$Valid;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountValidationType$ValidWithWarning;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AmountValidationType {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountValidationType$Valid;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountValidationType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Valid implements com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.Valid INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.Valid();

        public final int hashCode() {
            return -597604896;
        }

        private Valid() {
        }

        public final java.lang.String toString() {
            return "Valid";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.Valid)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountValidationType$ValidWithWarning;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountValidationType;", "", "formattedAmount", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountValidationType$ValidWithWarning;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFormattedAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ValidWithWarning implements com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType {
        public static final int $stable = 0;
        private final java.lang.String formattedAmount;

        public ValidWithWarning(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.formattedAmount = str;
        }

        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.formattedAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidWithWarning(formattedAmount=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.formattedAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.ValidWithWarning) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedAmount, ((com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.ValidWithWarning) other).formattedAmount);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.ValidWithWarning copy(java.lang.String formattedAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedAmount, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.ValidWithWarning(formattedAmount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.ValidWithWarning copy$default(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.ValidWithWarning validWithWarning, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = validWithWarning.formattedAmount;
            }
            return validWithWarning.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountValidationType$LowerThanMinimum;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountValidationType;", "", "formattedAmount", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountValidationType$LowerThanMinimum;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFormattedAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LowerThanMinimum implements com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType {
        public static final int $stable = 0;
        private final java.lang.String formattedAmount;

        public LowerThanMinimum(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.formattedAmount = str;
        }

        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.formattedAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LowerThanMinimum(formattedAmount=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.formattedAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.LowerThanMinimum) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedAmount, ((com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.LowerThanMinimum) other).formattedAmount);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.LowerThanMinimum copy(java.lang.String formattedAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedAmount, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.LowerThanMinimum(formattedAmount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.LowerThanMinimum copy$default(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.LowerThanMinimum lowerThanMinimum, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = lowerThanMinimum.formattedAmount;
            }
            return lowerThanMinimum.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountValidationType$LowerThanThreshold;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountValidationType;", "", "formattedAmount", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountValidationType$LowerThanThreshold;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFormattedAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LowerThanThreshold implements com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType {
        public static final int $stable = 0;
        private final java.lang.String formattedAmount;

        public LowerThanThreshold(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.formattedAmount = str;
        }

        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.formattedAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LowerThanThreshold(formattedAmount=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.formattedAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.LowerThanThreshold) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedAmount, ((com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.LowerThanThreshold) other).formattedAmount);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.LowerThanThreshold copy(java.lang.String formattedAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedAmount, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.LowerThanThreshold(formattedAmount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.LowerThanThreshold copy$default(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.LowerThanThreshold lowerThanThreshold, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = lowerThanThreshold.formattedAmount;
            }
            return lowerThanThreshold.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountValidationType$HigherThanMaximum;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountValidationType;", "", "formattedAmount", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountValidationType$HigherThanMaximum;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFormattedAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HigherThanMaximum implements com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType {
        public static final int $stable = 0;
        private final java.lang.String formattedAmount;

        public HigherThanMaximum(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.formattedAmount = str;
        }

        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.formattedAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HigherThanMaximum(formattedAmount=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.formattedAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.HigherThanMaximum) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedAmount, ((com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.HigherThanMaximum) other).formattedAmount);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.HigherThanMaximum copy(java.lang.String formattedAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedAmount, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.HigherThanMaximum(formattedAmount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.HigherThanMaximum copy$default(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.HigherThanMaximum higherThanMaximum, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = higherThanMaximum.formattedAmount;
            }
            return higherThanMaximum.copy(str);
        }
    }
}
