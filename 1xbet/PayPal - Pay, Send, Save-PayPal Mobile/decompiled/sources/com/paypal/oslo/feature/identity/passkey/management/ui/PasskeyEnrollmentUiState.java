package com.paypal.oslo.feature.identity.passkey.management.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyEnrollmentUiState;", "", "Idle", "Enrolling", "Error", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyEnrollmentUiState$Enrolling;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyEnrollmentUiState$Error;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyEnrollmentUiState$Idle;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface PasskeyEnrollmentUiState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyEnrollmentUiState$Idle;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyEnrollmentUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Idle implements com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState.Idle INSTANCE = new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState.Idle();

        public final int hashCode() {
            return -643312919;
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
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState.Idle)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyEnrollmentUiState$Enrolling;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyEnrollmentUiState;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;", "error", "<init>", "(Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;)V", "component1", "()Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;", "copy", "(Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;)Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyEnrollmentUiState$Enrolling;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Enrolling implements com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError error;

        public Enrolling(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError passkeyCreateError) {
            this.error = passkeyCreateError;
        }

        public /* synthetic */ Enrolling(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError passkeyCreateError, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : passkeyCreateError);
        }

        public final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError passkeyCreateError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Enrolling(error=");
            sb.append(passkeyCreateError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError passkeyCreateError = this.error;
            if (passkeyCreateError == null) {
                return 0;
            }
            return passkeyCreateError.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState.Enrolling) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState.Enrolling) other).error);
        }

        public final com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState.Enrolling copy(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError error) {
            return new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState.Enrolling(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState.Enrolling copy$default(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState.Enrolling enrolling, com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError passkeyCreateError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                passkeyCreateError = enrolling.error;
            }
            return enrolling.copy(passkeyCreateError);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Enrolling() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyEnrollmentUiState$Error;", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyEnrollmentUiState;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;", "error", "<init>", "(Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;)V", "component1", "()Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;", "copy", "(Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;)Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyEnrollmentUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error implements com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError error;

        public Error(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError passkeyCreateError) {
            this.error = passkeyCreateError;
        }

        public /* synthetic */ Error(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError passkeyCreateError, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : passkeyCreateError);
        }

        public final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError passkeyCreateError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(error=");
            sb.append(passkeyCreateError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError passkeyCreateError = this.error;
            if (passkeyCreateError == null) {
                return 0;
            }
            return passkeyCreateError.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState.Error) other).error);
        }

        public final com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState.Error copy(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError error) {
            return new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState.Error(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState.Error copy$default(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState.Error error, com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError passkeyCreateError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                passkeyCreateError = error.error;
            }
            return error.copy(passkeyCreateError);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Error() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
