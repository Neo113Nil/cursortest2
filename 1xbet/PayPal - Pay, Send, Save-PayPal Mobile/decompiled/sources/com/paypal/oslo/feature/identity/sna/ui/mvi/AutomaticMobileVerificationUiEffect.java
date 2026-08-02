package com.paypal.oslo.feature.identity.sna.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "ShowError", "NavigateToPrivacyPolicy", "NavigateToUpdateNumber", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationUiEffect$NavigateToPrivacyPolicy;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationUiEffect$NavigateToUpdateNumber;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationUiEffect$ShowError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class AutomaticMobileVerificationUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private AutomaticMobileVerificationUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationUiEffect$ShowError;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationUiEffect;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationUiEffect$ShowError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowError extends com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiEffect {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowError(java.lang.String str) {
            super("ShowError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowError(message=");
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
            return (other instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiEffect.ShowError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiEffect.ShowError) other).message);
        }

        public final com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiEffect.ShowError copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiEffect.ShowError(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiEffect.ShowError copy$default(com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiEffect.ShowError showError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showError.message;
            }
            return showError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationUiEffect$NavigateToPrivacyPolicy;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToPrivacyPolicy extends com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiEffect.NavigateToPrivacyPolicy INSTANCE = new com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiEffect.NavigateToPrivacyPolicy();

        public final int hashCode() {
            return -1259652084;
        }

        private NavigateToPrivacyPolicy() {
            super("NavigateToPrivacyPolicy", null);
        }

        public final java.lang.String toString() {
            return "NavigateToPrivacyPolicy";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiEffect.NavigateToPrivacyPolicy)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationUiEffect$NavigateToUpdateNumber;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToUpdateNumber extends com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiEffect.NavigateToUpdateNumber INSTANCE = new com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiEffect.NavigateToUpdateNumber();

        public final int hashCode() {
            return -1449997824;
        }

        private NavigateToUpdateNumber() {
            super("NavigateToUpdateNumber", null);
        }

        public final java.lang.String toString() {
            return "NavigateToUpdateNumber";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiEffect.NavigateToUpdateNumber)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ AutomaticMobileVerificationUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
