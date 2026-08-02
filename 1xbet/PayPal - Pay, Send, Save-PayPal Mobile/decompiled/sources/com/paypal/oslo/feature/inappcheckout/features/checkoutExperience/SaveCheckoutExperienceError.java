package com.paypal.oslo.feature.inappcheckout.features.checkoutExperience;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/checkoutExperience/SaveCheckoutExperienceError;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "CallError", "ServerError", "UnknownError", "Lcom/paypal/oslo/feature/inappcheckout/features/checkoutExperience/SaveCheckoutExperienceError$CallError;", "Lcom/paypal/oslo/feature/inappcheckout/features/checkoutExperience/SaveCheckoutExperienceError$ServerError;", "Lcom/paypal/oslo/feature/inappcheckout/features/checkoutExperience/SaveCheckoutExperienceError$UnknownError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class SaveCheckoutExperienceError {
    public static final int $stable = 0;
    private final java.lang.String message;

    private SaveCheckoutExperienceError(java.lang.String str) {
        this.message = str;
    }

    public java.lang.String getMessage() {
        return this.message;
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/checkoutExperience/SaveCheckoutExperienceError$CallError;", "Lcom/paypal/oslo/feature/inappcheckout/features/checkoutExperience/SaveCheckoutExperienceError;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/inappcheckout/features/checkoutExperience/SaveCheckoutExperienceError$CallError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CallError extends com.paypal.oslo.feature.inappcheckout.features.checkoutExperience.SaveCheckoutExperienceError {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallError(java.lang.String str, java.lang.Throwable th) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.cause = th;
        }

        public /* synthetic */ CallError(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        @Override // com.paypal.oslo.feature.inappcheckout.features.checkoutExperience.SaveCheckoutExperienceError
        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CallError(message=");
            sb.append(str);
            sb.append(", cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode();
            java.lang.Throwable th = this.cause;
            return (hashCode * 31) + (th == null ? 0 : th.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.features.checkoutExperience.SaveCheckoutExperienceError.CallError)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.features.checkoutExperience.SaveCheckoutExperienceError.CallError callError = (com.paypal.oslo.feature.inappcheckout.features.checkoutExperience.SaveCheckoutExperienceError.CallError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, callError.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, callError.cause);
        }

        public final com.paypal.oslo.feature.inappcheckout.features.checkoutExperience.SaveCheckoutExperienceError.CallError copy(java.lang.String message, java.lang.Throwable cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.inappcheckout.features.checkoutExperience.SaveCheckoutExperienceError.CallError(message, cause);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.checkoutExperience.SaveCheckoutExperienceError.CallError copy$default(com.paypal.oslo.feature.inappcheckout.features.checkoutExperience.SaveCheckoutExperienceError.CallError callError, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = callError.message;
            }
            if ((i & 2) != 0) {
                th = callError.cause;
            }
            return callError.copy(str, th);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/checkoutExperience/SaveCheckoutExperienceError$ServerError;", "Lcom/paypal/oslo/feature/inappcheckout/features/checkoutExperience/SaveCheckoutExperienceError;", "", "errorReason", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/features/checkoutExperience/SaveCheckoutExperienceError$ServerError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ServerError extends com.paypal.oslo.feature.inappcheckout.features.checkoutExperience.SaveCheckoutExperienceError {
        public static final int $stable = 0;
        private final java.lang.String errorReason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ServerError(java.lang.String str) {
            super("Server error: ".concat(java.lang.String.valueOf(str)), null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.errorReason = str;
        }

        public final java.lang.String getErrorReason() {
            return this.errorReason;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorReason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ServerError(errorReason=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorReason.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.inappcheckout.features.checkoutExperience.SaveCheckoutExperienceError.ServerError) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorReason, ((com.paypal.oslo.feature.inappcheckout.features.checkoutExperience.SaveCheckoutExperienceError.ServerError) other).errorReason);
        }

        public final com.paypal.oslo.feature.inappcheckout.features.checkoutExperience.SaveCheckoutExperienceError.ServerError copy(java.lang.String errorReason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorReason, "");
            return new com.paypal.oslo.feature.inappcheckout.features.checkoutExperience.SaveCheckoutExperienceError.ServerError(errorReason);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorReason() {
            return this.errorReason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.checkoutExperience.SaveCheckoutExperienceError.ServerError copy$default(com.paypal.oslo.feature.inappcheckout.features.checkoutExperience.SaveCheckoutExperienceError.ServerError serverError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = serverError.errorReason;
            }
            return serverError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/checkoutExperience/SaveCheckoutExperienceError$UnknownError;", "Lcom/paypal/oslo/feature/inappcheckout/features/checkoutExperience/SaveCheckoutExperienceError;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/inappcheckout/features/checkoutExperience/SaveCheckoutExperienceError$UnknownError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnknownError extends com.paypal.oslo.feature.inappcheckout.features.checkoutExperience.SaveCheckoutExperienceError {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownError(java.lang.String str, java.lang.Throwable th) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.cause = th;
        }

        public /* synthetic */ UnknownError(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        @Override // com.paypal.oslo.feature.inappcheckout.features.checkoutExperience.SaveCheckoutExperienceError
        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnknownError(message=");
            sb.append(str);
            sb.append(", cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode();
            java.lang.Throwable th = this.cause;
            return (hashCode * 31) + (th == null ? 0 : th.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.features.checkoutExperience.SaveCheckoutExperienceError.UnknownError)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.features.checkoutExperience.SaveCheckoutExperienceError.UnknownError unknownError = (com.paypal.oslo.feature.inappcheckout.features.checkoutExperience.SaveCheckoutExperienceError.UnknownError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, unknownError.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, unknownError.cause);
        }

        public final com.paypal.oslo.feature.inappcheckout.features.checkoutExperience.SaveCheckoutExperienceError.UnknownError copy(java.lang.String message, java.lang.Throwable cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.inappcheckout.features.checkoutExperience.SaveCheckoutExperienceError.UnknownError(message, cause);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.checkoutExperience.SaveCheckoutExperienceError.UnknownError copy$default(com.paypal.oslo.feature.inappcheckout.features.checkoutExperience.SaveCheckoutExperienceError.UnknownError unknownError, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = unknownError.message;
            }
            if ((i & 2) != 0) {
                th = unknownError.cause;
            }
            return unknownError.copy(str, th);
        }
    }

    public /* synthetic */ SaveCheckoutExperienceError(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
