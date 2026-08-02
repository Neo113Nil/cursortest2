package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AddAdditionalFiFlowState;", "", "<init>", "()V", "Idle", "InProgress", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE, "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AddAdditionalFiFlowState$Completed;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AddAdditionalFiFlowState$Idle;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AddAdditionalFiFlowState$InProgress;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class AddAdditionalFiFlowState {
    public static final int $stable = 0;

    private AddAdditionalFiFlowState() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AddAdditionalFiFlowState$Idle;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AddAdditionalFiFlowState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Idle extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AddAdditionalFiFlowState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AddAdditionalFiFlowState.Idle INSTANCE = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AddAdditionalFiFlowState.Idle();

        public final int hashCode() {
            return 2131938129;
        }

        private Idle() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Idle";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AddAdditionalFiFlowState.Idle)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AddAdditionalFiFlowState$InProgress;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AddAdditionalFiFlowState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InProgress extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AddAdditionalFiFlowState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AddAdditionalFiFlowState.InProgress INSTANCE = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AddAdditionalFiFlowState.InProgress();

        public final int hashCode() {
            return -1737590737;
        }

        private InProgress() {
            super(null);
        }

        public final java.lang.String toString() {
            return "InProgress";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AddAdditionalFiFlowState.InProgress)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AddAdditionalFiFlowState$Completed;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AddAdditionalFiFlowState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Completed extends com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AddAdditionalFiFlowState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AddAdditionalFiFlowState.Completed INSTANCE = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AddAdditionalFiFlowState.Completed();

        public final int hashCode() {
            return 1493962990;
        }

        private Completed() {
            super(null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AddAdditionalFiFlowState.Completed)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ AddAdditionalFiFlowState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
