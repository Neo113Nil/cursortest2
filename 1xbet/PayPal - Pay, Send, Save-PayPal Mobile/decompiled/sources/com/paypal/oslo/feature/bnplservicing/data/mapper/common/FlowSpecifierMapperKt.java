package com.paypal.oslo.feature.bnplservicing.data.mapper.common;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/FlowSpecifier;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionFlowSpecifier;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/type/BNPLAcquisitionFlowSpecifier;", "toBNPLAcquisitionFlowSpecifier", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/FlowSpecifier;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionFlowSpecifier;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FlowSpecifierMapperKt {
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowSpecifier toBNPLAcquisitionFlowSpecifier(com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier flowSpecifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowSpecifier, "");
        int i = com.paypal.oslo.feature.bnplservicing.data.mapper.common.FlowSpecifierMapperKt.WhenMappings.$EnumSwitchMapping$0[flowSpecifier.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowSpecifier.PURCHASE;
        }
        if (i == 2) {
            return com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowSpecifier.SELF_SERVICING;
        }
        if (i == 3) {
            return com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowSpecifier.STANDALONE_APPLICATION;
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowSpecifier.UNKNOWN__;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier.values().length];
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier.PURCHASE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier.SELF_SERVICING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier.STANDALONE_APPLICATION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowSpecifier.UNKNOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
