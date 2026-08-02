package com.paypal.oslo.feature.taptopay.domain.model.register;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/register/PayairUserRegistrationError;", "", "TokenRefreshFailed", "RegistrationFailed", "Lcom/paypal/oslo/feature/taptopay/domain/model/register/PayairUserRegistrationError$RegistrationFailed;", "Lcom/paypal/oslo/feature/taptopay/domain/model/register/PayairUserRegistrationError$TokenRefreshFailed;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface PayairUserRegistrationError {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/register/PayairUserRegistrationError$TokenRefreshFailed;", "Lcom/paypal/oslo/feature/taptopay/domain/model/register/PayairUserRegistrationError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/register/PayairUserRegistrationError$TokenRefreshFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TokenRefreshFailed implements com.paypal.oslo.feature.taptopay.domain.model.register.PayairUserRegistrationError {
        public static final int $stable = 0;
        private final java.lang.String message;

        public TokenRefreshFailed(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TokenRefreshFailed(message=");
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
            return (other instanceof com.paypal.oslo.feature.taptopay.domain.model.register.PayairUserRegistrationError.TokenRefreshFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.taptopay.domain.model.register.PayairUserRegistrationError.TokenRefreshFailed) other).message);
        }

        public final com.paypal.oslo.feature.taptopay.domain.model.register.PayairUserRegistrationError.TokenRefreshFailed copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.taptopay.domain.model.register.PayairUserRegistrationError.TokenRefreshFailed(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.register.PayairUserRegistrationError.TokenRefreshFailed copy$default(com.paypal.oslo.feature.taptopay.domain.model.register.PayairUserRegistrationError.TokenRefreshFailed tokenRefreshFailed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = tokenRefreshFailed.message;
            }
            return tokenRefreshFailed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/register/PayairUserRegistrationError$RegistrationFailed;", "Lcom/paypal/oslo/feature/taptopay/domain/model/register/PayairUserRegistrationError;", "", "message", "", "errorCode", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/taptopay/domain/model/register/PayairUserRegistrationError$RegistrationFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Ljava/lang/Integer;", "getErrorCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RegistrationFailed implements com.paypal.oslo.feature.taptopay.domain.model.register.PayairUserRegistrationError {
        public static final int $stable = 0;
        private final java.lang.Integer errorCode;
        private final java.lang.String message;

        public RegistrationFailed(java.lang.String str, java.lang.Integer num) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.errorCode = num;
        }

        public /* synthetic */ RegistrationFailed(java.lang.String str, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : num);
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.Integer getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.Integer num = this.errorCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RegistrationFailed(message=");
            sb.append(str);
            sb.append(", errorCode=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode();
            java.lang.Integer num = this.errorCode;
            return (hashCode * 31) + (num == null ? 0 : num.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.register.PayairUserRegistrationError.RegistrationFailed)) {
                return false;
            }
            com.paypal.oslo.feature.taptopay.domain.model.register.PayairUserRegistrationError.RegistrationFailed registrationFailed = (com.paypal.oslo.feature.taptopay.domain.model.register.PayairUserRegistrationError.RegistrationFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, registrationFailed.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, registrationFailed.errorCode);
        }

        public final com.paypal.oslo.feature.taptopay.domain.model.register.PayairUserRegistrationError.RegistrationFailed copy(java.lang.String message, java.lang.Integer errorCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.taptopay.domain.model.register.PayairUserRegistrationError.RegistrationFailed(message, errorCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Integer getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.register.PayairUserRegistrationError.RegistrationFailed copy$default(com.paypal.oslo.feature.taptopay.domain.model.register.PayairUserRegistrationError.RegistrationFailed registrationFailed, java.lang.String str, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = registrationFailed.message;
            }
            if ((i & 2) != 0) {
                num = registrationFailed.errorCode;
            }
            return registrationFailed.copy(str, num);
        }
    }
}
