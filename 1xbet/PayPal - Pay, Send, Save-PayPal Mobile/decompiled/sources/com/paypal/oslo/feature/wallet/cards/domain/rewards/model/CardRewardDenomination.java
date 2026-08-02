package com.paypal.oslo.feature.wallet.cards.domain.rewards.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardDenomination;", "", "Money", "Points", "Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardDenomination$Money;", "Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardDenomination$Points;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface CardRewardDenomination {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardDenomination$Money;", "Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardDenomination;", "", "currencyCode", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardDenomination$Money;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCurrencyCode", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Money implements com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardDenomination {
        public static final int $stable = 0;
        private final java.lang.String currencyCode;
        private final java.lang.String value;

        public Money(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.currencyCode = str;
            this.value = str2;
        }

        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.currencyCode;
            java.lang.String str2 = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Money(currencyCode=");
            sb.append(str);
            sb.append(", value=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.currencyCode.hashCode() * 31) + this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardDenomination.Money)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardDenomination.Money money = (com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardDenomination.Money) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, money.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, money.value);
        }

        public final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardDenomination.Money copy(java.lang.String currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardDenomination.Money(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardDenomination.Money copy$default(com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardDenomination.Money money, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = money.currencyCode;
            }
            if ((i & 2) != 0) {
                str2 = money.value;
            }
            return money.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardDenomination$Points;", "Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardDenomination;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "programCode", "programDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardDenomination$Points;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue", "getProgramCode", "getProgramDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Points implements com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardDenomination {
        public static final int $stable = 0;
        private final java.lang.String programCode;
        private final java.lang.String programDescription;
        private final java.lang.String value;

        public Points(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.value = str;
            this.programCode = str2;
            this.programDescription = str3;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String getProgramCode() {
            return this.programCode;
        }

        public final java.lang.String getProgramDescription() {
            return this.programDescription;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.value;
            java.lang.String str2 = this.programCode;
            java.lang.String str3 = this.programDescription;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Points(value=");
            sb.append(str);
            sb.append(", programCode=");
            sb.append(str2);
            sb.append(", programDescription=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.value.hashCode();
            int hashCode2 = this.programCode.hashCode();
            java.lang.String str = this.programDescription;
            return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardDenomination.Points)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardDenomination.Points points = (com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardDenomination.Points) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.value, points.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.programCode, points.programCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.programDescription, points.programDescription);
        }

        public final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardDenomination.Points copy(java.lang.String value, java.lang.String programCode, java.lang.String programDescription) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(programCode, "");
            return new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardDenomination.Points(value, programCode, programDescription);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getProgramDescription() {
            return this.programDescription;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getProgramCode() {
            return this.programCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardDenomination.Points copy$default(com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardDenomination.Points points, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = points.value;
            }
            if ((i & 2) != 0) {
                str2 = points.programCode;
            }
            if ((i & 4) != 0) {
                str3 = points.programDescription;
            }
            return points.copy(str, str2, str3);
        }
    }
}
