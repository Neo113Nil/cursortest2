package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingPrioritizedAccountActionFragment;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/PrioritizedAccountAction;", "toDomain", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingPrioritizedAccountActionFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/PrioritizedAccountAction;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PrioritizedAccountActionMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.PrioritizedAccountAction toDomain(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingPrioritizedAccountActionFragment revolvingCreditServicingPrioritizedAccountActionFragment) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.EngagementAction engagementAction = null;
        if (revolvingCreditServicingPrioritizedAccountActionFragment == null) {
            return null;
        }
        java.lang.String obj = revolvingCreditServicingPrioritizedAccountActionFragment.getId().toString();
        java.lang.String title = revolvingCreditServicingPrioritizedAccountActionFragment.getTitle();
        java.lang.String valueOf = java.lang.String.valueOf(revolvingCreditServicingPrioritizedAccountActionFragment.getDescription());
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage domain = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CreditImageMapperKt.toDomain(revolvingCreditServicingPrioritizedAccountActionFragment.getIcon().getRevolvingCreditImageFragment());
        java.lang.String obj2 = revolvingCreditServicingPrioritizedAccountActionFragment.getPersonalizationTrackingId().toString();
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingPrioritizedAccountActionFragment.Action action = revolvingCreditServicingPrioritizedAccountActionFragment.getAction();
        if (action.getOnRevolvingCreditServicingNavigationAction() != null) {
            engagementAction = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.EngagementActionMapperKt.toEngagementAction(action.getOnRevolvingCreditServicingNavigationAction().getRevolvingCreditServicingNavigationActionFragment());
        } else {
            action.getOnRevolvingCreditServicingNativeAction();
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.PrioritizedAccountAction(obj, title, valueOf, domain, obj2, engagementAction, revolvingCreditServicingPrioritizedAccountActionFragment.getDismissible());
    }
}
