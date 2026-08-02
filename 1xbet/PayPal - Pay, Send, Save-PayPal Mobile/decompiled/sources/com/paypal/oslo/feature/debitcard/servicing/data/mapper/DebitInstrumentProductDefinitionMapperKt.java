package com.paypal.oslo.feature.debitcard.servicing.data.mapper;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\"6\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\":\u0010\n\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0000j\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/instrumentproduct/model/DebitInstrumentProductDefinitionRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductInput;", "Lcom/paypal/oslo/feature/debitcard/shared/data/repository/Mapper;", "debitInstrumentProductDefinitionRequestMapper", "Lkotlin/jvm/functions/Function1;", "getDebitInstrumentProductDefinitionRequestMapper", "()Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentProductDefinitionQuery$Data;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/instrumentproduct/model/DebitInstrumentProductDefinition;", "debitInstrumentProductDefinitionMapper", "getDebitInstrumentProductDefinitionMapper"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitInstrumentProductDefinitionMapperKt {
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.domain.instrumentproduct.model.DebitInstrumentProductDefinitionRequest, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductInput> debitInstrumentProductDefinitionRequestMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.DebitInstrumentProductDefinitionMapperKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.DebitInstrumentProductDefinitionMapperKt.m14279$r8$lambda$Jv49wpWXhkBo_CPDCpY8m7pNA((com.paypal.oslo.feature.debitcard.servicing.domain.instrumentproduct.model.DebitInstrumentProductDefinitionRequest) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentProductDefinitionQuery.Data, com.paypal.oslo.feature.debitcard.servicing.domain.instrumentproduct.model.DebitInstrumentProductDefinition> debitInstrumentProductDefinitionMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.DebitInstrumentProductDefinitionMapperKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.DebitInstrumentProductDefinitionMapperKt.m14280$r8$lambda$gEiwGaGZ2KTKJmCsUN9z73JkQ((com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentProductDefinitionQuery.Data) obj);
        }
    };

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.domain.instrumentproduct.model.DebitInstrumentProductDefinitionRequest, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductInput> getDebitInstrumentProductDefinitionRequestMapper() {
        return debitInstrumentProductDefinitionRequestMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentProductDefinitionQuery.Data, com.paypal.oslo.feature.debitcard.servicing.domain.instrumentproduct.model.DebitInstrumentProductDefinition> getDebitInstrumentProductDefinitionMapper() {
        return debitInstrumentProductDefinitionMapper;
    }

    /* renamed from: $r8$lambda$Jv49wpW-XhkBo_CPDCpY8-m7pNA, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductInput m14279$r8$lambda$Jv49wpWXhkBo_CPDCpY8m7pNA(com.paypal.oslo.feature.debitcard.servicing.domain.instrumentproduct.model.DebitInstrumentProductDefinitionRequest debitInstrumentProductDefinitionRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentProductDefinitionRequest, "");
        return new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductInput(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.INSTANCE.safeValueOf(debitInstrumentProductDefinitionRequest.getProductName().name()), debitInstrumentProductDefinitionRequest.getCountryCode());
    }

    /* renamed from: $r8$lambda$gEiwGaG-Z2KTKJmCsU-N9z73JkQ, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.instrumentproduct.model.DebitInstrumentProductDefinition m14280$r8$lambda$gEiwGaGZ2KTKJmCsUN9z73JkQ(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentProductDefinitionQuery.Data data) {
        com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentProductDefinitionQuery.Front1 front;
        java.lang.Object referenceUrl;
        com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentProductDefinitionQuery.Front front2;
        java.lang.Object referenceUrl2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentProductDefinitionQuery.DebitInstrumentProduct debitInstrumentProduct = data.getDebitInstrumentProduct();
        java.lang.String str = null;
        if (debitInstrumentProduct == null) {
            return null;
        }
        java.lang.String shortName = debitInstrumentProduct.getShortName();
        com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentProductDefinitionQuery.SmallImage smallImage = debitInstrumentProduct.getSmallImage();
        java.lang.String obj = (smallImage == null || (front2 = smallImage.getFront()) == null || (referenceUrl2 = front2.getReferenceUrl()) == null) ? null : referenceUrl2.toString();
        com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentProductDefinitionQuery.MediumImage mediumImage = debitInstrumentProduct.getMediumImage();
        if (mediumImage != null && (front = mediumImage.getFront()) != null && (referenceUrl = front.getReferenceUrl()) != null) {
            str = referenceUrl.toString();
        }
        return new com.paypal.oslo.feature.debitcard.servicing.domain.instrumentproduct.model.DebitInstrumentProductDefinition(shortName, obj, str);
    }
}
