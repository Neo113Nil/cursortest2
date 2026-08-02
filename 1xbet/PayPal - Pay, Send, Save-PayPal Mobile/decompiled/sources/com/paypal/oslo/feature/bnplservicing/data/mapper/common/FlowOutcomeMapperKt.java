package com.paypal.oslo.feature.bnplservicing.data.mapper.common;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/FlowOutcome;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionFlowOutcome;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/type/BNPLAcquisitionFlowOutcome;", "toBNPLAcquisitionFlowOutcome", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/FlowOutcome;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionFlowOutcome;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FlowOutcomeMapperKt {
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowOutcome toBNPLAcquisitionFlowOutcome(com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowOutcome flowOutcome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowOutcome, "");
        int i = com.paypal.oslo.feature.bnplservicing.data.mapper.common.FlowOutcomeMapperKt.WhenMappings.$EnumSwitchMapping$0[flowOutcome.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowOutcome.CREDIT_FINANCIAL_INSTRUMENT;
        }
        if (i == 2) {
            return com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowOutcome.VIRTUAL_CREDIT_CARD;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowOutcome.UNKNOWN__;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowOutcome.values().length];
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowOutcome.CREDIT_FINANCIAL_INSTRUMENT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowOutcome.VIRTUAL_CREDIT_CARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowOutcome.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
