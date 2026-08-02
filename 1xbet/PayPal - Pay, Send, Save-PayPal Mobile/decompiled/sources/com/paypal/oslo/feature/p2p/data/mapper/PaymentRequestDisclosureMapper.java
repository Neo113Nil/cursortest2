package com.paypal.oslo.feature.p2p.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/mapper/PaymentRequestDisclosureMapper;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/Mapper;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentRequestDisclosureFragment;", "Lcom/paypal/oslo/feature/p2p/domain/model/Disclosure;", "<init>", "()V", "input", "map", "(Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentRequestDisclosureFragment;)Lcom/paypal/oslo/feature/p2p/domain/model/Disclosure;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentRequestDisclosureMapper implements com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper<com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragment, com.paypal.oslo.feature.p2p.domain.model.Disclosure> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PaymentRequestDisclosureMapper() {
    }

    @Override // com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper
    public final com.paypal.oslo.feature.p2p.domain.model.Disclosure map(com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragment input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragment.OnPaymentLinkDisclosure onPaymentLinkDisclosure = input.getOnPaymentLinkDisclosure();
        if (onPaymentLinkDisclosure == null) {
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragment.OnPaymentLinkSecurityWarningDisclosure onPaymentLinkSecurityWarningDisclosure = input.getOnPaymentLinkSecurityWarningDisclosure();
            if (onPaymentLinkSecurityWarningDisclosure == null) {
                return new com.paypal.oslo.feature.p2p.domain.model.Disclosure(input.get__typename(), 0, null, null, null, null, null, null, null, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT, null);
            }
            return new com.paypal.oslo.feature.p2p.domain.model.Disclosure(input.get__typename(), onPaymentLinkSecurityWarningDisclosure.getPriority(), null, null, onPaymentLinkSecurityWarningDisclosure.getExpiryTime().toString(), onPaymentLinkSecurityWarningDisclosure.getEmail().toString(), onPaymentLinkSecurityWarningDisclosure.getScamUrl().toString(), null, null, 396, null);
        }
        return new com.paypal.oslo.feature.p2p.domain.model.Disclosure(input.get__typename(), onPaymentLinkDisclosure.getPriority(), null, null, onPaymentLinkDisclosure.getExpiryTime().toString(), null, null, null, null, 492, null);
    }
}
