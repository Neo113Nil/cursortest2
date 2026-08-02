package com.paypal.oslo.feature.p2p.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/mapper/SupportedDestinationMapper;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/Mapper;", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentDestinationsQuery$SupportedDestination;", "Lcom/paypal/oslo/feature/p2p/domain/model/CurrencyItem;", "<init>", "()V", "input", "map", "(Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentDestinationsQuery$SupportedDestination;)Lcom/paypal/oslo/feature/p2p/domain/model/CurrencyItem;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SupportedDestinationMapper implements com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper<com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.SupportedDestination, com.paypal.oslo.feature.p2p.domain.model.CurrencyItem> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public SupportedDestinationMapper() {
    }

    @Override // com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper
    public final com.paypal.oslo.feature.p2p.domain.model.CurrencyItem map(com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.SupportedDestination input) {
        com.paypal.oslo.feature.p2p.domain.model.PaymentProcessor paymentProcessor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.lang.String valueOf = java.lang.String.valueOf(input.getCountryCode());
        java.lang.String obj = input.getCurrencyCode().toString();
        java.lang.String obj2 = input.getCountryCode().toString();
        int i = com.paypal.oslo.feature.p2p.data.mapper.SupportedDestinationMapper.WhenMappings.$EnumSwitchMapping$0[input.getPaymentProcessor().ordinal()];
        if (i == 1) {
            paymentProcessor = com.paypal.oslo.feature.p2p.domain.model.PaymentProcessor.PAYPAL;
        } else if (i == 2) {
            paymentProcessor = com.paypal.oslo.feature.p2p.domain.model.PaymentProcessor.XOOM;
        } else {
            paymentProcessor = com.paypal.oslo.feature.p2p.domain.model.PaymentProcessor.UNKNOWN;
        }
        return new com.paypal.oslo.feature.p2p.domain.model.CurrencyItem(valueOf, obj, "", "0", "", "", obj2, paymentProcessor, false);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.PaymentProcessor.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PaymentProcessor.PAYPAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PaymentProcessor.XOOM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
