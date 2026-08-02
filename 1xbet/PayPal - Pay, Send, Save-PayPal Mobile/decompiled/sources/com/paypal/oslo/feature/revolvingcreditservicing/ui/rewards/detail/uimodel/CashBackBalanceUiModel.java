package com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/CashBackBalanceUiModel;", "", "Positive", "Zero", "Negative", "Error", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/CashBackBalanceUiModel$Error;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/CashBackBalanceUiModel$Negative;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/CashBackBalanceUiModel$Positive;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/CashBackBalanceUiModel$Zero;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface CashBackBalanceUiModel {

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/CashBackBalanceUiModel$Positive;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/CashBackBalanceUiModel;", "", "amount", "", "formattedAmount", "<init>", "(FLjava/lang/String;)V", "component1", "()F", "component2", "()Ljava/lang/String;", "copy", "(FLjava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/CashBackBalanceUiModel$Positive;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getAmount", "Ljava/lang/String;", "getFormattedAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final /* data */ class Positive implements com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel {
        public static final int $stable = 0;
        private final float amount;
        private final java.lang.String formattedAmount;

        public Positive(float f, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.amount = f;
            this.formattedAmount = str;
        }

        public final float getAmount() {
            return this.amount;
        }

        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        public final java.lang.String toString() {
            float f = this.amount;
            java.lang.String str = this.formattedAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Positive(amount=");
            sb.append(f);
            sb.append(", formattedAmount=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Float.hashCode(this.amount) * 31) + this.formattedAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel.Positive)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel.Positive positive = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel.Positive) other;
            return java.lang.Float.compare(this.amount, positive.amount) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedAmount, positive.formattedAmount);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel.Positive copy(float amount, java.lang.String formattedAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedAmount, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel.Positive(amount, formattedAmount);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final float getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel.Positive copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel.Positive positive, float f, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = positive.amount;
            }
            if ((i & 2) != 0) {
                str = positive.formattedAmount;
            }
            return positive.copy(f, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/CashBackBalanceUiModel$Zero;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/CashBackBalanceUiModel;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final /* data */ class Zero implements com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel.Zero INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel.Zero();

        public final int hashCode() {
            return -987222079;
        }

        private Zero() {
        }

        public final java.lang.String toString() {
            return "Zero";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel.Zero)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/CashBackBalanceUiModel$Negative;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/CashBackBalanceUiModel;", "", "amount", "", "formattedAmount", "<init>", "(FLjava/lang/String;)V", "component1", "()F", "component2", "()Ljava/lang/String;", "copy", "(FLjava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/CashBackBalanceUiModel$Negative;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getAmount", "Ljava/lang/String;", "getFormattedAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final /* data */ class Negative implements com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel {
        public static final int $stable = 0;
        private final float amount;
        private final java.lang.String formattedAmount;

        public Negative(float f, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.amount = f;
            this.formattedAmount = str;
        }

        public final float getAmount() {
            return this.amount;
        }

        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        public final java.lang.String toString() {
            float f = this.amount;
            java.lang.String str = this.formattedAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Negative(amount=");
            sb.append(f);
            sb.append(", formattedAmount=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Float.hashCode(this.amount) * 31) + this.formattedAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel.Negative)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel.Negative negative = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel.Negative) other;
            return java.lang.Float.compare(this.amount, negative.amount) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedAmount, negative.formattedAmount);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel.Negative copy(float amount, java.lang.String formattedAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedAmount, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel.Negative(amount, formattedAmount);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final float getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel.Negative copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel.Negative negative, float f, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = negative.amount;
            }
            if ((i & 2) != 0) {
                str = negative.formattedAmount;
            }
            return negative.copy(f, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/CashBackBalanceUiModel$Error;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/CashBackBalanceUiModel;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final /* data */ class Error implements com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel.Error INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel.Error();

        public final int hashCode() {
            return -558119921;
        }

        private Error() {
        }

        public final java.lang.String toString() {
            return "Error";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.CashBackBalanceUiModel.Error)) {
                return false;
            }
            return true;
        }
    }
}
