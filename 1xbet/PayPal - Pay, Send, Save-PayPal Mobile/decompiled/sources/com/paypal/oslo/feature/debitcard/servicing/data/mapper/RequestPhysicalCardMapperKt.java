package com.paypal.oslo.feature.debitcard.servicing.data.mapper;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\"6\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"6\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0000j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/graphql/RequestPhysicalDebitCardMutation$Data;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/model/RequestPhysicalCardResponse;", "Lcom/paypal/oslo/feature/debitcard/shared/data/repository/Mapper;", "requestPhysicalCardResponseMapper", "Lkotlin/jvm/functions/Function1;", "getRequestPhysicalCardResponseMapper", "()Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/model/RequestPhysicalCardRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/RequestPhysicalDebitInstrumentInput;", "requestPhysicalDebitInstrumentInputMapper", "getRequestPhysicalDebitInstrumentInputMapper"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RequestPhysicalCardMapperKt {
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.Data, com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.RequestPhysicalCardResponse> requestPhysicalCardResponseMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.RequestPhysicalCardMapperKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.RequestPhysicalCardMapperKt.$r8$lambda$zUAlDR5kQIzMoBlIt1Bli3Vm6PU((com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.Data) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.RequestPhysicalCardRequest, com.paypal.oslo.api.graphql.schema.type.RequestPhysicalDebitInstrumentInput> requestPhysicalDebitInstrumentInputMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.RequestPhysicalCardMapperKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.RequestPhysicalCardMapperKt.$r8$lambda$k5UDDijaWEzjoB2wkXBSn02ZS9Y((com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.RequestPhysicalCardRequest) obj);
        }
    };

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.Data, com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.RequestPhysicalCardResponse> getRequestPhysicalCardResponseMapper() {
        return requestPhysicalCardResponseMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.RequestPhysicalCardRequest, com.paypal.oslo.api.graphql.schema.type.RequestPhysicalDebitInstrumentInput> getRequestPhysicalDebitInstrumentInputMapper() {
        return requestPhysicalDebitInstrumentInputMapper;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.RequestPhysicalDebitInstrumentInput $r8$lambda$k5UDDijaWEzjoB2wkXBSn02ZS9Y(com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.RequestPhysicalCardRequest requestPhysicalCardRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestPhysicalCardRequest, "");
        return new com.paypal.oslo.api.graphql.schema.type.RequestPhysicalDebitInstrumentInput(requestPhysicalCardRequest.getInstrumentId(), new com.apollographql.apollo.api.Optional.Present(requestPhysicalCardRequest.getShippingAddressId()));
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.RequestPhysicalCardResponse $r8$lambda$zUAlDR5kQIzMoBlIt1Bli3Vm6PU(com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.Data data) {
        java.lang.Object estimatedArrivalDate;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.debitcard.graphql.RequestPhysicalDebitCardMutation.Shipment shipment = data.getRequestPhysicalDebitInstrument().getDebitInstrument().getShipment();
        java.lang.String obj = (shipment == null || (estimatedArrivalDate = shipment.getEstimatedArrivalDate()) == null) ? null : estimatedArrivalDate.toString();
        return new com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.RequestPhysicalCardResponse(obj != null ? obj : "");
    }
}
