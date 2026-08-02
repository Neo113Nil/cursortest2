package com.paypal.oslo.feature.p2p.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/mapper/PostTransferDisclosureMapper;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/Mapper;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragment;", "Lcom/paypal/oslo/feature/p2p/domain/model/Disclosure;", "<init>", "()V", "input", "map", "(Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragment;)Lcom/paypal/oslo/feature/p2p/domain/model/Disclosure;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PostTransferDisclosureMapper implements com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper<com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment, com.paypal.oslo.feature.p2p.domain.model.Disclosure> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PostTransferDisclosureMapper() {
    }

    @Override // com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper
    public final com.paypal.oslo.feature.p2p.domain.model.Disclosure map(com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment input) {
        int intValue;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnPaymentLinkDisclosure onPaymentLinkDisclosure = input.getOnPaymentLinkDisclosure();
        if (onPaymentLinkDisclosure != null) {
            return new com.paypal.oslo.feature.p2p.domain.model.Disclosure(input.get__typename(), onPaymentLinkDisclosure.getPriority(), null, null, onPaymentLinkDisclosure.getExpiryTime().toString(), null, null, null, null, 492, null);
        }
        com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnReceiverSignupDisclosure onReceiverSignupDisclosure = input.getOnReceiverSignupDisclosure();
        if (onReceiverSignupDisclosure != null) {
            intValue = onReceiverSignupDisclosure.getPriority();
        } else {
            com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnRegulatoryReviewDisclosure onRegulatoryReviewDisclosure = input.getOnRegulatoryReviewDisclosure();
            if (onRegulatoryReviewDisclosure != null) {
                intValue = onRegulatoryReviewDisclosure.getPriority();
            } else {
                com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnPostTransferPaymentHoldDisclosure onPostTransferPaymentHoldDisclosure = input.getOnPostTransferPaymentHoldDisclosure();
                java.lang.Integer valueOf = onPostTransferPaymentHoldDisclosure != null ? java.lang.Integer.valueOf(onPostTransferPaymentHoldDisclosure.getPriority()) : null;
                if (valueOf == null) {
                    com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnReceiverPreferenceDisclosure onReceiverPreferenceDisclosure = input.getOnReceiverPreferenceDisclosure();
                    valueOf = onReceiverPreferenceDisclosure != null ? java.lang.Integer.valueOf(onReceiverPreferenceDisclosure.getPriority()) : null;
                    if (valueOf == null) {
                        com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnInstantPaymentProcessedDisclosure onInstantPaymentProcessedDisclosure = input.getOnInstantPaymentProcessedDisclosure();
                        java.lang.Integer valueOf2 = onInstantPaymentProcessedDisclosure != null ? java.lang.Integer.valueOf(onInstantPaymentProcessedDisclosure.getPriority()) : null;
                        intValue = valueOf2 != null ? valueOf2.intValue() : 0;
                    }
                }
                intValue = valueOf.intValue();
            }
        }
        return new com.paypal.oslo.feature.p2p.domain.model.Disclosure(input.get__typename(), intValue, null, null, null, null, null, null, null, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT, null);
    }
}
