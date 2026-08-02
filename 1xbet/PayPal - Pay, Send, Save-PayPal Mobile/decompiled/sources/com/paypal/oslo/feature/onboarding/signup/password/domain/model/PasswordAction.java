package com.paypal.oslo.feature.onboarding.signup.password.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/password/domain/model/PasswordAction;", "", "<init>", "()V", "LaunchSavePasswordManager", "NavigateToNextScreen", "Lcom/paypal/oslo/feature/onboarding/signup/password/domain/model/PasswordAction$LaunchSavePasswordManager;", "Lcom/paypal/oslo/feature/onboarding/signup/password/domain/model/PasswordAction$NavigateToNextScreen;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PasswordAction {
    public static final int $stable = 0;

    private PasswordAction() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/password/domain/model/PasswordAction$LaunchSavePasswordManager;", "Lcom/paypal/oslo/feature/onboarding/signup/password/domain/model/PasswordAction;", "", "email", "password", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/signup/password/domain/model/PasswordAction$LaunchSavePasswordManager;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getEmail", "getPassword"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LaunchSavePasswordManager extends com.paypal.oslo.feature.onboarding.signup.password.domain.model.PasswordAction {
        public static final int $stable = 0;
        private final java.lang.String email;
        private final java.lang.String password;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LaunchSavePasswordManager(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.email = str;
            this.password = str2;
        }

        public final java.lang.String getEmail() {
            return this.email;
        }

        public final java.lang.String getPassword() {
            return this.password;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.email;
            java.lang.String str2 = this.password;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LaunchSavePasswordManager(email=");
            sb.append(str);
            sb.append(", password=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.email.hashCode() * 31) + this.password.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.password.domain.model.PasswordAction.LaunchSavePasswordManager)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.signup.password.domain.model.PasswordAction.LaunchSavePasswordManager launchSavePasswordManager = (com.paypal.oslo.feature.onboarding.signup.password.domain.model.PasswordAction.LaunchSavePasswordManager) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.email, launchSavePasswordManager.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.password, launchSavePasswordManager.password);
        }

        public final com.paypal.oslo.feature.onboarding.signup.password.domain.model.PasswordAction.LaunchSavePasswordManager copy(java.lang.String email, java.lang.String password) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "");
            return new com.paypal.oslo.feature.onboarding.signup.password.domain.model.PasswordAction.LaunchSavePasswordManager(email, password);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPassword() {
            return this.password;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getEmail() {
            return this.email;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.password.domain.model.PasswordAction.LaunchSavePasswordManager copy$default(com.paypal.oslo.feature.onboarding.signup.password.domain.model.PasswordAction.LaunchSavePasswordManager launchSavePasswordManager, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = launchSavePasswordManager.email;
            }
            if ((i & 2) != 0) {
                str2 = launchSavePasswordManager.password;
            }
            return launchSavePasswordManager.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/password/domain/model/PasswordAction$NavigateToNextScreen;", "Lcom/paypal/oslo/feature/onboarding/signup/password/domain/model/PasswordAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToNextScreen extends com.paypal.oslo.feature.onboarding.signup.password.domain.model.PasswordAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.onboarding.signup.password.domain.model.PasswordAction.NavigateToNextScreen INSTANCE = new com.paypal.oslo.feature.onboarding.signup.password.domain.model.PasswordAction.NavigateToNextScreen();

        public final int hashCode() {
            return -1662315880;
        }

        private NavigateToNextScreen() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NavigateToNextScreen";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.password.domain.model.PasswordAction.NavigateToNextScreen)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ PasswordAction(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
