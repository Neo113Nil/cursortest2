package com.paypal.oslo.feature.debitcard.servicing.domain.activatecard;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/UseCaseResult$Error;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInlineErrorType;", "toActivationInlineErrorType", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/UseCaseResult$Error;)Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInlineErrorType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ActivationUseCaseResultExtensionsKt {
    public static final com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInlineErrorType toActivationInlineErrorType(com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        if (error instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error.InvalidCVVError) {
            return com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInlineErrorType.INVALID_CVV;
        }
        return null;
    }
}
