package com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.customstatement;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/customstatement/GenerateStatementRequestMapper;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/mapper/Mapper;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/request/GenerateStatementRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/RequestTaxDocumentInput;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/type/RequestTaxDocumentInput;", "<init>", "()V", "input", "map", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/request/GenerateStatementRequest;)Lcom/paypal/oslo/api/graphql/schema/type/RequestTaxDocumentInput;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GenerateStatementRequestMapper implements com.paypal.oslo.feature.taxanddocumentcenter.domain.mapper.Mapper<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.request.GenerateStatementRequest, com.paypal.oslo.api.graphql.schema.type.RequestTaxDocumentInput> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public GenerateStatementRequestMapper() {
    }

    @Override // com.paypal.oslo.feature.taxanddocumentcenter.domain.mapper.Mapper
    public final com.paypal.oslo.api.graphql.schema.type.RequestTaxDocumentInput map(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.request.GenerateStatementRequest input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.api.graphql.schema.type.RequestTaxDocumentInput(com.paypal.oslo.api.graphql.schema.type.TaxDocumentType.CUSTOM_STATEMENT, com.paypal.oslo.api.graphql.schema.type.TaxDocumentFileType.INSTANCE.safeValueOf(input.getFileType().getApiValue()), com.paypal.oslo.api.graphql.schema.type.TaxDocumentTransactionType.INSTANCE.safeValueOf(input.getTransactionType().getApiValue()), input.getStartTime(), input.getEndTime());
    }
}
