package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEngagementActionHandlerMiddleware;", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/utils/CreditMobileDeeplinkHandler;", "deeplinkHandler", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/utils/CreditMobileDeeplinkHandler;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;", "input", "", "invoke", "(Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/utils/CreditMobileDeeplinkHandler;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AccountSummaryEngagementActionHandlerMiddleware implements com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent> {

    @java.lang.Deprecated
    public static final java.lang.String CARD_SHIPPED_ACTION_NAME = "cardShipped";

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler Camera2StreamConfigurationMap;
    private static final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEngagementActionHandlerMiddleware.Companion Companion = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEngagementActionHandlerMiddleware.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public AccountSummaryEngagementActionHandlerMiddleware(com.paypal.oslo.feature.revolvingcreditservicing.utils.CreditMobileDeeplinkHandler creditMobileDeeplinkHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditMobileDeeplinkHandler, "");
        this.Camera2StreamConfigurationMap = creditMobileDeeplinkHandler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
    public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent> input) {
        androidx.navigation3.runtime.NavKey orNull;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState second = input.getStates().getSecond();
        if (second instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Ready) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent event = input.getEvent();
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPrioritizedAccountActionClicked) {
                java.lang.String actionName = ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPrioritizedAccountActionClicked) event).getActionName();
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.AccountEngagementOverview accountEngagementOverview = ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Ready) second).getAccountSummaryOverView().getAccountEngagementOverview();
                kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent, kotlin.Unit> eventDispatcher = input.getEventDispatcher();
                if (kotlin.jvm.internal.Intrinsics.areEqual(actionName, CARD_SHIPPED_ACTION_NAME)) {
                    eventDispatcher.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnCardActivationClicked.INSTANCE);
                    return;
                }
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.PrioritizedAccountAction accountActionByName = accountEngagementOverview != null ? accountEngagementOverview.getAccountActionByName(actionName) : null;
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.EngagementAction action = accountActionByName != null ? accountActionByName.getAction() : null;
                if (action instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.EngagementAction.Redirect) {
                    androidx.navigation3.runtime.NavKey orNull2 = this.Camera2StreamConfigurationMap.invoke(((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.EngagementAction.Redirect) action).getDeeplink()).getOrNull();
                    r3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent) (orNull2 != null ? new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnNavigateToPrioritizedAccountActionDestination(orNull2) : null);
                } else if (action instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.EngagementAction.Close) {
                    r3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent) new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnPrioritizedAccountActionDismissed(accountActionByName.getName());
                } else if (action != null) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (r3 != null) {
                    eventDispatcher.invoke(r3);
                    return;
                }
                return;
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnAccountFeatureClicked) {
                java.lang.String featureId = ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnAccountFeatureClicked) event).getFeatureId();
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.AccountEngagementOverview accountEngagementOverview2 = ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Ready) second).getAccountSummaryOverView().getAccountEngagementOverview();
                kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent, kotlin.Unit> eventDispatcher2 = input.getEventDispatcher();
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.UnenrolledAccountFeaturesSnapshot accountFeatureByName = accountEngagementOverview2 != null ? accountEngagementOverview2.getAccountFeatureByName(featureId) : null;
                r3 = accountFeatureByName != null ? accountFeatureByName.getAction() : null;
                if (!(r3 instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.EngagementAction.Redirect) || (orNull = this.Camera2StreamConfigurationMap.invoke(((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.EngagementAction.Redirect) r3).getDeeplink()).getOrNull()) == null) {
                    return;
                }
                eventDispatcher2.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnNavigateToAccountFeatureDestination(orNull));
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEngagementActionHandlerMiddleware$Companion;", "", "<init>", "()V", "", "CARD_SHIPPED_ACTION_NAME", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
