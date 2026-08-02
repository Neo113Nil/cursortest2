package com.zettle.sdk.feature.taptopay.core.refunds;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/CheckRefundableResult;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundResult;", "<init>", "()V", "Failed", "Success", "Lcom/zettle/sdk/feature/taptopay/core/refunds/CheckRefundableResult$Failed;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/CheckRefundableResult$Success;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class CheckRefundableResult implements com.zettle.sdk.feature.taptopay.core.refunds.RefundResult {

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/CheckRefundableResult$Success;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/CheckRefundableResult;", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;", "cardPaymentPayload", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;)V", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;", "getCardPaymentPayload", "()Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Success extends com.zettle.sdk.feature.taptopay.core.refunds.CheckRefundableResult {
        private final com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload cardPaymentPayload;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload cardPaymentPayload) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardPaymentPayload, "");
            this.cardPaymentPayload = cardPaymentPayload;
        }

        public final com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload getCardPaymentPayload() {
            return this.cardPaymentPayload;
        }
    }

    private CheckRefundableResult() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/CheckRefundableResult$Failed;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/CheckRefundableResult;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;", "reason", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;)V", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;", "getReason", "()Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Failed extends com.zettle.sdk.feature.taptopay.core.refunds.CheckRefundableResult {
        private final com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason refundFailureReason) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refundFailureReason, "");
            this.reason = refundFailureReason;
        }

        public final com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason getReason() {
            return this.reason;
        }
    }

    public /* synthetic */ CheckRefundableResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
