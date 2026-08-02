package com.paypal.oslo.feature.p2p.ui.review.mappers;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/mappers/PaymentLinkDisclosureMapper;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/Mapper;", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingOption;", "Lcom/paypal/oslo/feature/moneymovement/api/domain/SummaryDisclosureType;", "<init>", "()V", "input", "map", "(Lcom/paypal/oslo/feature/p2p/domain/model/FundingOption;)Lcom/paypal/oslo/feature/moneymovement/api/domain/SummaryDisclosureType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentLinkDisclosureMapper implements com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper<com.paypal.oslo.feature.p2p.domain.model.FundingOption, com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PaymentLinkDisclosureMapper() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper
    public final com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType map(com.paypal.oslo.feature.p2p.domain.model.FundingOption input) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.util.Iterator<T> it = input.getDisclosures().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (com.paypal.oslo.feature.p2p.domain.model.Disclosure.INSTANCE.getPAYMENT_LINK_TYPENAMES().contains(((com.paypal.oslo.feature.p2p.domain.model.Disclosure) obj).getType())) {
                break;
            }
        }
        com.paypal.oslo.feature.p2p.domain.model.Disclosure disclosure = (com.paypal.oslo.feature.p2p.domain.model.Disclosure) obj;
        if (disclosure == null) {
            return null;
        }
        java.lang.String type = disclosure.getType();
        switch (type.hashCode()) {
            case -1619758858:
                if (type.equals("PaymentLinkGenericWithTermDisclosure")) {
                    return com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType.PAYMENT_LINK_GENERIC_WITH_TERM;
                }
                return null;
            case -1236937741:
                if (type.equals("PaymentLinkAchDisclosure")) {
                    return com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType.PAYMENT_LINK_ACH;
                }
                return null;
            case 475242981:
                if (type.equals("PaymentLinkAchWithTermDisclosure")) {
                    return com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType.PAYMENT_LINK_WITH_TERM;
                }
                return null;
            case 1162560516:
                if (type.equals("PaymentLinkGenericDisclosure")) {
                    return com.paypal.oslo.feature.moneymovement.api.domain.SummaryDisclosureType.PAYMENT_LINK_GENERIC;
                }
                return null;
            default:
                return null;
        }
    }
}
