package com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.customstatement;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/data/mapper/customstatement/RequestStatementMapper;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/mapper/Mapper;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/RequestTaxDocumentMutation$RequestTaxDocument;", "", "<init>", "()V", "input", "map", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/graphql/RequestTaxDocumentMutation$RequestTaxDocument;)Ljava/lang/Boolean;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RequestStatementMapper implements com.paypal.oslo.feature.taxanddocumentcenter.domain.mapper.Mapper<com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxDocumentMutation.RequestTaxDocument, java.lang.Boolean> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public RequestStatementMapper() {
    }

    @Override // com.paypal.oslo.feature.taxanddocumentcenter.domain.mapper.Mapper
    public final java.lang.Boolean map(com.paypal.oslo.feature.taxanddocumentcenter.graphql.RequestTaxDocumentMutation.RequestTaxDocument input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return java.lang.Boolean.valueOf(input.getSuccess());
    }
}
