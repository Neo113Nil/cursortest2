package com.paypal.oslo.feature.wallet.me.domain.bnpl;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus;", "", "DueOnSpecificDate", "DueThisWeek", "DueToday", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING, "Prequalified", com.paypal.oslo.feature.bnplservicing.ui.common.components.UnusedVirtualCardTestTag.UNUSED_VIRTUAL_CARD, "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus$DueOnSpecificDate;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus$DueThisWeek;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus$DueToday;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus$Pending;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus$Prequalified;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus$UnusedVirtualCard;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface BnplStatus {

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus$DueOnSpecificDate;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus;", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "amountDue", "", "dueDate", "<init>", "(Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus$DueOnSpecificDate;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "getAmountDue", "Ljava/lang/String;", "getDueDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DueOnSpecificDate implements com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.common.domain.model.Money amountDue;
        private final java.lang.String dueDate;

        public DueOnSpecificDate(com.paypal.oslo.feature.wallet.common.domain.model.Money money, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
            this.amountDue = money;
            this.dueDate = str;
        }

        public final com.paypal.oslo.feature.wallet.common.domain.model.Money getAmountDue() {
            return this.amountDue;
        }

        public final java.lang.String getDueDate() {
            return this.dueDate;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.common.domain.model.Money money = this.amountDue;
            java.lang.String str = this.dueDate;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DueOnSpecificDate(amountDue=");
            sb.append(money);
            sb.append(", dueDate=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.amountDue.hashCode();
            java.lang.String str = this.dueDate;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueOnSpecificDate)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueOnSpecificDate dueOnSpecificDate = (com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueOnSpecificDate) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.amountDue, dueOnSpecificDate.amountDue) && kotlin.jvm.internal.Intrinsics.areEqual(this.dueDate, dueOnSpecificDate.dueDate);
        }

        public final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueOnSpecificDate copy(com.paypal.oslo.feature.wallet.common.domain.model.Money amountDue, java.lang.String dueDate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountDue, "");
            return new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueOnSpecificDate(amountDue, dueDate);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getDueDate() {
            return this.dueDate;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.common.domain.model.Money getAmountDue() {
            return this.amountDue;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueOnSpecificDate copy$default(com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueOnSpecificDate dueOnSpecificDate, com.paypal.oslo.feature.wallet.common.domain.model.Money money, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                money = dueOnSpecificDate.amountDue;
            }
            if ((i & 2) != 0) {
                str = dueOnSpecificDate.dueDate;
            }
            return dueOnSpecificDate.copy(money, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus$DueThisWeek;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus;", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "amountDue", "<init>", "(Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "copy", "(Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;)Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus$DueThisWeek;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "getAmountDue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DueThisWeek implements com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.common.domain.model.Money amountDue;

        public DueThisWeek(com.paypal.oslo.feature.wallet.common.domain.model.Money money) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
            this.amountDue = money;
        }

        public final com.paypal.oslo.feature.wallet.common.domain.model.Money getAmountDue() {
            return this.amountDue;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.common.domain.model.Money money = this.amountDue;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DueThisWeek(amountDue=");
            sb.append(money);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.amountDue.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueThisWeek) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountDue, ((com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueThisWeek) other).amountDue);
        }

        public final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueThisWeek copy(com.paypal.oslo.feature.wallet.common.domain.model.Money amountDue) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountDue, "");
            return new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueThisWeek(amountDue);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.common.domain.model.Money getAmountDue() {
            return this.amountDue;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueThisWeek copy$default(com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueThisWeek dueThisWeek, com.paypal.oslo.feature.wallet.common.domain.model.Money money, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                money = dueThisWeek.amountDue;
            }
            return dueThisWeek.copy(money);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus$DueToday;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus;", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "amountDue", "<init>", "(Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "copy", "(Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;)Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus$DueToday;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "getAmountDue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DueToday implements com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.common.domain.model.Money amountDue;

        public DueToday(com.paypal.oslo.feature.wallet.common.domain.model.Money money) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
            this.amountDue = money;
        }

        public final com.paypal.oslo.feature.wallet.common.domain.model.Money getAmountDue() {
            return this.amountDue;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.common.domain.model.Money money = this.amountDue;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DueToday(amountDue=");
            sb.append(money);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.amountDue.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueToday) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountDue, ((com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueToday) other).amountDue);
        }

        public final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueToday copy(com.paypal.oslo.feature.wallet.common.domain.model.Money amountDue) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountDue, "");
            return new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueToday(amountDue);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.common.domain.model.Money getAmountDue() {
            return this.amountDue;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueToday copy$default(com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.DueToday dueToday, com.paypal.oslo.feature.wallet.common.domain.model.Money money, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                money = dueToday.amountDue;
            }
            return dueToday.copy(money);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus$Pending;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus;", "", "hasMultiplePendingPlans", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus$Pending;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getHasMultiplePendingPlans"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Pending implements com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus {
        public static final int $stable = 0;
        private final boolean hasMultiplePendingPlans;

        public Pending(boolean z) {
            this.hasMultiplePendingPlans = z;
        }

        public final boolean getHasMultiplePendingPlans() {
            return this.hasMultiplePendingPlans;
        }

        public final java.lang.String toString() {
            boolean z = this.hasMultiplePendingPlans;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Pending(hasMultiplePendingPlans=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.hasMultiplePendingPlans);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.Pending) && this.hasMultiplePendingPlans == ((com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.Pending) other).hasMultiplePendingPlans;
        }

        public final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.Pending copy(boolean hasMultiplePendingPlans) {
            return new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.Pending(hasMultiplePendingPlans);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getHasMultiplePendingPlans() {
            return this.hasMultiplePendingPlans;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.Pending copy$default(com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.Pending pending, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = pending.hasMultiplePendingPlans;
            }
            return pending.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus$Prequalified;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus;", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "spendingPower", "<init>", "(Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "copy", "(Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;)Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus$Prequalified;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "getSpendingPower"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Prequalified implements com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.common.domain.model.Money spendingPower;

        public Prequalified(com.paypal.oslo.feature.wallet.common.domain.model.Money money) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
            this.spendingPower = money;
        }

        public final com.paypal.oslo.feature.wallet.common.domain.model.Money getSpendingPower() {
            return this.spendingPower;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.common.domain.model.Money money = this.spendingPower;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Prequalified(spendingPower=");
            sb.append(money);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.spendingPower.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.Prequalified) && kotlin.jvm.internal.Intrinsics.areEqual(this.spendingPower, ((com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.Prequalified) other).spendingPower);
        }

        public final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.Prequalified copy(com.paypal.oslo.feature.wallet.common.domain.model.Money spendingPower) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spendingPower, "");
            return new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.Prequalified(spendingPower);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.common.domain.model.Money getSpendingPower() {
            return this.spendingPower;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.Prequalified copy$default(com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.Prequalified prequalified, com.paypal.oslo.feature.wallet.common.domain.model.Money money, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                money = prequalified.spendingPower;
            }
            return prequalified.copy(money);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus$UnusedVirtualCard;", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus;", "", "validityDuration", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus$UnusedVirtualCard;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValidityDuration"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnusedVirtualCard implements com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus {
        public static final int $stable = 0;
        private final java.lang.String validityDuration;

        public UnusedVirtualCard(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.validityDuration = str;
        }

        public final java.lang.String getValidityDuration() {
            return this.validityDuration;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.validityDuration;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnusedVirtualCard(validityDuration=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.validityDuration.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.UnusedVirtualCard) && kotlin.jvm.internal.Intrinsics.areEqual(this.validityDuration, ((com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.UnusedVirtualCard) other).validityDuration);
        }

        public final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.UnusedVirtualCard copy(java.lang.String validityDuration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validityDuration, "");
            return new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.UnusedVirtualCard(validityDuration);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValidityDuration() {
            return this.validityDuration;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.UnusedVirtualCard copy$default(com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus.UnusedVirtualCard unusedVirtualCard, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = unusedVirtualCard.validityDuration;
            }
            return unusedVirtualCard.copy(str);
        }
    }
}
