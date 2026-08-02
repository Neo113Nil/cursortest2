package com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateToOTPVerification", "NavigateBack", "ShowErrorToast", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiEffect$NavigateToOTPVerification;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiEffect$ShowErrorToast;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PhoneConfirmationUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private PhoneConfirmationUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiEffect$NavigateToOTPVerification;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiEffect;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/navigation/OTPVerificationScreenDestination;", "destination", "<init>", "(Lcom/paypal/oslo/feature/identity/phoneconfirmation/navigation/OTPVerificationScreenDestination;)V", "component1", "()Lcom/paypal/oslo/feature/identity/phoneconfirmation/navigation/OTPVerificationScreenDestination;", "copy", "(Lcom/paypal/oslo/feature/identity/phoneconfirmation/navigation/OTPVerificationScreenDestination;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiEffect$NavigateToOTPVerification;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/navigation/OTPVerificationScreenDestination;", "getDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToOTPVerification extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.phoneconfirmation.navigation.OTPVerificationScreenDestination destination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToOTPVerification(com.paypal.oslo.feature.identity.phoneconfirmation.navigation.OTPVerificationScreenDestination oTPVerificationScreenDestination) {
            super("NavigateToOTPVerification", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oTPVerificationScreenDestination, "");
            this.destination = oTPVerificationScreenDestination;
        }

        public final com.paypal.oslo.feature.identity.phoneconfirmation.navigation.OTPVerificationScreenDestination getDestination() {
            return this.destination;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.phoneconfirmation.navigation.OTPVerificationScreenDestination oTPVerificationScreenDestination = this.destination;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToOTPVerification(destination=");
            sb.append(oTPVerificationScreenDestination);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.destination.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect.NavigateToOTPVerification) && kotlin.jvm.internal.Intrinsics.areEqual(this.destination, ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect.NavigateToOTPVerification) other).destination);
        }

        public final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect.NavigateToOTPVerification copy(com.paypal.oslo.feature.identity.phoneconfirmation.navigation.OTPVerificationScreenDestination destination) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
            return new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect.NavigateToOTPVerification(destination);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.phoneconfirmation.navigation.OTPVerificationScreenDestination getDestination() {
            return this.destination;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect.NavigateToOTPVerification copy$default(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect.NavigateToOTPVerification navigateToOTPVerification, com.paypal.oslo.feature.identity.phoneconfirmation.navigation.OTPVerificationScreenDestination oTPVerificationScreenDestination, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                oTPVerificationScreenDestination = navigateToOTPVerification.destination;
            }
            return navigateToOTPVerification.copy(oTPVerificationScreenDestination);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect.NavigateBack();

        public final int hashCode() {
            return 344684188;
        }

        private NavigateBack() {
            super("NavigateBack", null);
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiEffect$ShowErrorToast;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiEffect;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiEffect$ShowErrorToast;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowErrorToast extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowErrorToast(java.lang.String str) {
            super("ShowErrorToast", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowErrorToast(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect.ShowErrorToast) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect.ShowErrorToast) other).message);
        }

        public final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect.ShowErrorToast copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect.ShowErrorToast(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect.ShowErrorToast copy$default(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect.ShowErrorToast showErrorToast, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showErrorToast.message;
            }
            return showErrorToast.copy(str);
        }
    }

    public /* synthetic */ PhoneConfirmationUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
