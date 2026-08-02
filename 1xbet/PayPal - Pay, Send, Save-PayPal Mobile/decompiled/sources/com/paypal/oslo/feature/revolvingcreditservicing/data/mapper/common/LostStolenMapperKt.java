package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/LostStolenPageSummary;", "toLostStolenPageSummary", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/content/LostStolenPageSummary;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LostStolenMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.LostStolenPageSummary toLostStolenPageSummary(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment revolvingCreditServicingContentFragment) {
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.LostStolenPhoneNumber lostStolenPhoneNumber;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditServicingContentFragment, "");
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment.Card card = revolvingCreditServicingContentFragment.getCard();
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.content.LostStolenPageSummary(null, com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CustomerServiceContactMapperKt.toDomain((card == null || (lostStolenPhoneNumber = card.getLostStolenPhoneNumber()) == null) ? null : lostStolenPhoneNumber.getRevolvingCreditPhoneFragment()));
    }
}
