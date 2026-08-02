package com.paypal.oslo.feature.taptopay.domain.model.card.paypal;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/ThreeDsEvent;", "", "<init>", "()V", "Success", "Error", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/ThreeDsEvent$Error;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/ThreeDsEvent$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class ThreeDsEvent {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/ThreeDsEvent$Success;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/ThreeDsEvent;", "", "proofOfAuth", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/ThreeDsEvent$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getProofOfAuth"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsEvent {
        public static final int $stable = 0;
        private final java.lang.String proofOfAuth;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.proofOfAuth = str;
        }

        public final java.lang.String getProofOfAuth() {
            return this.proofOfAuth;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.proofOfAuth;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(proofOfAuth=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.proofOfAuth.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsEvent.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.proofOfAuth, ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsEvent.Success) other).proofOfAuth);
        }

        public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsEvent.Success copy(java.lang.String proofOfAuth) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proofOfAuth, "");
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsEvent.Success(proofOfAuth);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getProofOfAuth() {
            return this.proofOfAuth;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsEvent.Success copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsEvent.Success success, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = success.proofOfAuth;
            }
            return success.copy(str);
        }
    }

    private ThreeDsEvent() {
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/ThreeDsEvent$Error;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/ThreeDsEvent;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/ThreeDsErrorCode;", "error", "", "reason", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/ThreeDsErrorCode;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/ThreeDsErrorCode;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/ThreeDsErrorCode;Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/ThreeDsEvent$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/ThreeDsErrorCode;", "getError", "Ljava/lang/String;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsErrorCode error;
        private final java.lang.String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsErrorCode threeDsErrorCode, java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threeDsErrorCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.error = threeDsErrorCode;
            this.reason = str;
        }

        public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsErrorCode getError() {
            return this.error;
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsErrorCode threeDsErrorCode = this.error;
            java.lang.String str = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(error=");
            sb.append(threeDsErrorCode);
            sb.append(", reason=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.error.hashCode() * 31) + this.reason.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsEvent.Error)) {
                return false;
            }
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsEvent.Error error = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsEvent.Error) other;
            return this.error == error.error && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, error.reason);
        }

        public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsEvent.Error copy(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsErrorCode error, java.lang.String reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsEvent.Error(error, reason);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsErrorCode getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsEvent.Error copy$default(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsEvent.Error error, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.ThreeDsErrorCode threeDsErrorCode, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                threeDsErrorCode = error.error;
            }
            if ((i & 2) != 0) {
                str = error.reason;
            }
            return error.copy(threeDsErrorCode, str);
        }
    }

    public /* synthetic */ ThreeDsEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
