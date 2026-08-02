package com.paypal.oslo.feature.subscriptions.cancel.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/cancel/ui/UnlinkConfirmationUiEvent;", "", "OnDismissed", "OnBackButtonClicked", "OnCloseButtonClicked", "OnPrimaryButtonClicked", "OnSecondaryButtonClicked", "Lcom/paypal/oslo/feature/subscriptions/cancel/ui/UnlinkConfirmationUiEvent$OnBackButtonClicked;", "Lcom/paypal/oslo/feature/subscriptions/cancel/ui/UnlinkConfirmationUiEvent$OnCloseButtonClicked;", "Lcom/paypal/oslo/feature/subscriptions/cancel/ui/UnlinkConfirmationUiEvent$OnDismissed;", "Lcom/paypal/oslo/feature/subscriptions/cancel/ui/UnlinkConfirmationUiEvent$OnPrimaryButtonClicked;", "Lcom/paypal/oslo/feature/subscriptions/cancel/ui/UnlinkConfirmationUiEvent$OnSecondaryButtonClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface UnlinkConfirmationUiEvent {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/cancel/ui/UnlinkConfirmationUiEvent$OnDismissed;", "Lcom/paypal/oslo/feature/subscriptions/cancel/ui/UnlinkConfirmationUiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDismissed implements com.paypal.oslo.feature.subscriptions.cancel.ui.UnlinkConfirmationUiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.cancel.ui.UnlinkConfirmationUiEvent.OnDismissed INSTANCE = new com.paypal.oslo.feature.subscriptions.cancel.ui.UnlinkConfirmationUiEvent.OnDismissed();

        public final int hashCode() {
            return -1422239157;
        }

        private OnDismissed() {
        }

        public final java.lang.String toString() {
            return "OnDismissed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.cancel.ui.UnlinkConfirmationUiEvent.OnDismissed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/cancel/ui/UnlinkConfirmationUiEvent$OnBackButtonClicked;", "Lcom/paypal/oslo/feature/subscriptions/cancel/ui/UnlinkConfirmationUiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBackButtonClicked implements com.paypal.oslo.feature.subscriptions.cancel.ui.UnlinkConfirmationUiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.cancel.ui.UnlinkConfirmationUiEvent.OnBackButtonClicked INSTANCE = new com.paypal.oslo.feature.subscriptions.cancel.ui.UnlinkConfirmationUiEvent.OnBackButtonClicked();

        public final int hashCode() {
            return 2009911952;
        }

        private OnBackButtonClicked() {
        }

        public final java.lang.String toString() {
            return "OnBackButtonClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.cancel.ui.UnlinkConfirmationUiEvent.OnBackButtonClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/cancel/ui/UnlinkConfirmationUiEvent$OnCloseButtonClicked;", "Lcom/paypal/oslo/feature/subscriptions/cancel/ui/UnlinkConfirmationUiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCloseButtonClicked implements com.paypal.oslo.feature.subscriptions.cancel.ui.UnlinkConfirmationUiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.cancel.ui.UnlinkConfirmationUiEvent.OnCloseButtonClicked INSTANCE = new com.paypal.oslo.feature.subscriptions.cancel.ui.UnlinkConfirmationUiEvent.OnCloseButtonClicked();

        public final int hashCode() {
            return -581055973;
        }

        private OnCloseButtonClicked() {
        }

        public final java.lang.String toString() {
            return "OnCloseButtonClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.cancel.ui.UnlinkConfirmationUiEvent.OnCloseButtonClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/cancel/ui/UnlinkConfirmationUiEvent$OnPrimaryButtonClicked;", "Lcom/paypal/oslo/feature/subscriptions/cancel/ui/UnlinkConfirmationUiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPrimaryButtonClicked implements com.paypal.oslo.feature.subscriptions.cancel.ui.UnlinkConfirmationUiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.cancel.ui.UnlinkConfirmationUiEvent.OnPrimaryButtonClicked INSTANCE = new com.paypal.oslo.feature.subscriptions.cancel.ui.UnlinkConfirmationUiEvent.OnPrimaryButtonClicked();

        public final int hashCode() {
            return -2112304431;
        }

        private OnPrimaryButtonClicked() {
        }

        public final java.lang.String toString() {
            return "OnPrimaryButtonClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.cancel.ui.UnlinkConfirmationUiEvent.OnPrimaryButtonClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/cancel/ui/UnlinkConfirmationUiEvent$OnSecondaryButtonClicked;", "Lcom/paypal/oslo/feature/subscriptions/cancel/ui/UnlinkConfirmationUiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSecondaryButtonClicked implements com.paypal.oslo.feature.subscriptions.cancel.ui.UnlinkConfirmationUiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.cancel.ui.UnlinkConfirmationUiEvent.OnSecondaryButtonClicked INSTANCE = new com.paypal.oslo.feature.subscriptions.cancel.ui.UnlinkConfirmationUiEvent.OnSecondaryButtonClicked();

        public final int hashCode() {
            return -564772577;
        }

        private OnSecondaryButtonClicked() {
        }

        public final java.lang.String toString() {
            return "OnSecondaryButtonClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.cancel.ui.UnlinkConfirmationUiEvent.OnSecondaryButtonClicked)) {
                return false;
            }
            return true;
        }
    }
}
