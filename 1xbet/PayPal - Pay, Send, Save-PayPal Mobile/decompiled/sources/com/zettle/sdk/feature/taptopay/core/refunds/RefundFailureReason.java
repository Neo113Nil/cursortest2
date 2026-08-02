package com.zettle.sdk.feature.taptopay.core.refunds;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;", "", "<init>", "()V", "AlreadyRefunded", "AmountTooHigh", "InsufficientFunds", "NetworkError", "NotAuthorized", "NotFound", "PartialRefundNotSupported", "RefundExpired", "TechnicalError", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason$AlreadyRefunded;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason$AmountTooHigh;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason$InsufficientFunds;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason$NetworkError;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason$NotAuthorized;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason$NotFound;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason$PartialRefundNotSupported;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason$RefundExpired;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason$TechnicalError;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class RefundFailureReason {
    private RefundFailureReason() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason$NotAuthorized;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NotAuthorized extends com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason {
        public static final com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.NotAuthorized INSTANCE = new com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.NotAuthorized();

        private NotAuthorized() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NotAuthorized";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason$NotFound;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NotFound extends com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason {
        public static final com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.NotFound INSTANCE = new com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.NotFound();

        private NotFound() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NotFound";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason$TechnicalError;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TechnicalError extends com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason {
        public static final com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.TechnicalError INSTANCE = new com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.TechnicalError();

        private TechnicalError() {
            super(null);
        }

        public final java.lang.String toString() {
            return "TechnicalError";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason$NetworkError;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NetworkError extends com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason {
        public static final com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.NetworkError INSTANCE = new com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.NetworkError();

        private NetworkError() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NetworkError";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason$AlreadyRefunded;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AlreadyRefunded extends com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason {
        public static final com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.AlreadyRefunded INSTANCE = new com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.AlreadyRefunded();

        private AlreadyRefunded() {
            super(null);
        }

        public final java.lang.String toString() {
            return "AlreadyRefunded";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason$AmountTooHigh;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AmountTooHigh extends com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason {
        public static final com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.AmountTooHigh INSTANCE = new com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.AmountTooHigh();

        private AmountTooHigh() {
            super(null);
        }

        public final java.lang.String toString() {
            return "AmountTooHigh";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason$PartialRefundNotSupported;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PartialRefundNotSupported extends com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason {
        public static final com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.PartialRefundNotSupported INSTANCE = new com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.PartialRefundNotSupported();

        private PartialRefundNotSupported() {
            super(null);
        }

        public final java.lang.String toString() {
            return "PartialRefundNotSupported";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason$InsufficientFunds;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class InsufficientFunds extends com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason {
        public static final com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.InsufficientFunds INSTANCE = new com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.InsufficientFunds();

        private InsufficientFunds() {
            super(null);
        }

        public final java.lang.String toString() {
            return "InsufficientFunds";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason$RefundExpired;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RefundExpired extends com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason {
        public static final com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.RefundExpired INSTANCE = new com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.RefundExpired();

        private RefundExpired() {
            super(null);
        }

        public final java.lang.String toString() {
            return "RefundExpired";
        }
    }

    public /* synthetic */ RefundFailureReason(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
