package com.paypal.oslo.feature.activity.ui.webview.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/webview/model/ActivityCommonSecureWebViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;", "activityComposeConfig", "Lcom/paypal/oslo/feature/activity/domain/usecase/common/ActivityWebViewUrlBuilder;", "activityWebViewUrlBuilder", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;Lcom/paypal/oslo/feature/activity/domain/usecase/common/ActivityWebViewUrlBuilder;)V", "Lcom/paypal/oslo/feature/activity/api/models/ActivityWebViewDto;", "getWebViewPayload$activity_prodRelease", "()Lcom/paypal/oslo/feature/activity/api/models/ActivityWebViewDto;", "", "getWebViewURL$activity_prodRelease", "()Ljava/lang/String;", "", "navigateToBack$activity_prodRelease", "()V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/activity/domain/usecase/common/ActivityWebViewUrlBuilder;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityCommonSecureWebViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.usecase.common.ActivityWebViewUrlBuilder getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public ActivityCommonSecureWebViewModel(com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig activityComposeConfig, com.paypal.oslo.feature.activity.domain.usecase.common.ActivityWebViewUrlBuilder activityWebViewUrlBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityComposeConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityWebViewUrlBuilder, "");
        this.getHighSpeedVideoFpsRanges = activityComposeConfig;
        this.getHighResolutionOutputSizeshNQ4ISI = activityWebViewUrlBuilder;
    }

    public final com.paypal.oslo.feature.activity.api.models.ActivityWebViewDto getWebViewPayload$activity_prodRelease() {
        java.util.List<androidx.navigation3.runtime.NavKey> backStack;
        com.paypal.oslo.core.navigation.AppNavigator navigator = this.getHighSpeedVideoFpsRanges.getNavigator();
        androidx.navigation3.runtime.NavKey navKey = (navigator == null || (backStack = navigator.getBackStack()) == null) ? null : (androidx.navigation3.runtime.NavKey) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) backStack);
        com.paypal.oslo.feature.activity.api.navigation.PayPalActivityCommonWebViewScreenDestinationKey payPalActivityCommonWebViewScreenDestinationKey = navKey instanceof com.paypal.oslo.feature.activity.api.navigation.PayPalActivityCommonWebViewScreenDestinationKey ? (com.paypal.oslo.feature.activity.api.navigation.PayPalActivityCommonWebViewScreenDestinationKey) navKey : null;
        if (payPalActivityCommonWebViewScreenDestinationKey != null) {
            return payPalActivityCommonWebViewScreenDestinationKey.getWebViewDataObject();
        }
        return null;
    }

    public final java.lang.String getWebViewURL$activity_prodRelease() {
        return this.getHighResolutionOutputSizeshNQ4ISI.build(getWebViewPayload$activity_prodRelease());
    }

    public final void navigateToBack$activity_prodRelease() {
        com.paypal.oslo.core.navigation.AppNavigator navigator = this.getHighSpeedVideoFpsRanges.getNavigator();
        if (navigator != null) {
            navigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.webview.model.ActivityCommonSecureWebViewModel$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.activity.ui.webview.model.ActivityCommonSecureWebViewModel.m11955$r8$lambda$2ebAvIGbIeqYz9NZ8hrpuwsmxI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
    }

    /* renamed from: $r8$lambda$2ebAvIGbIeqYz-9NZ8hrpuwsmxI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11955$r8$lambda$2ebAvIGbIeqYz9NZ8hrpuwsmxI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }
}
