package com.paypal.oslo.feature.bnplacquisition.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/CloseBnplLoanMutation$Data;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/closeloan/CloseCreditLoan;", "toCloseCreditLoan", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/CloseBnplLoanMutation$Data;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/closeloan/CloseCreditLoan;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/CloseCreditLoanRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/CloseBNPLLoanInput;", "toGraphQLInput", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/CloseCreditLoanRequest;)Lcom/paypal/oslo/api/graphql/schema/type/CloseBNPLLoanInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CloseCreditLoanMapperKt {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.closeloan.CloseCreditLoan toCloseCreditLoan(com.paypal.oslo.feature.bnplacquisition.graphql.CloseBnplLoanMutation.Data data) {
        com.paypal.oslo.feature.bnplacquisition.graphql.CloseBnplLoanMutation.CloseBnplLoan closeBnplLoan;
        if (data == null || (closeBnplLoan = data.getCloseBnplLoan()) == null) {
            return null;
        }
        java.lang.Object creditAccountId = closeBnplLoan.getCreditAccountId();
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.closeloan.CloseCreditLoan(creditAccountId instanceof java.lang.String ? (java.lang.String) creditAccountId : null);
    }

    public static final com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanInput toGraphQLInput(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.CloseCreditLoanRequest closeCreditLoanRequest) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeCreditLoanRequest, "");
        java.lang.String creditAccountId = closeCreditLoanRequest.getCreditAccountId();
        com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanFlowSpecifier safeValueOf = com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanFlowSpecifier.INSTANCE.safeValueOf(closeCreditLoanRequest.getFlowContext().getFlowSpecifier().name());
        com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel safeValueOf2 = com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel.INSTANCE.safeValueOf(closeCreditLoanRequest.getFlowContext().getChannel());
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        java.util.List<java.lang.String> attributes = closeCreditLoanRequest.getFlowContext().getAttributes();
        if (attributes != null) {
            java.util.List<java.lang.String> list = attributes;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanFlowAttribute.INSTANCE.safeValueOf(com.paypal.oslo.feature.bnplacquisition.data.repository.ExperienceSessionRepositoryImpl.FLOW_ATTRIBUTE_PREFIX.concat(java.lang.String.valueOf((java.lang.String) it.next()))));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanInput(creditAccountId, new com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanFlowContextInput(companion.presentIfNotNull(arrayList), safeValueOf2, safeValueOf));
    }
}
