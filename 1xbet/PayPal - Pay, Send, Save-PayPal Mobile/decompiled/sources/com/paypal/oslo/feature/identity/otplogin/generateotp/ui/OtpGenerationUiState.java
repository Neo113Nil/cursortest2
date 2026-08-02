package com.paypal.oslo.feature.identity.otplogin.generateotp.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/generateotp/ui/OtpGenerationUiState;", "", "<init>", "()V", "Idle", "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/ui/OtpGenerationUiState$Error;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/ui/OtpGenerationUiState$Idle;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/ui/OtpGenerationUiState$Loading;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/ui/OtpGenerationUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class OtpGenerationUiState {
    public static final int $stable = 0;

    private OtpGenerationUiState() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/generateotp/ui/OtpGenerationUiState$Idle;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/ui/OtpGenerationUiState;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Idle extends com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState.Idle INSTANCE = new com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState.Idle();

        private Idle() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/generateotp/ui/OtpGenerationUiState$Loading;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/ui/OtpGenerationUiState;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Loading extends com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState.Loading INSTANCE = new com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState.Loading();

        private Loading() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/generateotp/ui/OtpGenerationUiState$Success;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/ui/OtpGenerationUiState;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationResult;)V", "component1", "()Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationResult;", "copy", "(Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationResult;)Lcom/paypal/oslo/feature/identity/otplogin/generateotp/ui/OtpGenerationUiState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationResult result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationResult otpGenerationResult) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otpGenerationResult, "");
            this.result = otpGenerationResult;
        }

        public final com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationResult getResult() {
            return this.result;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationResult otpGenerationResult = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(result=");
            sb.append(otpGenerationResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState.Success) other).result);
        }

        public final com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState.Success copy(com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationResult result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState.Success(result);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationResult getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState.Success copy$default(com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState.Success success, com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationResult otpGenerationResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                otpGenerationResult = success.result;
            }
            return success.copy(otpGenerationResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/generateotp/ui/OtpGenerationUiState$Error;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/ui/OtpGenerationUiState;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError;", "error", "<init>", "(Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError;)V", "component1", "()Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError;", "copy", "(Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError;)Lcom/paypal/oslo/feature/identity/otplogin/generateotp/ui/OtpGenerationUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError otpGenerationError) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otpGenerationError, "");
            this.error = otpGenerationError;
        }

        public final com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError otpGenerationError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(error=");
            sb.append(otpGenerationError);
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
            return (other instanceof com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState.Error) other).error);
        }

        public final com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState.Error copy(com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState.Error(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState.Error copy$default(com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState.Error error, com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError otpGenerationError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                otpGenerationError = error.error;
            }
            return error.copy(otpGenerationError);
        }
    }

    public /* synthetic */ OtpGenerationUiState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
