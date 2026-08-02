package com.paypal.oslo.feature.debitcard.servicing.data.mapper;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\">\u0010\u0005\u001a&\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0000j\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u00060\u0002j\u0002`\u0003`\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"6\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0000j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n`\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/model/CancelCardRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/CloseDebitInstrumentInput;", "Lcom/paypal/oslo/feature/debitcard/graphql/type/CloseDebitInstrumentInput;", "Lcom/paypal/oslo/feature/debitcard/shared/data/repository/Mapper;", "cancelCardRequestMapper", "Lkotlin/jvm/functions/Function1;", "getCancelCardRequestMapper", "()Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/debitcard/graphql/CloseDebitInstrumentMutation$Data;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/model/CancelCardResult;", "cancelCardResponseMapper", "getCancelCardResponseMapper"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CancelCardMapperKt {
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.model.CancelCardRequest, com.paypal.oslo.api.graphql.schema.type.CloseDebitInstrumentInput> cancelCardRequestMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.CancelCardMapperKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.CancelCardMapperKt.$r8$lambda$obY40dzs2MNKo1QJsuyLwDcKGiA((com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.model.CancelCardRequest) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.CloseDebitInstrumentMutation.Data, com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.model.CancelCardResult> cancelCardResponseMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.CancelCardMapperKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.CancelCardMapperKt.m14277$r8$lambda$_PG39CRFkrde1pnbgixDb53s((com.paypal.oslo.feature.debitcard.graphql.CloseDebitInstrumentMutation.Data) obj);
        }
    };

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.model.CancelCardRequest, com.paypal.oslo.api.graphql.schema.type.CloseDebitInstrumentInput> getCancelCardRequestMapper() {
        return cancelCardRequestMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.CloseDebitInstrumentMutation.Data, com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.model.CancelCardResult> getCancelCardResponseMapper() {
        return cancelCardResponseMapper;
    }

    /* renamed from: $r8$lambda$_PG39CRFk-rde1-pnbgixDb53-s, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.model.CancelCardResult m14277$r8$lambda$_PG39CRFkrde1pnbgixDb53s(com.paypal.oslo.feature.debitcard.graphql.CloseDebitInstrumentMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return new com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.model.CancelCardResult(data.getCloseDebitInstrument().getSuccess());
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CloseDebitInstrumentInput $r8$lambda$obY40dzs2MNKo1QJsuyLwDcKGiA(com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.model.CancelCardRequest cancelCardRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelCardRequest, "");
        return new com.paypal.oslo.api.graphql.schema.type.CloseDebitInstrumentInput(cancelCardRequest.getInstrumentId());
    }
}
