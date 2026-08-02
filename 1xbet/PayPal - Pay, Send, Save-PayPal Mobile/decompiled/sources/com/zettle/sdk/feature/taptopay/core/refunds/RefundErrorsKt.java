package com.zettle.sdk.feature.taptopay.core.refunds;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;", "toRefundFailureReason", "(Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/core/refunds/RefundFailureReason;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RefundErrorsKt {
    public static final com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason toRefundFailureReason(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -1761736932:
                if (str.equals("#RefundDateExpired")) {
                    return com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.RefundExpired.INSTANCE;
                }
                break;
            case -1287578216:
                if (str.equals("#RefundFailed")) {
                    return com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.TechnicalError.INSTANCE;
                }
                break;
            case -997936635:
                if (str.equals("#InvalidToken")) {
                    return com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.NotAuthorized.INSTANCE;
                }
                break;
            case -878367495:
                if (str.equals("#RefundUnknownError")) {
                    return com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.TechnicalError.INSTANCE;
                }
                break;
            case -838037552:
                if (str.equals("#RefundInsufficientFunds")) {
                    return com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.InsufficientFunds.INSTANCE;
                }
                break;
            case -167757844:
                if (str.equals("#AlreadyRefunded")) {
                    return com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.AlreadyRefunded.INSTANCE;
                }
                break;
            case 1382277296:
                if (str.equals("#RefundAmountExceedOriginalAmount")) {
                    return com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.AmountTooHigh.INSTANCE;
                }
                break;
            case 1687559010:
                if (str.equals("#RefundNotApprovedByAcquirer")) {
                    return com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.TechnicalError.INSTANCE;
                }
                break;
            case 1992797628:
                if (str.equals("#RefundOnlyFullAmoutAllowed")) {
                    return com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.PartialRefundNotSupported.INSTANCE;
                }
                break;
        }
        return com.zettle.sdk.feature.taptopay.core.refunds.RefundFailureReason.TechnicalError.INSTANCE;
    }
}
