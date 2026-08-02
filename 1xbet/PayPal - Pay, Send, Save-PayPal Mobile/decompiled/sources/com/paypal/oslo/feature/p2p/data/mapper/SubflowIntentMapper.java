package com.paypal.oslo.feature.p2p.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/mapper/SubflowIntentMapper;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/Mapper;", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferIntent;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;", "<init>", "()V", "input", "map", "(Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferIntent;)Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SubflowIntentMapper implements com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper<com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public SubflowIntentMapper() {
    }

    @Override // com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper
    public final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent map(com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        int i = com.paypal.oslo.feature.p2p.data.mapper.SubflowIntentMapper.WhenMappings.$EnumSwitchMapping$0[input.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.SEND;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.REQUEST;
        }
        return com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.UNKNOWN;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent.SEND.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent.REQUEST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
