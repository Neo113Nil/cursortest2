package com.paypal.oslo.feature.bnplservicing.data.mapper.common;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/FlowContext;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionFlowContextInput;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/type/BNPLAcquisitionFlowContextInput;", "toBNPLAcquisitionFlowContextInput", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/FlowContext;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionFlowContextInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FlowContextMapperKt {
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowContextInput toBNPLAcquisitionFlowContextInput(com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowContext flowContext) {
        com.apollographql.apollo.api.Optional.Present present;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowContext, "");
        com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowSpecifier bNPLAcquisitionFlowSpecifier = com.paypal.oslo.feature.bnplservicing.data.mapper.common.FlowSpecifierMapperKt.toBNPLAcquisitionFlowSpecifier(flowContext.getFlowSpecifier());
        com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel creditFlowContextChannel = com.paypal.oslo.feature.bnplservicing.data.mapper.common.ChannelMapperKt.toCreditFlowContextChannel(flowContext.getChannel());
        if (flowContext.getAttributes().isEmpty()) {
            present = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
        } else {
            java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute> attributes = flowContext.getAttributes();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(attributes, 10));
            java.util.Iterator<T> it = attributes.iterator();
            while (it.hasNext()) {
                arrayList.add(com.paypal.oslo.feature.bnplservicing.data.mapper.common.FlowAttributeMapperKt.toBNPLAcquisitionFlowAttribute((com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute) it.next()));
            }
            present = new com.apollographql.apollo.api.Optional.Present(arrayList);
        }
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowOutcome outcome = flowContext.getOutcome();
        return new com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowContextInput(present, creditFlowContextChannel, bNPLAcquisitionFlowSpecifier, companion.presentIfNotNull(outcome != null ? com.paypal.oslo.feature.bnplservicing.data.mapper.common.FlowOutcomeMapperKt.toBNPLAcquisitionFlowOutcome(outcome) : null));
    }
}
