package com.paypal.oslo.feature.subscriptions.updatefi.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "NavigateToAboutPaymentMethods", "NavigateToAddPaymentMethod", "NavigateToSuccessScreen", "NavigateToErrorScreen", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiUiEffect$NavigateToAboutPaymentMethods;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiUiEffect$NavigateToAddPaymentMethod;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiUiEffect$NavigateToErrorScreen;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiUiEffect$NavigateToSuccessScreen;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface UpdateFiUiEffect extends com.paypal.oslo.core.mvi.UiEffect {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiUiEffect$NavigateToAboutPaymentMethods;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getName", "name"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAboutPaymentMethods implements com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiUiEffect.NavigateToAboutPaymentMethods INSTANCE = new com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiUiEffect.NavigateToAboutPaymentMethods();

        public final int hashCode() {
            return -628049007;
        }

        private NavigateToAboutPaymentMethods() {
        }

        @Override // com.paypal.oslo.core.mvi.UiEffect
        public final java.lang.String getName() {
            return "UpdateFiUiEffect.NavigateToAboutPaymentMethodsScreen";
        }

        public final java.lang.String toString() {
            return "NavigateToAboutPaymentMethods";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiUiEffect.NavigateToAboutPaymentMethods)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiUiEffect$NavigateToAddPaymentMethod;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getName", "name"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAddPaymentMethod implements com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiUiEffect.NavigateToAddPaymentMethod INSTANCE = new com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiUiEffect.NavigateToAddPaymentMethod();

        public final int hashCode() {
            return 1713053326;
        }

        private NavigateToAddPaymentMethod() {
        }

        @Override // com.paypal.oslo.core.mvi.UiEffect
        public final java.lang.String getName() {
            return "UpdateFiUiEffect.NavigateToAddPaymentMethod";
        }

        public final java.lang.String toString() {
            return "NavigateToAddPaymentMethod";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiUiEffect.NavigateToAddPaymentMethod)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiUiEffect$NavigateToSuccessScreen;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getName", "name"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToSuccessScreen implements com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiUiEffect.NavigateToSuccessScreen INSTANCE = new com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiUiEffect.NavigateToSuccessScreen();

        public final int hashCode() {
            return 373581863;
        }

        private NavigateToSuccessScreen() {
        }

        @Override // com.paypal.oslo.core.mvi.UiEffect
        public final java.lang.String getName() {
            return "UpdateFiUiEffect.NavigateToSuccessScreen";
        }

        public final java.lang.String toString() {
            return "NavigateToSuccessScreen";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiUiEffect.NavigateToSuccessScreen)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiUiEffect$NavigateToErrorScreen;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getName", "name"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToErrorScreen implements com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiUiEffect.NavigateToErrorScreen INSTANCE = new com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiUiEffect.NavigateToErrorScreen();

        public final int hashCode() {
            return -1753859988;
        }

        private NavigateToErrorScreen() {
        }

        @Override // com.paypal.oslo.core.mvi.UiEffect
        public final java.lang.String getName() {
            return "UpdateFiUiEffect.NavigateToErrorScreen";
        }

        public final java.lang.String toString() {
            return "NavigateToErrorScreen";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiUiEffect.NavigateToErrorScreen)) {
                return false;
            }
            return true;
        }
    }
}
