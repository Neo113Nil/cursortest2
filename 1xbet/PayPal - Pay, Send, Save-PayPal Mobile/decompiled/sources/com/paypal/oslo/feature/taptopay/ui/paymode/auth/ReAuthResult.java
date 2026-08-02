package com.paypal.oslo.feature.taptopay.ui.paymode.auth;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthResult;", "", "Success", "Failure", "FailureReason", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthResult$Failure;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthResult$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ReAuthResult {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthResult$Success;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success implements com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.Success INSTANCE = new com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.Success();

        public final int hashCode() {
            return 2019826345;
        }

        private Success() {
        }

        public final java.lang.String toString() {
            return "Success";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.Success)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthResult$Failure;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthResult;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthResult$FailureReason;", "reason", "<init>", "(Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthResult$FailureReason;)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthResult$FailureReason;", "copy", "(Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthResult$FailureReason;)Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthResult$Failure;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthResult$FailureReason;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Failure implements com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason reason;

        public Failure(com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason failureReason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failureReason, "");
            this.reason = failureReason;
        }

        public final com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason failureReason = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failure(reason=");
            sb.append(failureReason);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.reason.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.Failure) && this.reason == ((com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.Failure) other).reason;
        }

        public final com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.Failure copy(com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.Failure(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.Failure copy$default(com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.Failure failure, com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason failureReason, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                failureReason = failure.reason;
            }
            return failure.copy(failureReason);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/auth/ReAuthResult$FailureReason;", "", "<init>", "(Ljava/lang/String;I)V", com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError.CODE_USER_CANCELLED, "LOCKOUT", "LOCKOUT_PERMANENT", "PROMPT_FAILED", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FailureReason {
        public static final com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason LOCKOUT;
        public static final com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason LOCKOUT_PERMANENT;
        public static final com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason PROMPT_FAILED;
        public static final com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason UNKNOWN;
        public static final com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason USER_CANCELLED;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
        private static final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason[] getHighSpeedVideoSizes;

        private FailureReason(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason failureReason = new com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason(com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError.CODE_USER_CANCELLED, 0);
            USER_CANCELLED = failureReason;
            com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason failureReason2 = new com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason("LOCKOUT", 1);
            LOCKOUT = failureReason2;
            com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason failureReason3 = new com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason("LOCKOUT_PERMANENT", 2);
            LOCKOUT_PERMANENT = failureReason3;
            com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason failureReason4 = new com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason("PROMPT_FAILED", 3);
            PROMPT_FAILED = failureReason4;
            com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason failureReason5 = new com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason("UNKNOWN", 4);
            UNKNOWN = failureReason5;
            com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason[] failureReasonArr = {failureReason, failureReason2, failureReason3, failureReason4, failureReason5};
            getHighSpeedVideoSizes = failureReasonArr;
            getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(failureReasonArr);
        }

        public static com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason[] values() {
            return (com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason[]) getHighSpeedVideoSizes.clone();
        }

        public static com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason) java.lang.Enum.valueOf(com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthResult.FailureReason> getEntries() {
            return getHighSpeedVideoFpsRangesFor;
        }
    }
}
