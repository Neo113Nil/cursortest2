package com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.contract;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/confirmidentity/contract/ConfirmIdentityUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "PreparingLiveness", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/confirmidentity/contract/ConfirmIdentityUiState$Initial;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/confirmidentity/contract/ConfirmIdentityUiState$PreparingLiveness;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/confirmidentity/contract/ConfirmIdentityUiState$Ready;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class ConfirmIdentityUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ConfirmIdentityUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/confirmidentity/contract/ConfirmIdentityUiState$Initial;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/confirmidentity/contract/ConfirmIdentityUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.contract.ConfirmIdentityUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.contract.ConfirmIdentityUiState.Initial INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.contract.ConfirmIdentityUiState.Initial();

        public final int hashCode() {
            return -1320439852;
        }

        private Initial() {
            super("ConfirmIdentityUiState.Initial", null);
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.contract.ConfirmIdentityUiState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/confirmidentity/contract/ConfirmIdentityUiState$Ready;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/confirmidentity/contract/ConfirmIdentityUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Ready extends com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.contract.ConfirmIdentityUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.contract.ConfirmIdentityUiState.Ready INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.contract.ConfirmIdentityUiState.Ready();

        public final int hashCode() {
            return -1468197325;
        }

        private Ready() {
            super("ConfirmIdentityUiState.Ready", null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.contract.ConfirmIdentityUiState.Ready)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/confirmidentity/contract/ConfirmIdentityUiState$PreparingLiveness;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/confirmidentity/contract/ConfirmIdentityUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PreparingLiveness extends com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.contract.ConfirmIdentityUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.contract.ConfirmIdentityUiState.PreparingLiveness INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.contract.ConfirmIdentityUiState.PreparingLiveness();

        public final int hashCode() {
            return -2035552777;
        }

        private PreparingLiveness() {
            super("ConfirmIdentityUiState.PreparingLiveness", null);
        }

        public final java.lang.String toString() {
            return "PreparingLiveness";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.contract.ConfirmIdentityUiState.PreparingLiveness)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ConfirmIdentityUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
