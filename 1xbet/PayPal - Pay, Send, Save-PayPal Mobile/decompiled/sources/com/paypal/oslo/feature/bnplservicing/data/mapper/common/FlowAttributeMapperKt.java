package com.paypal.oslo.feature.bnplservicing.data.mapper.common;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/FlowAttribute;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionFlowAttribute;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/type/BNPLAcquisitionFlowAttribute;", "toBNPLAcquisitionFlowAttribute", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/FlowAttribute;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionFlowAttribute;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FlowAttributeMapperKt {
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowAttribute toBNPLAcquisitionFlowAttribute(com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute flowAttribute) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowAttribute, "");
        int i = com.paypal.oslo.feature.bnplservicing.data.mapper.common.FlowAttributeMapperKt.WhenMappings.$EnumSwitchMapping$0[flowAttribute.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowAttribute.BRAND_PAYPAL;
        }
        if (i == 2) {
            return com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowAttribute.EXPERIENCE_LEGACY;
        }
        if (i == 3) {
            return com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowAttribute.USAGE_CHANNEL_CONTACTLESS_MOBILE_WALLET;
        }
        if (i == 4) {
            return com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowAttribute.USAGE_CHANNEL_EXTERNAL_ECOMMERCE;
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowAttribute.UNKNOWN__;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute.values().length];
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute.BRAND_PAYPAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute.EXPERIENCE_LEGACY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute.USAGE_CHANNEL_CONTACTLESS_MOBILE_WALLET.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute.USAGE_CHANNEL_EXTERNAL_ECOMMERCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.common.FlowAttribute.UNKNOWN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
