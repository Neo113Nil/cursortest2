package com.paypal.oslo.feature.p2p.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/mapper/SubflowTransferTypeMapper;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/Mapper;", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferType;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTxType;", "<init>", "()V", "input", "map", "(Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferType;)Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTxType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SubflowTransferTypeMapper implements com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper<com.paypal.oslo.api.graphql.schema.type.PaymentTransferType, com.paypal.oslo.feature.p2p.domain.model.PaymentTxType> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public SubflowTransferTypeMapper() {
    }

    @Override // com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper
    public final com.paypal.oslo.feature.p2p.domain.model.PaymentTxType map(com.paypal.oslo.api.graphql.schema.type.PaymentTransferType input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        int i = com.paypal.oslo.feature.p2p.data.mapper.SubflowTransferTypeMapper.WhenMappings.$EnumSwitchMapping$0[input.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.p2p.domain.model.PaymentTxType.PERSONAL;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.p2p.domain.model.PaymentTxType.PURCHASE;
        }
        return com.paypal.oslo.feature.p2p.domain.model.PaymentTxType.UNKNOWN;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.PaymentTransferType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PaymentTransferType.PERSONAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PaymentTransferType.PURCHASE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
