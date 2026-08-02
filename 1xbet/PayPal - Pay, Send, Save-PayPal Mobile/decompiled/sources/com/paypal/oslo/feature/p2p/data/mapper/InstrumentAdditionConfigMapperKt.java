package com.paypal.oslo.feature.p2p.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/InstrumentAdditionConfigStatus;", "Lcom/paypal/oslo/feature/p2p/domain/model/InstrumentAdditionConfigStatus;", "toDomainStatus", "(Lcom/paypal/oslo/api/graphql/schema/type/InstrumentAdditionConfigStatus;)Lcom/paypal/oslo/feature/p2p/domain/model/InstrumentAdditionConfigStatus;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InstrumentAdditionConfigMapperKt {
    public static final com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfigStatus toDomainStatus(com.paypal.oslo.api.graphql.schema.type.InstrumentAdditionConfigStatus instrumentAdditionConfigStatus) {
        int i = instrumentAdditionConfigStatus == null ? -1 : com.paypal.oslo.feature.p2p.data.mapper.InstrumentAdditionConfigMapperKt.WhenMappings.$EnumSwitchMapping$0[instrumentAdditionConfigStatus.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfigStatus.MANDATORY;
            }
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        return com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfigStatus.UNKNOWN;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.InstrumentAdditionConfigStatus.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.InstrumentAdditionConfigStatus.MANDATORY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.InstrumentAdditionConfigStatus.UNKNOWN__.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
