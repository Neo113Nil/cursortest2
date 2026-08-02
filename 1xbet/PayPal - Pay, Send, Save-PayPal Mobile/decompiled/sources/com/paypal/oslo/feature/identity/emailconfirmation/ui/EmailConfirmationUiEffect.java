package com.paypal.oslo.feature.identity.emailconfirmation.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateBackWithSuccess", "NavigateBackWithError", "NavigateBackWithDismiss", "Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationUiEffect$NavigateBackWithDismiss;", "Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationUiEffect$NavigateBackWithError;", "Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationUiEffect$NavigateBackWithSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class EmailConfirmationUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private EmailConfirmationUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationUiEffect$NavigateBackWithSuccess;", "Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationUiEffect;", "", "confirmedEmail", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationUiEffect$NavigateBackWithSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getConfirmedEmail"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBackWithSuccess extends com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect {
        public static final int $stable = 0;
        private final java.lang.String confirmedEmail;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateBackWithSuccess(java.lang.String str) {
            super("EmailConfirmationUiEffect.NavigateBackWithSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.confirmedEmail = str;
        }

        public final java.lang.String getConfirmedEmail() {
            return this.confirmedEmail;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.confirmedEmail;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateBackWithSuccess(confirmedEmail=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.confirmedEmail.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect.NavigateBackWithSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmedEmail, ((com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect.NavigateBackWithSuccess) other).confirmedEmail);
        }

        public final com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect.NavigateBackWithSuccess copy(java.lang.String confirmedEmail) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmedEmail, "");
            return new com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect.NavigateBackWithSuccess(confirmedEmail);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getConfirmedEmail() {
            return this.confirmedEmail;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect.NavigateBackWithSuccess copy$default(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect.NavigateBackWithSuccess navigateBackWithSuccess, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateBackWithSuccess.confirmedEmail;
            }
            return navigateBackWithSuccess.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationUiEffect$NavigateBackWithError;", "Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationUiEffect;", "Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationErrorType;", "errorType", "", "message", "<init>", "(Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationErrorType;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationErrorType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationErrorType;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationUiEffect$NavigateBackWithError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationErrorType;", "getErrorType", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBackWithError extends com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType errorType;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateBackWithError(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType emailConfirmationErrorType, java.lang.String str) {
            super("EmailConfirmationUiEffect.NavigateBackWithError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailConfirmationErrorType, "");
            this.errorType = emailConfirmationErrorType;
            this.message = str;
        }

        public final com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType getErrorType() {
            return this.errorType;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType emailConfirmationErrorType = this.errorType;
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateBackWithError(errorType=");
            sb.append(emailConfirmationErrorType);
            sb.append(", message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.errorType.hashCode();
            java.lang.String str = this.message;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect.NavigateBackWithError)) {
                return false;
            }
            com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect.NavigateBackWithError navigateBackWithError = (com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect.NavigateBackWithError) other;
            return this.errorType == navigateBackWithError.errorType && kotlin.jvm.internal.Intrinsics.areEqual(this.message, navigateBackWithError.message);
        }

        public final com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect.NavigateBackWithError copy(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType errorType, java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect.NavigateBackWithError(errorType, message);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType getErrorType() {
            return this.errorType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect.NavigateBackWithError copy$default(com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect.NavigateBackWithError navigateBackWithError, com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationErrorType emailConfirmationErrorType, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                emailConfirmationErrorType = navigateBackWithError.errorType;
            }
            if ((i & 2) != 0) {
                str = navigateBackWithError.message;
            }
            return navigateBackWithError.copy(emailConfirmationErrorType, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationUiEffect$NavigateBackWithDismiss;", "Lcom/paypal/oslo/feature/identity/emailconfirmation/ui/EmailConfirmationUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBackWithDismiss extends com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect.NavigateBackWithDismiss INSTANCE = new com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect.NavigateBackWithDismiss();

        public final int hashCode() {
            return 873373174;
        }

        private NavigateBackWithDismiss() {
            super("EmailConfirmationUiEffect.NavigateBackWithDismiss", null);
        }

        public final java.lang.String toString() {
            return "NavigateBackWithDismiss";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationUiEffect.NavigateBackWithDismiss)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ EmailConfirmationUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
