package com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionAnalyticsMiddlewareDelegate;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/core/MiddlewareDelegate;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionEvent;", "<init>", "()V", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.OLD_STATE_KEY, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_STATE_KEY, "event", "Lkotlin/Function1;", "", "eventDispatcher", "onReducerOutput", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState;Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionState;Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/ui/mvi/CategorySelectionEvent;Lkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CategorySelectionAnalyticsMiddlewareDelegate extends com.paypal.oslo.feature.shoppingrewards.shared.ui.core.MiddlewareDelegate<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent> {
    public static final int $stable = 0;

    @Override // com.paypal.oslo.feature.shoppingrewards.shared.ui.core.MiddlewareDelegate
    public final void onReducerOutput(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState oldState, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState newState, com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent event, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent, kotlin.Unit> eventDispatcher) {
        java.lang.Object obj;
        java.lang.Object obj2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oldState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventDispatcher, "");
        if ((event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnLoad) || (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnLoadSingleCategory) || (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnLoadSuccess) || (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnLoadSingleCategorySuccess)) {
            return;
        }
        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnLoadError) {
            com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnLoadError onLoadError = (com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnLoadError) event;
            com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsErrorAnalytics.INSTANCE.createErrorShownEvent(com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Ppdc.CATEGORY_SELECTION_SCREEN, com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Ppdc.FEATURE, "load", onLoadError.getErrorType(), onLoadError.getMessage()).track(com.paypal.oslo.feature.shoppingrewards.AnalyticsTrackerKt.analyticsTracker);
            return;
        }
        if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnRetry) {
            return;
        }
        java.lang.String str = null;
        if (!(event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnContinue)) {
            if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnToggleCategorySelection) {
                com.paypal.oslo.feature.shoppingrewards.shared.ui.core.Logger.logV$default(com.paypal.oslo.feature.shoppingrewards.shared.ui.core.Logger.INSTANCE, "ANALYTICS: Category toggled", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("categoryId", ((com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnToggleCategorySelection) event).getCategoryId())), null, 4, null);
                return;
            }
            if ((event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnDismiss) || (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnConfirm)) {
                return;
            }
            if (!(event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnConfirmSuccess)) {
                if (event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnConfirmError) {
                    com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsErrorAnalytics.INSTANCE.createErrorShownEvent(com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Ppdc.CATEGORY_SELECTION_SCREEN, com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Ppdc.FEATURE, "confirm", com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType.GenericError, ((com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnConfirmError) event).getMessage()).track(com.paypal.oslo.feature.shoppingrewards.AnalyticsTrackerKt.analyticsTracker);
                    return;
                } else {
                    if (!(event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnSelectionTermsClick) && !(event instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnConfirmationTermsClick)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    return;
                }
            }
            if (newState instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadyConfirmation) {
                java.util.Iterator<T> it = ((com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.ReadyConfirmation) newState).getCategorySelectionUiData().getCategories().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.ShoppingCategory) obj).isSelected()) {
                            break;
                        }
                    }
                }
                com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.ShoppingCategory shoppingCategory = (com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.ShoppingCategory) obj;
                if (shoppingCategory != null) {
                    str = shoppingCategory.getName();
                }
            }
            if (str != null) {
                com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.CategorySelectionAnalytics.INSTANCE.createConfirmationScreenShownEvent(str).track(com.paypal.oslo.feature.shoppingrewards.AnalyticsTrackerKt.analyticsTracker);
                return;
            }
            return;
        }
        if (newState instanceof com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Confirming) {
            java.util.Iterator<T> it2 = ((com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionState.Confirming) newState).getCategorySelectionUiData().getCategories().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it2.next();
                    if (((com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.ShoppingCategory) obj2).isSelected()) {
                        break;
                    }
                }
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.ShoppingCategory shoppingCategory2 = (com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.models.ShoppingCategory) obj2;
            if (shoppingCategory2 != null) {
                str = shoppingCategory2.getName();
            }
        }
        if (str != null) {
            com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.CategorySelectionAnalytics.INSTANCE.createConfirmCategoryEvent(str).track(com.paypal.oslo.feature.shoppingrewards.AnalyticsTrackerKt.analyticsTracker);
        }
    }
}
