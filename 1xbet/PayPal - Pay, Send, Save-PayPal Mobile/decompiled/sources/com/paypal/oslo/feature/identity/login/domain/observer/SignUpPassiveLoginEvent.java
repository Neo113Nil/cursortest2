package com.paypal.oslo.feature.identity.login.domain.observer;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/observer/SignUpPassiveLoginEvent;", "", "<init>", "()V", "PassiveLoginSuccess", "PassiveLoginCanceled", "PassiveLoginObservationAlreadyStarted", "Lcom/paypal/oslo/feature/identity/login/domain/observer/SignUpPassiveLoginEvent$PassiveLoginCanceled;", "Lcom/paypal/oslo/feature/identity/login/domain/observer/SignUpPassiveLoginEvent$PassiveLoginObservationAlreadyStarted;", "Lcom/paypal/oslo/feature/identity/login/domain/observer/SignUpPassiveLoginEvent$PassiveLoginSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class SignUpPassiveLoginEvent {
    public static final int $stable = 0;

    private SignUpPassiveLoginEvent() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/observer/SignUpPassiveLoginEvent$PassiveLoginSuccess;", "Lcom/paypal/oslo/feature/identity/login/domain/observer/SignUpPassiveLoginEvent;", "Lcom/paypal/oslo/feature/identity/storage/model/UserAccessTokenData;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "<init>", "(Lcom/paypal/oslo/feature/identity/storage/model/UserAccessTokenData;)V", "component1", "()Lcom/paypal/oslo/feature/identity/storage/model/UserAccessTokenData;", "copy", "(Lcom/paypal/oslo/feature/identity/storage/model/UserAccessTokenData;)Lcom/paypal/oslo/feature/identity/login/domain/observer/SignUpPassiveLoginEvent$PassiveLoginSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/storage/model/UserAccessTokenData;", "getToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PassiveLoginSuccess extends com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PassiveLoginSuccess(com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData userAccessTokenData) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccessTokenData, "");
            this.token = userAccessTokenData;
        }

        public final com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData getToken() {
            return this.token;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData userAccessTokenData = this.token;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PassiveLoginSuccess(token=");
            sb.append(userAccessTokenData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.token.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent.PassiveLoginSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.token, ((com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent.PassiveLoginSuccess) other).token);
        }

        public final com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent.PassiveLoginSuccess copy(com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData token) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
            return new com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent.PassiveLoginSuccess(token);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData getToken() {
            return this.token;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent.PassiveLoginSuccess copy$default(com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent.PassiveLoginSuccess passiveLoginSuccess, com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData userAccessTokenData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                userAccessTokenData = passiveLoginSuccess.token;
            }
            return passiveLoginSuccess.copy(userAccessTokenData);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/observer/SignUpPassiveLoginEvent$PassiveLoginCanceled;", "Lcom/paypal/oslo/feature/identity/login/domain/observer/SignUpPassiveLoginEvent;", "", "error", "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/identity/login/domain/observer/SignUpPassiveLoginEvent$PassiveLoginCanceled;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PassiveLoginCanceled extends com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent {
        public static final int $stable = 8;
        private final java.lang.Throwable error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PassiveLoginCanceled(java.lang.Throwable th) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
            this.error = th;
        }

        public final java.lang.Throwable getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            java.lang.Throwable th = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PassiveLoginCanceled(error=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent.PassiveLoginCanceled) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent.PassiveLoginCanceled) other).error);
        }

        public final com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent.PassiveLoginCanceled copy(java.lang.Throwable error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent.PassiveLoginCanceled(error);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Throwable getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent.PassiveLoginCanceled copy$default(com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent.PassiveLoginCanceled passiveLoginCanceled, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = passiveLoginCanceled.error;
            }
            return passiveLoginCanceled.copy(th);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/observer/SignUpPassiveLoginEvent$PassiveLoginObservationAlreadyStarted;", "Lcom/paypal/oslo/feature/identity/login/domain/observer/SignUpPassiveLoginEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PassiveLoginObservationAlreadyStarted extends com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent.PassiveLoginObservationAlreadyStarted INSTANCE = new com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent.PassiveLoginObservationAlreadyStarted();

        public final int hashCode() {
            return -1637708237;
        }

        private PassiveLoginObservationAlreadyStarted() {
            super(null);
        }

        public final java.lang.String toString() {
            return "PassiveLoginObservationAlreadyStarted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.login.domain.observer.SignUpPassiveLoginEvent.PassiveLoginObservationAlreadyStarted)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ SignUpPassiveLoginEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
