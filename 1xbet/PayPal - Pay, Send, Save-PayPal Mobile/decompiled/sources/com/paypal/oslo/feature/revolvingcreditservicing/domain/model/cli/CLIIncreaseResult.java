package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncreaseResult;", "", "<init>", "()V", "Approved", "Declined", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncreaseResult$Approved;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncreaseResult$Declined;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class CLIIncreaseResult {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncreaseResult$Approved;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncreaseResult;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "approvedCreditLimit", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncreaseStatus;", "status", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncreaseStatus;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncreaseStatus;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncreaseStatus;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncreaseResult$Approved;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "getApprovedCreditLimit", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncreaseStatus;", "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Approved extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount approvedCreditLimit;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseStatus status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Approved(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseStatus cLIIncreaseStatus) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cLIIncreaseStatus, "");
            this.approvedCreditLimit = currencyAmount;
            this.status = cLIIncreaseStatus;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getApprovedCreditLimit() {
            return this.approvedCreditLimit;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseStatus getStatus() {
            return this.status;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = this.approvedCreditLimit;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseStatus cLIIncreaseStatus = this.status;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Approved(approvedCreditLimit=");
            sb.append(currencyAmount);
            sb.append(", status=");
            sb.append(cLIIncreaseStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.approvedCreditLimit.hashCode() * 31) + this.status.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult.Approved)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult.Approved approved = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult.Approved) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.approvedCreditLimit, approved.approvedCreditLimit) && this.status == approved.status;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult.Approved copy(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount approvedCreditLimit, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseStatus status) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(approvedCreditLimit, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult.Approved(approvedCreditLimit, status);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseStatus getStatus() {
            return this.status;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getApprovedCreditLimit() {
            return this.approvedCreditLimit;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult.Approved copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult.Approved approved, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseStatus cLIIncreaseStatus, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                currencyAmount = approved.approvedCreditLimit;
            }
            if ((i & 2) != 0) {
                cLIIncreaseStatus = approved.status;
            }
            return approved.copy(currencyAmount, cLIIncreaseStatus);
        }
    }

    private CLIIncreaseResult() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncreaseResult$Declined;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncreaseResult;", "", "creditAccountId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncreaseResult$Declined;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditAccountId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Declined extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult {
        public static final int $stable = 0;
        private final java.lang.String creditAccountId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Declined(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.creditAccountId = str;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.creditAccountId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Declined(creditAccountId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.creditAccountId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult.Declined) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, ((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult.Declined) other).creditAccountId);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult.Declined copy(java.lang.String creditAccountId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult.Declined(creditAccountId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult.Declined copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult.Declined declined, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = declined.creditAccountId;
            }
            return declined.copy(str);
        }
    }

    public /* synthetic */ CLIIncreaseResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
