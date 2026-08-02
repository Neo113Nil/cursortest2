package com.paypal.oslo.feature.p2p.domain.common.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchNetworkType;", "toContactSearchNetworkType", "(Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;)Lcom/paypal/oslo/feature/contacts/api/ContactSearchNetworkType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ContactSearchNetworkTypeMapperKt {
    public static final com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType toContactSearchNetworkType(com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferIntent, "");
        if (com.paypal.oslo.feature.p2p.domain.common.mapper.ContactSearchNetworkTypeMapperKt.WhenMappings.$EnumSwitchMapping$0[paymentTransferIntent.ordinal()] == 1) {
            return com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType.REQUEST;
        }
        return com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType.SEND;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.values().length];
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.REQUEST.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
