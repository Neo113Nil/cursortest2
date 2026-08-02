package com.zettle.sdk.feature.taptopay.core.refunds.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bà\u0080\u0001\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\nJ,\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H¦\u0002¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/CheckRefundableUseCase;", "Lkotlin/Function2;", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;", "Lkotlin/Function1;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/CheckRefundableUseCase$Result;", "", "cardPaymentPayload", "block", "invoke", "(Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;Lkotlin/jvm/functions/Function1;)V", "Result"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface CheckRefundableUseCase extends kotlin.jvm.functions.Function2<com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.refunds.usecase.CheckRefundableUseCase.Result, ? extends kotlin.Unit>, kotlin.Unit> {
    void invoke(com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload cardPaymentPayload, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.refunds.usecase.CheckRefundableUseCase.Result, kotlin.Unit> block);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/CheckRefundableUseCase$Result;", "", "<init>", "()V", "Failed", "Success", "Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/CheckRefundableUseCase$Result$Failed;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/CheckRefundableUseCase$Result$Success;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Result {

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/CheckRefundableUseCase$Result$Success;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/CheckRefundableUseCase$Result;", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;", "cardPaymentPayload", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;)V", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;", "getCardPaymentPayload", "()Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Success extends com.zettle.sdk.feature.taptopay.core.refunds.usecase.CheckRefundableUseCase.Result {
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

        private Result() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/CheckRefundableUseCase$Result$Failed;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/CheckRefundableUseCase$Result;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;", "reason", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;)V", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;", "getReason", "()Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Failed extends com.zettle.sdk.feature.taptopay.core.refunds.usecase.CheckRefundableUseCase.Result {
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

        public /* synthetic */ Result(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
