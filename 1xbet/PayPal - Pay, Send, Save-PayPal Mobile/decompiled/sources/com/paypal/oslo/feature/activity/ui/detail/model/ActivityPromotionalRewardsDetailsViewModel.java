package com.paypal.oslo.feature.activity.ui.detail.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/detail/model/ActivityPromotionalRewardsDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;", "activityComposeConfig", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;)V", "Lcom/paypal/oslo/feature/activity/api/navigation/ActivityPromotionalRewardsDetailsDestinationKey;", "getDestinationKey$activity_prodRelease", "()Lcom/paypal/oslo/feature/activity/api/navigation/ActivityPromotionalRewardsDetailsDestinationKey;", "", "onBackClick$activity_prodRelease", "()V", "onViewRewardsClick$activity_prodRelease", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityPromotionalRewardsDetailsViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig getHighSpeedVideoSizes;

    @javax.inject.Inject
    public ActivityPromotionalRewardsDetailsViewModel(com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig activityComposeConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityComposeConfig, "");
        this.getHighSpeedVideoSizes = activityComposeConfig;
    }

    public final com.paypal.oslo.feature.activity.api.navigation.ActivityPromotionalRewardsDetailsDestinationKey getDestinationKey$activity_prodRelease() {
        java.util.List<androidx.navigation3.runtime.NavKey> backStack;
        com.paypal.oslo.core.navigation.AppNavigator navigator = this.getHighSpeedVideoSizes.getNavigator();
        androidx.navigation3.runtime.NavKey navKey = (navigator == null || (backStack = navigator.getBackStack()) == null) ? null : (androidx.navigation3.runtime.NavKey) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) backStack);
        if (navKey instanceof com.paypal.oslo.feature.activity.api.navigation.ActivityPromotionalRewardsDetailsDestinationKey) {
            return (com.paypal.oslo.feature.activity.api.navigation.ActivityPromotionalRewardsDetailsDestinationKey) navKey;
        }
        return null;
    }

    public final void onBackClick$activity_prodRelease() {
        com.paypal.oslo.core.navigation.AppNavigator navigator = this.getHighSpeedVideoSizes.getNavigator();
        if (navigator != null) {
            navigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.detail.model.ActivityPromotionalRewardsDetailsViewModel$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.activity.ui.detail.model.ActivityPromotionalRewardsDetailsViewModel.$r8$lambda$QYkoqqeF4TZ8ZNZPPDxtNRETDP4((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
    }

    public final void onViewRewardsClick$activity_prodRelease() {
        com.paypal.oslo.core.navigation.AppNavigator navigator = this.getHighSpeedVideoSizes.getNavigator();
        if (navigator != null) {
            navigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.detail.model.ActivityPromotionalRewardsDetailsViewModel$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.activity.ui.detail.model.ActivityPromotionalRewardsDetailsViewModel.$r8$lambda$2EKCLVibI6VZPqBTAeVbQcl6ZrQ((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$2EKCLVibI6VZPqBTAeVbQcl6ZrQ(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.pushIfNotCurrent(new com.paypal.oslo.feature.shoppingrewards.api.rewards.summary.navigation.RewardsSummaryActivityDestination((java.lang.String) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QYkoqqeF4TZ8ZNZPPDxtNRETDP4(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }
}
