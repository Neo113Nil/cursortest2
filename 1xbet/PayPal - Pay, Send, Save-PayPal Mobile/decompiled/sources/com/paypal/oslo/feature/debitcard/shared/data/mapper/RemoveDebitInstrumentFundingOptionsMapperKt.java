package com.paypal.oslo.feature.debitcard.shared.data.mapper;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\"6\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"6\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0000j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/RemoveDebitCardFundingOptionRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/RemoveDebitInstrumentFundingOptionsInput;", "Lcom/paypal/oslo/feature/debitcard/shared/data/repository/Mapper;", "removeDebitInstrumentRequestMapper", "Lkotlin/jvm/functions/Function1;", "getRemoveDebitInstrumentRequestMapper", "()Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/debitcard/graphql/RemoveDebitInstrumentFundingOptionsMutation$Data;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/RemoveDebitCardFundingOptionResult;", "removeDebitInstrumentResponseMapper", "getRemoveDebitInstrumentResponseMapper"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RemoveDebitInstrumentFundingOptionsMapperKt {
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.RemoveDebitCardFundingOptionRequest, com.paypal.oslo.api.graphql.schema.type.RemoveDebitInstrumentFundingOptionsInput> removeDebitInstrumentRequestMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.shared.data.mapper.RemoveDebitInstrumentFundingOptionsMapperKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.shared.data.mapper.RemoveDebitInstrumentFundingOptionsMapperKt.$r8$lambda$VV2JBw445Jqm2a7pEoXpItQ_ztI((com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.RemoveDebitCardFundingOptionRequest) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.RemoveDebitInstrumentFundingOptionsMutation.Data, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.RemoveDebitCardFundingOptionResult> removeDebitInstrumentResponseMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.shared.data.mapper.RemoveDebitInstrumentFundingOptionsMapperKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.shared.data.mapper.RemoveDebitInstrumentFundingOptionsMapperKt.$r8$lambda$Zv9VCojEjTbbUHf8i8k34c75zyA((com.paypal.oslo.feature.debitcard.graphql.RemoveDebitInstrumentFundingOptionsMutation.Data) obj);
        }
    };

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.RemoveDebitCardFundingOptionRequest, com.paypal.oslo.api.graphql.schema.type.RemoveDebitInstrumentFundingOptionsInput> getRemoveDebitInstrumentRequestMapper() {
        return removeDebitInstrumentRequestMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.RemoveDebitInstrumentFundingOptionsMutation.Data, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.RemoveDebitCardFundingOptionResult> getRemoveDebitInstrumentResponseMapper() {
        return removeDebitInstrumentResponseMapper;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.RemoveDebitInstrumentFundingOptionsInput $r8$lambda$VV2JBw445Jqm2a7pEoXpItQ_ztI(com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.RemoveDebitCardFundingOptionRequest removeDebitCardFundingOptionRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removeDebitCardFundingOptionRequest, "");
        return new com.paypal.oslo.api.graphql.schema.type.RemoveDebitInstrumentFundingOptionsInput(removeDebitCardFundingOptionRequest.getInstrumentId());
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.RemoveDebitCardFundingOptionResult $r8$lambda$Zv9VCojEjTbbUHf8i8k34c75zyA(com.paypal.oslo.feature.debitcard.graphql.RemoveDebitInstrumentFundingOptionsMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.RemoveDebitCardFundingOptionResult(data.getRemoveDebitInstrumentFundingOptions().getSuccess());
    }
}
