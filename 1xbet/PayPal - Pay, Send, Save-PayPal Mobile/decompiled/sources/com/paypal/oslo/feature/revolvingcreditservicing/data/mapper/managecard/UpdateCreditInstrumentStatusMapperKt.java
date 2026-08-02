package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.managecard;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/UpdateRevolvingCreditInstrumentStatusMutation$Data;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/CreditInstrumentUpdateResponse;", "toDomain", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/UpdateRevolvingCreditInstrumentStatusMutation$Data;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/CreditInstrumentUpdateResponse;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UpdateCreditInstrumentStatusMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.CreditInstrumentUpdateResponse toDomain(com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditInstrumentStatusMutation.Data data) {
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditInstrumentStatusMutation.UpdateRevolvingCreditInstrumentStatus updateRevolvingCreditInstrumentStatus;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditInstrumentStatusMutation.OnUpdateRevolvingCreditInstrumentStatusSuccess onUpdateRevolvingCreditInstrumentStatusSuccess;
        if (data == null || (updateRevolvingCreditInstrumentStatus = data.getUpdateRevolvingCreditInstrumentStatus()) == null || (onUpdateRevolvingCreditInstrumentStatusSuccess = updateRevolvingCreditInstrumentStatus.getOnUpdateRevolvingCreditInstrumentStatusSuccess()) == null) {
            return null;
        }
        java.lang.Object creditInstrumentId = onUpdateRevolvingCreditInstrumentStatusSuccess.getCreditInstrumentId();
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.CreditInstrumentUpdateResponse(creditInstrumentId instanceof java.lang.String ? (java.lang.String) creditInstrumentId : null);
    }
}
