package com.paypal.oslo.feature.activity.ui.detail.model;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00130\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010&\u001a\b\u0012\u0004\u0012\u00020\u00130%8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/detail/model/ActivityDetailBaseViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;", "activityComposeConfig", "Lcom/paypal/oslo/feature/activity/ui/detail/utils/PhoneNumberFormatter;", "phoneNumberFormatter", "Lcom/paypal/oslo/feature/activity/domain/usecase/detail/ActivityDetailActionsUseCase;", "activityDetailActionsUseCase", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;Lcom/paypal/oslo/feature/activity/ui/detail/utils/PhoneNumberFormatter;Lcom/paypal/oslo/feature/activity/domain/usecase/detail/ActivityDetailActionsUseCase;)V", "getActivityComposeConfig$activity_prodRelease", "()Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;", "getPhoneNumberFormatter$activity_prodRelease", "()Lcom/paypal/oslo/feature/activity/ui/detail/utils/PhoneNumberFormatter;", "Landroidx/navigation3/runtime/NavKey;", "navKey", "", "navigateToNavKey$activity_prodRelease", "(Landroidx/navigation3/runtime/NavKey;)V", "", "requiresLedgerRefresh", "setNeedsLedgerRefresh$activity_prodRelease", "(Z)V", "", "deepLinkURL", "handleDeepLink$activity_prodRelease", "(Ljava/lang/String;)V", "Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;", "getActivityComposeConfig", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/activity/ui/detail/utils/PhoneNumberFormatter;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/activity/domain/usecase/detail/ActivityDetailActionsUseCase;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "needsLedgerRefresh", "Lkotlinx/coroutines/flow/StateFlow;", "getNeedsLedgerRefresh$activity_prodRelease", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public class ActivityDetailBaseViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.usecase.detail.ActivityDetailActionsUseCase getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig activityComposeConfig;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.ui.detail.utils.PhoneNumberFormatter getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> needsLedgerRefresh;

    public ActivityDetailBaseViewModel(com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig activityComposeConfig, com.paypal.oslo.feature.activity.ui.detail.utils.PhoneNumberFormatter phoneNumberFormatter, com.paypal.oslo.feature.activity.domain.usecase.detail.ActivityDetailActionsUseCase activityDetailActionsUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityComposeConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumberFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailActionsUseCase, "");
        this.activityComposeConfig = activityComposeConfig;
        this.getHighResolutionOutputSizeshNQ4ISI = phoneNumberFormatter;
        this.getHighSpeedVideoFpsRanges = activityDetailActionsUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow;
        this.needsLedgerRefresh = MutableStateFlow;
    }

    protected final com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig getActivityComposeConfig() {
        return this.activityComposeConfig;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getNeedsLedgerRefresh$activity_prodRelease() {
        return this.needsLedgerRefresh;
    }

    public final com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig getActivityComposeConfig$activity_prodRelease() {
        return this.activityComposeConfig;
    }

    /* renamed from: getPhoneNumberFormatter$activity_prodRelease, reason: from getter */
    public final com.paypal.oslo.feature.activity.ui.detail.utils.PhoneNumberFormatter getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final void navigateToNavKey$activity_prodRelease(final androidx.navigation3.runtime.NavKey navKey) {
        com.paypal.oslo.core.navigation.AppNavigator navigator;
        if (navKey == null || (navigator = this.activityComposeConfig.getNavigator()) == null) {
            return;
        }
        navigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.detail.model.ActivityDetailBaseViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.activity.ui.detail.model.ActivityDetailBaseViewModel.m11807$r8$lambda$QWlb4TCb7chOt6Q08i95kY6KpI(androidx.navigation3.runtime.NavKey.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public final void setNeedsLedgerRefresh$activity_prodRelease(boolean requiresLedgerRefresh) {
        this.getHighSpeedVideoFpsRangesFor.setValue(java.lang.Boolean.valueOf(requiresLedgerRefresh));
    }

    public final void handleDeepLink$activity_prodRelease(java.lang.String deepLinkURL) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deepLinkURL, "");
        this.getHighSpeedVideoFpsRanges.invokeDeepLink$activity_prodRelease(deepLinkURL);
    }

    /* renamed from: $r8$lambda$QWlb4TCb7chOt6Q08i95k-Y6KpI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11807$r8$lambda$QWlb4TCb7chOt6Q08i95kY6KpI(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(navKey);
        return kotlin.Unit.INSTANCE;
    }
}
