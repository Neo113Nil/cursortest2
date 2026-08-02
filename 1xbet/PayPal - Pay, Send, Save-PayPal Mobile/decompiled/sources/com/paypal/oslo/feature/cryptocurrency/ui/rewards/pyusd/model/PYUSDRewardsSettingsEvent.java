package com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsSettingsEvent;", "", "RewardsToggleChange", "UnEnrollConfirmClick", "UnEnrollCancelClick", "UnEnrollCloseClick", "ProvisioningCompleted", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsSettingsEvent$ProvisioningCompleted;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsSettingsEvent$RewardsToggleChange;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsSettingsEvent$UnEnrollCancelClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsSettingsEvent$UnEnrollCloseClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsSettingsEvent$UnEnrollConfirmClick;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface PYUSDRewardsSettingsEvent {

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsSettingsEvent$RewardsToggleChange;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsSettingsEvent;", "", "enabled", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsSettingsEvent$RewardsToggleChange;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RewardsToggleChange implements com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent {
        public static final int $stable = 0;
        private final boolean enabled;

        public RewardsToggleChange(boolean z) {
            this.enabled = z;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final java.lang.String toString() {
            boolean z = this.enabled;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RewardsToggleChange(enabled=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.enabled);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent.RewardsToggleChange) && this.enabled == ((com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent.RewardsToggleChange) other).enabled;
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent.RewardsToggleChange copy(boolean enabled) {
            return new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent.RewardsToggleChange(enabled);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent.RewardsToggleChange copy$default(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent.RewardsToggleChange rewardsToggleChange, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = rewardsToggleChange.enabled;
            }
            return rewardsToggleChange.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsSettingsEvent$UnEnrollConfirmClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsSettingsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnEnrollConfirmClick implements com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent.UnEnrollConfirmClick INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent.UnEnrollConfirmClick();

        public final int hashCode() {
            return 1172747124;
        }

        private UnEnrollConfirmClick() {
        }

        public final java.lang.String toString() {
            return "UnEnrollConfirmClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent.UnEnrollConfirmClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsSettingsEvent$UnEnrollCancelClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsSettingsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnEnrollCancelClick implements com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent.UnEnrollCancelClick INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent.UnEnrollCancelClick();

        public final int hashCode() {
            return 312954082;
        }

        private UnEnrollCancelClick() {
        }

        public final java.lang.String toString() {
            return "UnEnrollCancelClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent.UnEnrollCancelClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsSettingsEvent$UnEnrollCloseClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsSettingsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnEnrollCloseClick implements com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent.UnEnrollCloseClick INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent.UnEnrollCloseClick();

        public final int hashCode() {
            return -224902596;
        }

        private UnEnrollCloseClick() {
        }

        public final java.lang.String toString() {
            return "UnEnrollCloseClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent.UnEnrollCloseClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsSettingsEvent$ProvisioningCompleted;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsSettingsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProvisioningCompleted implements com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent.ProvisioningCompleted INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent.ProvisioningCompleted();

        public final int hashCode() {
            return -361671439;
        }

        private ProvisioningCompleted() {
        }

        public final java.lang.String toString() {
            return "ProvisioningCompleted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEvent.ProvisioningCompleted)) {
                return false;
            }
            return true;
        }
    }
}
