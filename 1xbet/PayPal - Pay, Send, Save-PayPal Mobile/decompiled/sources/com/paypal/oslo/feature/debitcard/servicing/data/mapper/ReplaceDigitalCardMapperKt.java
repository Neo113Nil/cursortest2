package com.paypal.oslo.feature.debitcard.servicing.data.mapper;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\">\u0010\u0005\u001a&\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0000j\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u00060\u0002j\u0002`\u0003`\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"6\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0000j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n`\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/replacedigitalcard/model/ReplaceDigitalCardRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/ReplaceVirtualDebitInstrumentInput;", "Lcom/paypal/oslo/feature/debitcard/graphql/type/ReplaceVirtualDebitInstrumentInput;", "Lcom/paypal/oslo/feature/debitcard/shared/data/repository/Mapper;", "replaceDigitalCardRequestMapper", "Lkotlin/jvm/functions/Function1;", "getReplaceDigitalCardRequestMapper", "()Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/debitcard/graphql/ReplaceVirtualDebitInstrumentMutation$Data;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/replacedigitalcard/model/ReplaceDigitalCardResponse;", "replaceDigitalCardResponseMapper", "getReplaceDigitalCardResponseMapper"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReplaceDigitalCardMapperKt {
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.domain.replacedigitalcard.model.ReplaceDigitalCardRequest, com.paypal.oslo.api.graphql.schema.type.ReplaceVirtualDebitInstrumentInput> replaceDigitalCardRequestMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.ReplaceDigitalCardMapperKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.ReplaceDigitalCardMapperKt.$r8$lambda$XWye6dcnPNkeL4sNhRbp6TE4p1s((com.paypal.oslo.feature.debitcard.servicing.domain.replacedigitalcard.model.ReplaceDigitalCardRequest) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.ReplaceVirtualDebitInstrumentMutation.Data, com.paypal.oslo.feature.debitcard.servicing.domain.replacedigitalcard.model.ReplaceDigitalCardResponse> replaceDigitalCardResponseMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.ReplaceDigitalCardMapperKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.ReplaceDigitalCardMapperKt.m14285$r8$lambda$oKeOg8MsH2FXet6ldDR50QWMAc((com.paypal.oslo.feature.debitcard.graphql.ReplaceVirtualDebitInstrumentMutation.Data) obj);
        }
    };

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.domain.replacedigitalcard.model.ReplaceDigitalCardRequest, com.paypal.oslo.api.graphql.schema.type.ReplaceVirtualDebitInstrumentInput> getReplaceDigitalCardRequestMapper() {
        return replaceDigitalCardRequestMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.ReplaceVirtualDebitInstrumentMutation.Data, com.paypal.oslo.feature.debitcard.servicing.domain.replacedigitalcard.model.ReplaceDigitalCardResponse> getReplaceDigitalCardResponseMapper() {
        return replaceDigitalCardResponseMapper;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ReplaceVirtualDebitInstrumentInput $r8$lambda$XWye6dcnPNkeL4sNhRbp6TE4p1s(com.paypal.oslo.feature.debitcard.servicing.domain.replacedigitalcard.model.ReplaceDigitalCardRequest replaceDigitalCardRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replaceDigitalCardRequest, "");
        return new com.paypal.oslo.api.graphql.schema.type.ReplaceVirtualDebitInstrumentInput(replaceDigitalCardRequest.getInstrumentId(), null, null, 6, null);
    }

    /* renamed from: $r8$lambda$oKeOg8MsH2FXet6ldDR50QWM-Ac, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.replacedigitalcard.model.ReplaceDigitalCardResponse m14285$r8$lambda$oKeOg8MsH2FXet6ldDR50QWMAc(com.paypal.oslo.feature.debitcard.graphql.ReplaceVirtualDebitInstrumentMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return new com.paypal.oslo.feature.debitcard.servicing.domain.replacedigitalcard.model.ReplaceDigitalCardResponse(data.getReplaceVirtualDebitInstrument().getSuccess());
    }
}
