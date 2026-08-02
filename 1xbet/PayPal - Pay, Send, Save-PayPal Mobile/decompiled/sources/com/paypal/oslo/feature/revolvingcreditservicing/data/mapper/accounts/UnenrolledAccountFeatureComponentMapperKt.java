package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingUnenrolledAccountFeatureComponentFragment;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/UnenrolledAccountFeaturesSnapshot;", "mapToUnenrolledAccountFeaturesSnapshot", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingUnenrolledAccountFeatureComponentFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/UnenrolledAccountFeaturesSnapshot;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UnenrolledAccountFeatureComponentMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.UnenrolledAccountFeaturesSnapshot mapToUnenrolledAccountFeaturesSnapshot(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingUnenrolledAccountFeatureComponentFragment revolvingCreditServicingUnenrolledAccountFeatureComponentFragment) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.EngagementAction engagementAction;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditServicingUnenrolledAccountFeatureComponentFragment, "");
        java.lang.String obj = revolvingCreditServicingUnenrolledAccountFeatureComponentFragment.getId().toString();
        java.lang.String title = revolvingCreditServicingUnenrolledAccountFeatureComponentFragment.getTitle();
        java.lang.String description = revolvingCreditServicingUnenrolledAccountFeatureComponentFragment.getDescription();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage domain = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CreditImageMapperKt.toDomain(revolvingCreditServicingUnenrolledAccountFeatureComponentFragment.getIcon().getRevolvingCreditImageFragment());
        java.lang.String obj2 = revolvingCreditServicingUnenrolledAccountFeatureComponentFragment.getPersonalizationTrackingId().toString();
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingUnenrolledAccountFeatureComponentFragment.Action action = revolvingCreditServicingUnenrolledAccountFeatureComponentFragment.getAction();
        if (action.getOnRevolvingCreditServicingNavigationAction() != null) {
            engagementAction = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.EngagementActionMapperKt.toEngagementAction(action.getOnRevolvingCreditServicingNavigationAction().getRevolvingCreditServicingNavigationActionFragment());
        } else {
            action.getOnRevolvingCreditServicingNativeAction();
            engagementAction = null;
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.UnenrolledAccountFeaturesSnapshot(obj, title, description, domain, obj2, engagementAction);
    }
}
