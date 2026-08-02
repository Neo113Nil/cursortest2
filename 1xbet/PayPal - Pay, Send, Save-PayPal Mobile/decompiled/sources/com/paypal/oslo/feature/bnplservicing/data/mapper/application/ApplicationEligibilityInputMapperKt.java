package com.paypal.oslo.feature.bnplservicing.data.mapper.application;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0006\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/application/input/ApplicationEligibilityInput;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLApplicationEligibilityInput;", "toGraphQLInput", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/application/input/ApplicationEligibilityInput;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLApplicationEligibilityInput;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "toApplicationEligibilityInput", "(Ljava/util/List;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLApplicationEligibilityInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ApplicationEligibilityInputMapperKt {
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLApplicationEligibilityInput toGraphQLInput(com.paypal.oslo.feature.bnplservicing.domain.model.application.input.ApplicationEligibilityInput applicationEligibilityInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationEligibilityInput, "");
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> creditProductIdentifiers = applicationEligibilityInput.getCreditProductIdentifiers();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(creditProductIdentifiers, 10));
        java.util.Iterator<T> it = creditProductIdentifiers.iterator();
        while (it.hasNext()) {
            arrayList.add(com.paypal.oslo.feature.bnplservicing.data.mapper.common.CreditProductIdentifierMapperKt.toBNPLCreditProductIdentifier((com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier) it.next()));
        }
        return new com.paypal.oslo.api.graphql.schema.type.BNPLApplicationEligibilityInput(com.paypal.oslo.feature.bnplservicing.data.mapper.common.FlowContextMapperKt.toBNPLAcquisitionFlowContextInput(applicationEligibilityInput.getFlowContext()), arrayList);
    }

    public static final com.paypal.oslo.api.graphql.schema.type.BNPLApplicationEligibilityInput toApplicationEligibilityInput(java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return toGraphQLInput(new com.paypal.oslo.feature.bnplservicing.domain.model.application.input.ApplicationEligibilityInput(list, new com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowContext(com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier.SELF_SERVICING, com.paypal.oslo.feature.bnplservicing.domain.model.common.Channel.MOBILE_APP, null, null, 12, null)));
    }
}
