package com.paypal.oslo.feature.checkcapture.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureState;", "", "Idle", "ShowLandingScreen", "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureState$Error;", "Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureState$Idle;", "Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureState$Loading;", "Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureState$ShowLandingScreen;", "Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CheckCaptureState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureState$Idle;", "Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Idle implements com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.Idle INSTANCE = new com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.Idle();

        public final int hashCode() {
            return -410916680;
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
            if (!(other instanceof com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.Idle)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureState$ShowLandingScreen;", "Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowLandingScreen implements com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.ShowLandingScreen INSTANCE = new com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.ShowLandingScreen();

        public final int hashCode() {
            return 1933474562;
        }

        private ShowLandingScreen() {
        }

        public final java.lang.String toString() {
            return "ShowLandingScreen";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.ShowLandingScreen)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureState$Loading;", "Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading implements com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.Loading INSTANCE = new com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.Loading();

        public final int hashCode() {
            return 2005327320;
        }

        private Loading() {
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureState$Success;", "Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureState;", "Lcom/paypal/oslo/feature/checkcapture/domain/model/CheckCaptureSessionDetails;", "sessionDetails", "<init>", "(Lcom/paypal/oslo/feature/checkcapture/domain/model/CheckCaptureSessionDetails;)V", "component1", "()Lcom/paypal/oslo/feature/checkcapture/domain/model/CheckCaptureSessionDetails;", "copy", "(Lcom/paypal/oslo/feature/checkcapture/domain/model/CheckCaptureSessionDetails;)Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/checkcapture/domain/model/CheckCaptureSessionDetails;", "getSessionDetails"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success implements com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureSessionDetails sessionDetails;

        public Success(com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureSessionDetails checkCaptureSessionDetails) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkCaptureSessionDetails, "");
            this.sessionDetails = checkCaptureSessionDetails;
        }

        public final com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureSessionDetails getSessionDetails() {
            return this.sessionDetails;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureSessionDetails checkCaptureSessionDetails = this.sessionDetails;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(sessionDetails=");
            sb.append(checkCaptureSessionDetails);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.sessionDetails.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.sessionDetails, ((com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.Success) other).sessionDetails);
        }

        public final com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.Success copy(com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureSessionDetails sessionDetails) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionDetails, "");
            return new com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.Success(sessionDetails);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureSessionDetails getSessionDetails() {
            return this.sessionDetails;
        }

        public static /* synthetic */ com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.Success copy$default(com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.Success success, com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureSessionDetails checkCaptureSessionDetails, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                checkCaptureSessionDetails = success.sessionDetails;
            }
            return success.copy(checkCaptureSessionDetails);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u0011\u0010!\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureState$Error;", "Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureState;", "Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureErrorType;", "errorType", "", "message", "", "retryCount", "<init>", "(Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureErrorType;Ljava/lang/String;I)V", "component1", "()Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureErrorType;", "component2", "()Ljava/lang/String;", "component3", "()I", "copy", "(Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureErrorType;Ljava/lang/String;I)Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureErrorType;", "getErrorType", "Ljava/lang/String;", "getMessage", com.visa.cbp.getEncExpo.warmup, "getRetryCount", "getCanRetry", "()Z", "canRetry", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error implements com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType errorType;
        private final java.lang.String message;
        private final int retryCount;

        public Error(com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType checkCaptureErrorType, java.lang.String str, int i) {
            this.errorType = checkCaptureErrorType;
            this.message = str;
            this.retryCount = i;
        }

        public /* synthetic */ Error(com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType checkCaptureErrorType, java.lang.String str, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : checkCaptureErrorType, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
        }

        public final com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType getErrorType() {
            return this.errorType;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public final boolean getCanRetry() {
            return this.retryCount < 2 && this.errorType != com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType.FEATURE_DISABLED;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType checkCaptureErrorType = this.errorType;
            java.lang.String str = this.message;
            int i = this.retryCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorType=");
            sb.append(checkCaptureErrorType);
            sb.append(", message=");
            sb.append(str);
            sb.append(", retryCount=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType checkCaptureErrorType = this.errorType;
            int hashCode = checkCaptureErrorType == null ? 0 : checkCaptureErrorType.hashCode();
            java.lang.String str = this.message;
            return (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.retryCount);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.Error error = (com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.Error) other;
            return this.errorType == error.errorType && kotlin.jvm.internal.Intrinsics.areEqual(this.message, error.message) && this.retryCount == error.retryCount;
        }

        public final com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.Error copy(com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType errorType, java.lang.String message, int retryCount) {
            return new com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.Error(errorType, message, retryCount);
        }

        /* renamed from: component3, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType getErrorType() {
            return this.errorType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.Error copy$default(com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureState.Error error, com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType checkCaptureErrorType, java.lang.String str, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                checkCaptureErrorType = error.errorType;
            }
            if ((i2 & 2) != 0) {
                str = error.message;
            }
            if ((i2 & 4) != 0) {
                i = error.retryCount;
            }
            return error.copy(checkCaptureErrorType, str, i);
        }

        public Error() {
            this(null, null, 0, 7, null);
        }
    }
}
