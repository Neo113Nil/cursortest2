package com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/ZettlePaymentResult;", "", "<init>", "()V", "Success", "Failure", "Cancelled", "CancelledByUser", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/ZettlePaymentResult$Cancelled;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/ZettlePaymentResult$CancelledByUser;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/ZettlePaymentResult$Failure;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/ZettlePaymentResult$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class ZettlePaymentResult {
    public static final int $stable = 0;

    private ZettlePaymentResult() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/ZettlePaymentResult$Success;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/ZettlePaymentResult;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/TapToPayPayload;", "payload", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/TapToPayPayload;)V", "component1", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/TapToPayPayload;", "copy", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/TapToPayPayload;)Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/ZettlePaymentResult$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/TapToPayPayload;", "getPayload"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload payload;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload tapToPayPayload) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tapToPayPayload, "");
            this.payload = tapToPayPayload;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload getPayload() {
            return this.payload;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload tapToPayPayload = this.payload;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(payload=");
            sb.append(tapToPayPayload);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.payload.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.payload, ((com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult.Success) other).payload);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult.Success copy(com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload payload) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult.Success(payload);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload getPayload() {
            return this.payload;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult.Success copy$default(com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult.Success success, com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload tapToPayPayload, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                tapToPayPayload = success.payload;
            }
            return success.copy(tapToPayPayload);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/ZettlePaymentResult$Failure;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/ZettlePaymentResult;", "", "reason", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/FailureType;", "type", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/FailureType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/FailureType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/FailureType;)Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/ZettlePaymentResult$Failure;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReason", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/FailureType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Failure extends com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult {
        public static final int $stable = 0;
        private final java.lang.String reason;
        private final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType failureType) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failureType, "");
            this.reason = str;
            this.type = failureType;
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        public /* synthetic */ Failure(java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType failureType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType.GENERIC_FAILURE : failureType);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType getType() {
            return this.type;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.reason;
            com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType failureType = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failure(reason=");
            sb.append(str);
            sb.append(", type=");
            sb.append(failureType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.reason;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.type.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult.Failure)) {
                return false;
            }
            com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult.Failure failure = (com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult.Failure) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.reason, failure.reason) && this.type == failure.type;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult.Failure copy(java.lang.String reason, com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult.Failure(reason, type);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType getType() {
            return this.type;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult.Failure copy$default(com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult.Failure failure, java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType failureType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = failure.reason;
            }
            if ((i & 2) != 0) {
                failureType = failure.type;
            }
            return failure.copy(str, failureType);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Failure() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/ZettlePaymentResult$Cancelled;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/ZettlePaymentResult;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Cancelled extends com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult.Cancelled INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult.Cancelled();

        private Cancelled() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/ZettlePaymentResult$CancelledByUser;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/ZettlePaymentResult;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CancelledByUser extends com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult.CancelledByUser INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult.CancelledByUser();

        private CancelledByUser() {
            super(null);
        }
    }

    public /* synthetic */ ZettlePaymentResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
