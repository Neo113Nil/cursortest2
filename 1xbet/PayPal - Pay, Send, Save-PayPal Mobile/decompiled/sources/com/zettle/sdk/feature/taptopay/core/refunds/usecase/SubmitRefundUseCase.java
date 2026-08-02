package com.zettle.sdk.feature.taptopay.core.refunds.usecase;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\bà\u0080\u0001\u0018\u00002D\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0004\u0012\u00020\n0\u0001:\u0001\u0014JZ\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH¦\u0002¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/SubmitRefundUseCase;", "Lkotlin/Function7;", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;", "", "", "Lcom/zettle/sdk/meta/AppInfo;", "Lcom/zettle/sdk/meta/PlatformInfo;", "Lcom/zettle/sdk/core/os/LocationData;", "Lkotlin/Function1;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/SubmitRefundUseCase$Result;", "", "payload", "amount", "refundReferenceId", "appInfo", "platformInfo", "lastLocation", "block", "invoke", "(Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;Ljava/lang/Long;Ljava/lang/String;Lcom/zettle/sdk/meta/AppInfo;Lcom/zettle/sdk/meta/PlatformInfo;Lcom/zettle/sdk/core/os/LocationData;Lkotlin/jvm/functions/Function1;)V", "Result"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface SubmitRefundUseCase extends kotlin.jvm.functions.Function7<com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload, java.lang.Long, java.lang.String, com.zettle.sdk.meta.AppInfo, com.zettle.sdk.meta.PlatformInfo, com.zettle.sdk.core.os.LocationData, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.refunds.usecase.SubmitRefundUseCase.Result, ? extends kotlin.Unit>, kotlin.Unit> {
    void invoke(com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload payload, java.lang.Long amount, java.lang.String refundReferenceId, com.zettle.sdk.meta.AppInfo appInfo, com.zettle.sdk.meta.PlatformInfo platformInfo, com.zettle.sdk.core.os.LocationData lastLocation, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.refunds.usecase.SubmitRefundUseCase.Result, kotlin.Unit> block);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/SubmitRefundUseCase$Result;", "", "<init>", "()V", "Failed", "Success", "Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/SubmitRefundUseCase$Result$Failed;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/SubmitRefundUseCase$Result$Success;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Result {

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/SubmitRefundUseCase$Result$Success;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/SubmitRefundUseCase$Result;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundPayload;", "payload", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundPayload;)V", "Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundPayload;", "getPayload", "()Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundPayload;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Success extends com.zettle.sdk.feature.taptopay.core.refunds.usecase.SubmitRefundUseCase.Result {
            private final com.zettle.sdk.feature.taptopay.core.refunds.models.RefundPayload payload;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(com.zettle.sdk.feature.taptopay.core.refunds.models.RefundPayload refundPayload) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refundPayload, "");
                this.payload = refundPayload;
            }

            public final com.zettle.sdk.feature.taptopay.core.refunds.models.RefundPayload getPayload() {
                return this.payload;
            }
        }

        private Result() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/SubmitRefundUseCase$Result$Failed;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/usecase/SubmitRefundUseCase$Result;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;", "reason", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;)V", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;", "getReason", "()Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Failed extends com.zettle.sdk.feature.taptopay.core.refunds.usecase.SubmitRefundUseCase.Result {
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
