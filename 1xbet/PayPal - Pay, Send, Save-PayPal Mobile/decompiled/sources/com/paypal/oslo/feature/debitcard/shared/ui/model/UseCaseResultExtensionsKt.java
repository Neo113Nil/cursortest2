package com.paypal.oslo.feature.debitcard.shared.ui.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/UseCaseResult$Error;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "toDebitErrorType", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/UseCaseResult$Error;)Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UseCaseResultExtensionsKt {
    public static final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType toDebitErrorType(com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        return error instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error.NoInternet ? com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.NO_NETWORK : error instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error.RiskDeniedError ? com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.CONTACT_CUSTOMER_SERVICE : com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.RECOVERABLE;
    }
}
