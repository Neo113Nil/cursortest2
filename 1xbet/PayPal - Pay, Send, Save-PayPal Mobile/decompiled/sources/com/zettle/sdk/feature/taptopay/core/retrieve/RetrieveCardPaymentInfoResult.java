package com.zettle.sdk.feature.taptopay.core.retrieve;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/retrieve/RetrieveCardPaymentInfoResult;", "", "Failed", "Success", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/RetrieveCardPaymentInfoResult$Failed;", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/RetrieveCardPaymentInfoResult$Success;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface RetrieveCardPaymentInfoResult {

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/retrieve/RetrieveCardPaymentInfoResult$Success;", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/RetrieveCardPaymentInfoResult;", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;", "cardPaymentPayload", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;)V", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;", "getCardPaymentPayload", "()Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Success implements com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult {
        private final com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload cardPaymentPayload;

        public Success(com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload cardPaymentPayload) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardPaymentPayload, "");
            this.cardPaymentPayload = cardPaymentPayload;
        }

        public final com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload getCardPaymentPayload() {
            return this.cardPaymentPayload;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/retrieve/RetrieveCardPaymentInfoResult$Failed;", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/RetrieveCardPaymentInfoResult;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE, "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;)V", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;", "getFailure", "()Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Failed implements com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult {
        private final com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason failure;

        public Failed(com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason refundFailureReason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refundFailureReason, "");
            this.failure = refundFailureReason;
        }

        public final com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason getFailure() {
            return this.failure;
        }
    }
}
