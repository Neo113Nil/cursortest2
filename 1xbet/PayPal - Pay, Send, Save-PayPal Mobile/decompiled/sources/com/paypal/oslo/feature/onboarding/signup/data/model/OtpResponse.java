package com.paypal.oslo.feature.onboarding.signup.data.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004R\u0018\u0010\t\u001a\u00060\u0005j\u0002`\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0003\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/data/model/OtpResponse;", "T", "", "<init>", "()V", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardingConfirmationStatus;", "Lcom/paypal/oslo/feature/onboarding/graphql/type/OnboardingConfirmationStatus;", "getStatus", "()Lcom/paypal/oslo/api/graphql/schema/type/OnboardingConfirmationStatus;", "status", "", "getSuccess", "()Z", "success", "Request", "Resend", "Confirm", "Lcom/paypal/oslo/feature/onboarding/signup/data/model/OtpResponse$Confirm;", "Lcom/paypal/oslo/feature/onboarding/signup/data/model/OtpResponse$Request;", "Lcom/paypal/oslo/feature/onboarding/signup/data/model/OtpResponse$Resend;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class OtpResponse<T> {
    public static final int $stable = 0;

    public abstract com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus getStatus();

    public abstract boolean getSuccess();

    private OtpResponse() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\n\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000e\u001a\u00020\u00002\f\b\u0002\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/data/model/OtpResponse$Request;", "Lcom/paypal/oslo/feature/onboarding/signup/data/model/OtpResponse;", "", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardingConfirmationStatus;", "Lcom/paypal/oslo/feature/onboarding/graphql/type/OnboardingConfirmationStatus;", "status", "", "success", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardingConfirmationStatus;Z)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/OnboardingConfirmationStatus;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardingConfirmationStatus;Z)Lcom/paypal/oslo/feature/onboarding/signup/data/model/OtpResponse$Request;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardingConfirmationStatus;", "getStatus", "Z", "getSuccess"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Request extends com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse<java.lang.Object> {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus status;
        private final boolean success;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Request(com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus onboardingConfirmationStatus, boolean z) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onboardingConfirmationStatus, "");
            this.status = onboardingConfirmationStatus;
            this.success = z;
        }

        @Override // com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse
        public final com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus getStatus() {
            return this.status;
        }

        @Override // com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse
        public final boolean getSuccess() {
            return this.success;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus onboardingConfirmationStatus = this.status;
            boolean z = this.success;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Request(status=");
            sb.append(onboardingConfirmationStatus);
            sb.append(", success=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.status.hashCode() * 31) + java.lang.Boolean.hashCode(this.success);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse.Request)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse.Request request = (com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse.Request) other;
            return this.status == request.status && this.success == request.success;
        }

        public final com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse.Request copy(com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus status, boolean success) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse.Request(status, success);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus getStatus() {
            return this.status;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse.Request copy$default(com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse.Request request, com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus onboardingConfirmationStatus, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                onboardingConfirmationStatus = request.status;
            }
            if ((i & 2) != 0) {
                z = request.success;
            }
            return request.copy(onboardingConfirmationStatus, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\n\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000e\u001a\u00020\u00002\f\b\u0002\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/data/model/OtpResponse$Resend;", "Lcom/paypal/oslo/feature/onboarding/signup/data/model/OtpResponse;", "", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardingConfirmationStatus;", "Lcom/paypal/oslo/feature/onboarding/graphql/type/OnboardingConfirmationStatus;", "status", "", "success", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardingConfirmationStatus;Z)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/OnboardingConfirmationStatus;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardingConfirmationStatus;Z)Lcom/paypal/oslo/feature/onboarding/signup/data/model/OtpResponse$Resend;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardingConfirmationStatus;", "getStatus", "Z", "getSuccess"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Resend extends com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse<java.lang.Object> {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus status;
        private final boolean success;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Resend(com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus onboardingConfirmationStatus, boolean z) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onboardingConfirmationStatus, "");
            this.status = onboardingConfirmationStatus;
            this.success = z;
        }

        @Override // com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse
        public final com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus getStatus() {
            return this.status;
        }

        @Override // com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse
        public final boolean getSuccess() {
            return this.success;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus onboardingConfirmationStatus = this.status;
            boolean z = this.success;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Resend(status=");
            sb.append(onboardingConfirmationStatus);
            sb.append(", success=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.status.hashCode() * 31) + java.lang.Boolean.hashCode(this.success);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse.Resend)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse.Resend resend = (com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse.Resend) other;
            return this.status == resend.status && this.success == resend.success;
        }

        public final com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse.Resend copy(com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus status, boolean success) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse.Resend(status, success);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus getStatus() {
            return this.status;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse.Resend copy$default(com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse.Resend resend, com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus onboardingConfirmationStatus, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                onboardingConfirmationStatus = resend.status;
            }
            if ((i & 2) != 0) {
                z = resend.success;
            }
            return resend.copy(onboardingConfirmationStatus, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\n\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000e\u001a\u00020\u00002\f\b\u0002\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/data/model/OtpResponse$Confirm;", "Lcom/paypal/oslo/feature/onboarding/signup/data/model/OtpResponse;", "", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardingConfirmationStatus;", "Lcom/paypal/oslo/feature/onboarding/graphql/type/OnboardingConfirmationStatus;", "status", "", "success", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardingConfirmationStatus;Z)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/OnboardingConfirmationStatus;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardingConfirmationStatus;Z)Lcom/paypal/oslo/feature/onboarding/signup/data/model/OtpResponse$Confirm;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardingConfirmationStatus;", "getStatus", "Z", "getSuccess"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Confirm extends com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse<java.lang.Object> {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus status;
        private final boolean success;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Confirm(com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus onboardingConfirmationStatus, boolean z) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onboardingConfirmationStatus, "");
            this.status = onboardingConfirmationStatus;
            this.success = z;
        }

        @Override // com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse
        public final com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus getStatus() {
            return this.status;
        }

        @Override // com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse
        public final boolean getSuccess() {
            return this.success;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus onboardingConfirmationStatus = this.status;
            boolean z = this.success;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Confirm(status=");
            sb.append(onboardingConfirmationStatus);
            sb.append(", success=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.status.hashCode() * 31) + java.lang.Boolean.hashCode(this.success);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse.Confirm)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse.Confirm confirm = (com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse.Confirm) other;
            return this.status == confirm.status && this.success == confirm.success;
        }

        public final com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse.Confirm copy(com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus status, boolean success) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse.Confirm(status, success);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus getStatus() {
            return this.status;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse.Confirm copy$default(com.paypal.oslo.feature.onboarding.signup.data.model.OtpResponse.Confirm confirm, com.paypal.oslo.api.graphql.schema.type.OnboardingConfirmationStatus onboardingConfirmationStatus, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                onboardingConfirmationStatus = confirm.status;
            }
            if ((i & 2) != 0) {
                z = confirm.success;
            }
            return confirm.copy(onboardingConfirmationStatus, z);
        }
    }

    public /* synthetic */ OtpResponse(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
