package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingNavigationActionFragment;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/EngagementAction;", "toEngagementAction", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingNavigationActionFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/engagement/EngagementAction;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EngagementActionMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.EngagementAction toEngagementAction(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingNavigationActionFragment revolvingCreditServicingNavigationActionFragment) {
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingMobileDeepLinkFragment revolvingCreditServicingMobileDeepLinkFragment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditServicingNavigationActionFragment, "");
        int i = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.EngagementActionMapperKt.WhenMappings.$EnumSwitchMapping$0[revolvingCreditServicingNavigationActionFragment.getNavigationType().ordinal()];
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.EngagementAction.Redirect redirect = null;
        if (i != 1) {
            if (i == 2) {
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.EngagementAction.Close.INSTANCE;
            }
            if (i == 3) {
                return null;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingNavigationActionFragment.MobileDeepLink mobileDeepLink = revolvingCreditServicingNavigationActionFragment.getMobileDeepLink();
        if (mobileDeepLink != null && (revolvingCreditServicingMobileDeepLinkFragment = mobileDeepLink.getRevolvingCreditServicingMobileDeepLinkFragment()) != null) {
            redirect = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.EngagementAction.Redirect(com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MobileDeeplinkMapperKt.toDomain(revolvingCreditServicingMobileDeepLinkFragment));
        }
        return redirect;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingNavigationActionType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingNavigationActionType.REDIRECT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingNavigationActionType.CLOSE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingNavigationActionType.UNKNOWN__.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
