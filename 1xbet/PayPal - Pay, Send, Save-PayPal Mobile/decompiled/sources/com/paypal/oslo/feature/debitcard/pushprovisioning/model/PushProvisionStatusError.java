package com.paypal.oslo.feature.debitcard.pushprovisioning.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/model/PushProvisionStatusError;", "", "<init>", "()V", "RetryableError", "Unknown", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/model/PushProvisionStatusError$RetryableError;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/model/PushProvisionStatusError$Unknown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class PushProvisionStatusError {
    public static final int $stable = 0;

    private PushProvisionStatusError() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/model/PushProvisionStatusError$RetryableError;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/model/PushProvisionStatusError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryableError extends com.paypal.oslo.feature.debitcard.pushprovisioning.model.PushProvisionStatusError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.pushprovisioning.model.PushProvisionStatusError.RetryableError INSTANCE = new com.paypal.oslo.feature.debitcard.pushprovisioning.model.PushProvisionStatusError.RetryableError();

        public final int hashCode() {
            return -1799169776;
        }

        private RetryableError() {
            super(null);
        }

        public final java.lang.String toString() {
            return "RetryableError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.model.PushProvisionStatusError.RetryableError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/model/PushProvisionStatusError$Unknown;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/model/PushProvisionStatusError;", "", "statusCode", "", "error", "<init>", "(ILjava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/paypal/oslo/feature/debitcard/pushprovisioning/model/PushProvisionStatusError$Unknown;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getStatusCode", "Ljava/lang/String;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Unknown extends com.paypal.oslo.feature.debitcard.pushprovisioning.model.PushProvisionStatusError {
        public static final int $stable = 0;
        private final java.lang.String error;
        private final int statusCode;

        public Unknown(int i, java.lang.String str) {
            super(null);
            this.statusCode = i;
            this.error = str;
        }

        public final java.lang.String getError() {
            return this.error;
        }

        public final int getStatusCode() {
            return this.statusCode;
        }

        public final java.lang.String toString() {
            int i = this.statusCode;
            java.lang.String str = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown(statusCode=");
            sb.append(i);
            sb.append(", error=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Integer.hashCode(this.statusCode);
            java.lang.String str = this.error;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.model.PushProvisionStatusError.Unknown)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.pushprovisioning.model.PushProvisionStatusError.Unknown unknown = (com.paypal.oslo.feature.debitcard.pushprovisioning.model.PushProvisionStatusError.Unknown) other;
            return this.statusCode == unknown.statusCode && kotlin.jvm.internal.Intrinsics.areEqual(this.error, unknown.error);
        }

        public final com.paypal.oslo.feature.debitcard.pushprovisioning.model.PushProvisionStatusError.Unknown copy(int statusCode, java.lang.String error) {
            return new com.paypal.oslo.feature.debitcard.pushprovisioning.model.PushProvisionStatusError.Unknown(statusCode, error);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getError() {
            return this.error;
        }

        /* renamed from: component1, reason: from getter */
        public final int getStatusCode() {
            return this.statusCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.model.PushProvisionStatusError.Unknown copy$default(com.paypal.oslo.feature.debitcard.pushprovisioning.model.PushProvisionStatusError.Unknown unknown, int i, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = unknown.statusCode;
            }
            if ((i2 & 2) != 0) {
                str = unknown.error;
            }
            return unknown.copy(i, str);
        }
    }

    public /* synthetic */ PushProvisionStatusError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
