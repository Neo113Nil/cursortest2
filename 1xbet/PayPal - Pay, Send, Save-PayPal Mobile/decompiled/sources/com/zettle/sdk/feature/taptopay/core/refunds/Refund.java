package com.zettle.sdk.feature.taptopay.core.refunds;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0015J?\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\bH&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH&¢\u0006\u0004\b\u0014\u0010\u000f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/Refund;", "", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;", "cardPaymentPayload", "", "amount", "", "refundReferenceId", "Lkotlin/Function1;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/Refund$DoRefundResult;", "", "result", "doRefund", "(Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;Ljava/lang/Long;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "end", "()V", "paymentReferenceId", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/RetrieveCardPaymentInfoResult;", "retrievePaymentInfo", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "DoRefundResult"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface Refund {
    void doRefund(com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload cardPaymentPayload, java.lang.Long amount, java.lang.String refundReferenceId, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.refunds.Refund.DoRefundResult, kotlin.Unit> result);

    void end();

    void retrievePaymentInfo(java.lang.String paymentReferenceId, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult, kotlin.Unit> result);

    void start();

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/Refund$DoRefundResult;", "", "<init>", "()V", "Failed", "Success", "Lcom/zettle/sdk/feature/taptopay/core/refunds/Refund$DoRefundResult$Failed;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/Refund$DoRefundResult$Success;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class DoRefundResult {

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/Refund$DoRefundResult$Success;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/Refund$DoRefundResult;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundPayload;", "refundPayload", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundPayload;)V", "Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundPayload;", "getRefundPayload", "()Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundPayload;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Success extends com.zettle.sdk.feature.taptopay.core.refunds.Refund.DoRefundResult {
            private final com.zettle.sdk.feature.taptopay.core.refunds.models.RefundPayload refundPayload;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(com.zettle.sdk.feature.taptopay.core.refunds.models.RefundPayload refundPayload) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refundPayload, "");
                this.refundPayload = refundPayload;
            }

            public final com.zettle.sdk.feature.taptopay.core.refunds.models.RefundPayload getRefundPayload() {
                return this.refundPayload;
            }
        }

        private DoRefundResult() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/Refund$DoRefundResult$Failed;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/Refund$DoRefundResult;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE, "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;)V", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;", "getFailure", "()Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Failed extends com.zettle.sdk.feature.taptopay.core.refunds.Refund.DoRefundResult {
            private final com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason failure;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failed(com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason refundFailureReason) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refundFailureReason, "");
                this.failure = refundFailureReason;
            }

            public final com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason getFailure() {
                return this.failure;
            }
        }

        public /* synthetic */ DoRefundResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
