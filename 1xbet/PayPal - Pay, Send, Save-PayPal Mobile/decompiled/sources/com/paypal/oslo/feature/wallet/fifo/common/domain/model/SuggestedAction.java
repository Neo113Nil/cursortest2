package com.paypal.oslo.feature.wallet.fifo.common.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u0000 \u00022\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/SuggestedAction;", "", "Companion", "StandardDeposit", "StandardWithdraw", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/SuggestedAction$StandardDeposit;", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/SuggestedAction$StandardWithdraw;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface SuggestedAction {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction.Companion INSTANCE = com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction.Companion.getHighSpeedVideoSizes;
    public static final java.lang.String REMEDIAL_STEP_PROVISIONING_REQUIRED = "PROVISIONING_REQUIRED";

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/SuggestedAction$Companion;", "", "<init>", "()V", "", "REMEDIAL_STEP_PROVISIONING_REQUIRED", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public static final java.lang.String REMEDIAL_STEP_PROVISIONING_REQUIRED = "PROVISIONING_REQUIRED";
        static final /* synthetic */ com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction.Companion getHighSpeedVideoSizes = new com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction.Companion();

        private Companion() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/SuggestedAction$StandardDeposit;", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/SuggestedAction;", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/CIPStatus;", "cipStatus", "", "remedialSteps", "<init>", "(Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/CIPStatus;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/CIPStatus;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/CIPStatus;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/SuggestedAction$StandardDeposit;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/CIPStatus;", "getCipStatus", "Ljava/lang/String;", "getRemedialSteps"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StandardDeposit implements com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus cipStatus;
        private final java.lang.String remedialSteps;

        public StandardDeposit(com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus cIPStatus, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cIPStatus, "");
            this.cipStatus = cIPStatus;
            this.remedialSteps = str;
        }

        public final com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus getCipStatus() {
            return this.cipStatus;
        }

        public final java.lang.String getRemedialSteps() {
            return this.remedialSteps;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus cIPStatus = this.cipStatus;
            java.lang.String str = this.remedialSteps;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StandardDeposit(cipStatus=");
            sb.append(cIPStatus);
            sb.append(", remedialSteps=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.cipStatus.hashCode();
            java.lang.String str = this.remedialSteps;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction.StandardDeposit)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction.StandardDeposit standardDeposit = (com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction.StandardDeposit) other;
            return this.cipStatus == standardDeposit.cipStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.remedialSteps, standardDeposit.remedialSteps);
        }

        public final com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction.StandardDeposit copy(com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus cipStatus, java.lang.String remedialSteps) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cipStatus, "");
            return new com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction.StandardDeposit(cipStatus, remedialSteps);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getRemedialSteps() {
            return this.remedialSteps;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus getCipStatus() {
            return this.cipStatus;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction.StandardDeposit copy$default(com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction.StandardDeposit standardDeposit, com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus cIPStatus, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cIPStatus = standardDeposit.cipStatus;
            }
            if ((i & 2) != 0) {
                str = standardDeposit.remedialSteps;
            }
            return standardDeposit.copy(cIPStatus, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/SuggestedAction$StandardWithdraw;", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/SuggestedAction;", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/CIPStatus;", "cipStatus", "", "remedialSteps", "<init>", "(Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/CIPStatus;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/CIPStatus;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/CIPStatus;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/SuggestedAction$StandardWithdraw;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/CIPStatus;", "getCipStatus", "Ljava/lang/String;", "getRemedialSteps"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StandardWithdraw implements com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus cipStatus;
        private final java.lang.String remedialSteps;

        public StandardWithdraw(com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus cIPStatus, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cIPStatus, "");
            this.cipStatus = cIPStatus;
            this.remedialSteps = str;
        }

        public final com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus getCipStatus() {
            return this.cipStatus;
        }

        public final java.lang.String getRemedialSteps() {
            return this.remedialSteps;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus cIPStatus = this.cipStatus;
            java.lang.String str = this.remedialSteps;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StandardWithdraw(cipStatus=");
            sb.append(cIPStatus);
            sb.append(", remedialSteps=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.cipStatus.hashCode();
            java.lang.String str = this.remedialSteps;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction.StandardWithdraw)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction.StandardWithdraw standardWithdraw = (com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction.StandardWithdraw) other;
            return this.cipStatus == standardWithdraw.cipStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.remedialSteps, standardWithdraw.remedialSteps);
        }

        public final com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction.StandardWithdraw copy(com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus cipStatus, java.lang.String remedialSteps) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cipStatus, "");
            return new com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction.StandardWithdraw(cipStatus, remedialSteps);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getRemedialSteps() {
            return this.remedialSteps;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus getCipStatus() {
            return this.cipStatus;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction.StandardWithdraw copy$default(com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction.StandardWithdraw standardWithdraw, com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus cIPStatus, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cIPStatus = standardWithdraw.cipStatus;
            }
            if ((i & 2) != 0) {
                str = standardWithdraw.remedialSteps;
            }
            return standardWithdraw.copy(cIPStatus, str);
        }
    }
}
