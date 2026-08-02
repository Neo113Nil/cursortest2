package com.zettle.sdk.feature.taptopay.ui.models;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundPayload;", "Lcom/zettle/sdk/feature/taptopay/ui/models/RefundPayloadResult;", "toRefundPayloadResult", "(Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundPayload;)Lcom/zettle/sdk/feature/taptopay/ui/models/RefundPayloadResult;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TapToPayRefundKt {
    public static final com.zettle.sdk.feature.taptopay.ui.models.RefundPayloadResult toRefundPayloadResult(com.zettle.sdk.feature.taptopay.core.refunds.models.RefundPayload refundPayload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refundPayload, "");
        return new com.zettle.sdk.feature.taptopay.ui.models.RefundPayloadResult(refundPayload.getOriginalAmount(), refundPayload.getRefundedAmount(), refundPayload.getTransactionId(), refundPayload.getCardType(), refundPayload.getMaskedPan(), refundPayload.getReferenceNumber(), refundPayload.getCardPaymentEntryMode());
    }
}
