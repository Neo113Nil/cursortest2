package com.paypal.oslo.feature.onboarding.signup.phone.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/SmsRetrieverState;", "", "Idle", "Listening", "Success", "Error", "Timeout", "Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/SmsRetrieverState$Error;", "Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/SmsRetrieverState$Idle;", "Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/SmsRetrieverState$Listening;", "Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/SmsRetrieverState$Success;", "Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/SmsRetrieverState$Timeout;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface SmsRetrieverState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/SmsRetrieverState$Idle;", "Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/SmsRetrieverState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Idle implements com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState.Idle INSTANCE = new com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState.Idle();

        public final int hashCode() {
            return 304433065;
        }

        private Idle() {
        }

        public final java.lang.String toString() {
            return "Idle";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState.Idle)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/SmsRetrieverState$Listening;", "Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/SmsRetrieverState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Listening implements com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState.Listening INSTANCE = new com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState.Listening();

        public final int hashCode() {
            return 457995782;
        }

        private Listening() {
        }

        public final java.lang.String toString() {
            return "Listening";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState.Listening)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/SmsRetrieverState$Success;", "Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/SmsRetrieverState;", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/OtpCode;", "otpCode", "<init>", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-QfjPZuI", "()Ljava/lang/String;", "component1", "copy--2pP90k", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/SmsRetrieverState$Success;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "Ljava/lang/String;", "getOtpCode-QfjPZuI"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success implements com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState {
        public static final int $stable = 0;
        private final java.lang.String otpCode;

        private Success(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.otpCode = str;
        }

        /* renamed from: getOtpCode-QfjPZuI, reason: not valid java name */
        public final java.lang.String m16403getOtpCodeQfjPZuI() {
            return this.otpCode;
        }

        public final java.lang.String toString() {
            java.lang.String m16311toStringimpl = com.paypal.oslo.feature.onboarding.signup.domain.model.OtpCode.m16311toStringimpl(this.otpCode);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(otpCode=");
            sb.append(m16311toStringimpl);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return com.paypal.oslo.feature.onboarding.signup.domain.model.OtpCode.m16310hashCodeimpl(this.otpCode);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState.Success) && com.paypal.oslo.feature.onboarding.signup.domain.model.OtpCode.m16309equalsimpl0(this.otpCode, ((com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState.Success) other).otpCode);
        }

        /* renamed from: copy--2pP90k, reason: not valid java name */
        public final com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState.Success m16402copy2pP90k(java.lang.String otpCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otpCode, "");
            return new com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState.Success(otpCode, null);
        }

        /* renamed from: component1-QfjPZuI, reason: not valid java name and from getter */
        public final java.lang.String getOtpCode() {
            return this.otpCode;
        }

        /* renamed from: copy--2pP90k$default, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState.Success m16400copy2pP90k$default(com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState.Success success, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = success.otpCode;
            }
            return success.m16402copy2pP90k(str);
        }

        public /* synthetic */ Success(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/SmsRetrieverState$Error;", "Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/SmsRetrieverState;", "Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/SmsRetrieverError;", "error", "<init>", "(Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/SmsRetrieverError;)V", "component1", "()Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/SmsRetrieverError;", "copy", "(Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/SmsRetrieverError;)Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/SmsRetrieverState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/SmsRetrieverError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error implements com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverError error;

        public Error(com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverError smsRetrieverError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smsRetrieverError, "");
            this.error = smsRetrieverError;
        }

        public final com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverError smsRetrieverError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(error=");
            sb.append(smsRetrieverError);
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
            return (other instanceof com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState.Error) other).error);
        }

        public final com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState.Error copy(com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState.Error(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState.Error copy$default(com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState.Error error, com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverError smsRetrieverError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                smsRetrieverError = error.error;
            }
            return error.copy(smsRetrieverError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/SmsRetrieverState$Timeout;", "Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/SmsRetrieverState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Timeout implements com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState.Timeout INSTANCE = new com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState.Timeout();

        public final int hashCode() {
            return -288704148;
        }

        private Timeout() {
        }

        public final java.lang.String toString() {
            return "Timeout";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState.Timeout)) {
                return false;
            }
            return true;
        }
    }
}
