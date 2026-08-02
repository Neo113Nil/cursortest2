package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/StatementDeliveryError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "toErrorMessage", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/StatementDeliveryError;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class StatementDeliveryErrorMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString toErrorMessage(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError statementDeliveryError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementDeliveryError, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_statement_delivery_error_generic, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }
}
