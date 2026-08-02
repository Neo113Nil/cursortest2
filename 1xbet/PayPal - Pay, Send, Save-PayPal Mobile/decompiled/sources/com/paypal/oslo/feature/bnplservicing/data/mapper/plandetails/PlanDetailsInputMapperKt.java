package com.paypal.oslo.feature.bnplservicing.data.mapper.plandetails;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlanInput;", "toBnplServicingPlanOverviewInput", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlanInput;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLAutopayFlowContextInput;", "toBnplAutopayFlowContextInput", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLAutopayFlowContextInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlanDetailsInputMapperKt {
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLPlanInput toBnplServicingPlanOverviewInput(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new com.paypal.oslo.api.graphql.schema.type.BNPLPlanInput(str);
    }

    public static final com.paypal.oslo.api.graphql.schema.type.BNPLAutopayFlowContextInput toBnplAutopayFlowContextInput() {
        return new com.paypal.oslo.api.graphql.schema.type.BNPLAutopayFlowContextInput(com.paypal.oslo.api.graphql.schema.type.BNPLServicingFlowSpecifier.SELF_SERVICING, com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel.MOBILE_APP);
    }
}
