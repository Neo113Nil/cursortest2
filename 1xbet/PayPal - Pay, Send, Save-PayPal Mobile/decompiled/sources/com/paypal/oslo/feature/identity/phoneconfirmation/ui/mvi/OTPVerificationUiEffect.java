package com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "VerificationComplete", "NavigateBack", "ShowSuccessToast", "ShowErrorToast", "HideKeyboard", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiEffect$HideKeyboard;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiEffect$ShowErrorToast;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiEffect$ShowSuccessToast;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiEffect$VerificationComplete;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class OTPVerificationUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private OTPVerificationUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiEffect$VerificationComplete;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiEffect;", "", "phoneNumber", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiEffect$VerificationComplete;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPhoneNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class VerificationComplete extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect {
        public static final int $stable = 0;
        private final java.lang.String phoneNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VerificationComplete(java.lang.String str) {
            super("VerificationComplete", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.phoneNumber = str;
        }

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.phoneNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("VerificationComplete(phoneNumber=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.phoneNumber.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.VerificationComplete) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.VerificationComplete) other).phoneNumber);
        }

        public final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.VerificationComplete copy(java.lang.String phoneNumber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
            return new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.VerificationComplete(phoneNumber);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.VerificationComplete copy$default(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.VerificationComplete verificationComplete, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = verificationComplete.phoneNumber;
            }
            return verificationComplete.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.NavigateBack();

        public final int hashCode() {
            return 443039193;
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
            if (!(other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiEffect$ShowSuccessToast;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiEffect;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiEffect$ShowSuccessToast;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowSuccessToast extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowSuccessToast(java.lang.String str) {
            super("ShowSuccessToast", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowSuccessToast(message=");
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
            return (other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.ShowSuccessToast) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.ShowSuccessToast) other).message);
        }

        public final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.ShowSuccessToast copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.ShowSuccessToast(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.ShowSuccessToast copy$default(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.ShowSuccessToast showSuccessToast, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showSuccessToast.message;
            }
            return showSuccessToast.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiEffect$ShowErrorToast;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiEffect;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiEffect$ShowErrorToast;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowErrorToast extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect {
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
            return (other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.ShowErrorToast) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.ShowErrorToast) other).message);
        }

        public final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.ShowErrorToast copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.ShowErrorToast(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.ShowErrorToast copy$default(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.ShowErrorToast showErrorToast, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showErrorToast.message;
            }
            return showErrorToast.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiEffect$HideKeyboard;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HideKeyboard extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.HideKeyboard INSTANCE = new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.HideKeyboard();

        public final int hashCode() {
            return -1802325206;
        }

        private HideKeyboard() {
            super("HideKeyboard", null);
        }

        public final java.lang.String toString() {
            return "HideKeyboard";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiEffect.HideKeyboard)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ OTPVerificationUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
