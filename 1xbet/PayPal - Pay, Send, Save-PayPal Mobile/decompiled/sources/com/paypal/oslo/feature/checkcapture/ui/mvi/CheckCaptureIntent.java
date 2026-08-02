package com.paypal.oslo.feature.checkcapture.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureIntent;", "", "Initialize", "ProceedFromLanding", "RetryAuthentication", "LaunchIngoSDK", "PermissionsHandled", "Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureIntent$Initialize;", "Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureIntent$LaunchIngoSDK;", "Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureIntent$PermissionsHandled;", "Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureIntent$ProceedFromLanding;", "Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureIntent$RetryAuthentication;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CheckCaptureIntent {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureIntent$Initialize;", "Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initialize implements com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent.Initialize INSTANCE = new com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent.Initialize();

        public final int hashCode() {
            return 226824923;
        }

        private Initialize() {
        }

        public final java.lang.String toString() {
            return "Initialize";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent.Initialize)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureIntent$ProceedFromLanding;", "Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProceedFromLanding implements com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent.ProceedFromLanding INSTANCE = new com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent.ProceedFromLanding();

        public final int hashCode() {
            return -1333991990;
        }

        private ProceedFromLanding() {
        }

        public final java.lang.String toString() {
            return "ProceedFromLanding";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent.ProceedFromLanding)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureIntent$RetryAuthentication;", "Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureIntent;", "", "currentRetryCount", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureIntent$RetryAuthentication;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getCurrentRetryCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryAuthentication implements com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent {
        public static final int $stable = 0;
        private final int currentRetryCount;

        public RetryAuthentication(int i) {
            this.currentRetryCount = i;
        }

        public final int getCurrentRetryCount() {
            return this.currentRetryCount;
        }

        public final java.lang.String toString() {
            int i = this.currentRetryCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RetryAuthentication(currentRetryCount=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.currentRetryCount);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent.RetryAuthentication) && this.currentRetryCount == ((com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent.RetryAuthentication) other).currentRetryCount;
        }

        public final com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent.RetryAuthentication copy(int currentRetryCount) {
            return new com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent.RetryAuthentication(currentRetryCount);
        }

        /* renamed from: component1, reason: from getter */
        public final int getCurrentRetryCount() {
            return this.currentRetryCount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent.RetryAuthentication copy$default(com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent.RetryAuthentication retryAuthentication, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = retryAuthentication.currentRetryCount;
            }
            return retryAuthentication.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureIntent$LaunchIngoSDK;", "Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LaunchIngoSDK implements com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent.LaunchIngoSDK INSTANCE = new com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent.LaunchIngoSDK();

        public final int hashCode() {
            return 587624911;
        }

        private LaunchIngoSDK() {
        }

        public final java.lang.String toString() {
            return "LaunchIngoSDK";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent.LaunchIngoSDK)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureIntent$PermissionsHandled;", "Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PermissionsHandled implements com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent.PermissionsHandled INSTANCE = new com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent.PermissionsHandled();

        public final int hashCode() {
            return 1258318435;
        }

        private PermissionsHandled() {
        }

        public final java.lang.String toString() {
            return "PermissionsHandled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent.PermissionsHandled)) {
                return false;
            }
            return true;
        }
    }
}
