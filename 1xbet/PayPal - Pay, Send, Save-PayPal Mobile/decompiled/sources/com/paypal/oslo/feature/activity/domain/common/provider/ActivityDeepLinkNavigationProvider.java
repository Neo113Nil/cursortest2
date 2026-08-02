package com.paypal.oslo.feature.activity.domain.common.provider;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/provider/ActivityDeepLinkNavigationProvider;", "", "Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;", "activityComposeConfig", "Lcom/paypal/oslo/core/deeplink/DeeplinkResolver;", "deeplinkResolver", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;Lcom/paypal/oslo/core/deeplink/DeeplinkResolver;)V", "", "deepLinkURL", "", "handleDeepLink$activity_prodRelease", "(Ljava/lang/String;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/activity/domain/navigation/ActivityComposeConfig;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/deeplink/DeeplinkResolver;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityDeepLinkNavigationProvider {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.deeplink.DeeplinkResolver Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public ActivityDeepLinkNavigationProvider(com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig activityComposeConfig, com.paypal.oslo.core.deeplink.DeeplinkResolver deeplinkResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityComposeConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deeplinkResolver, "");
        this.getHighSpeedVideoFpsRangesFor = activityComposeConfig;
        this.Camera2StreamConfigurationMap = deeplinkResolver;
    }

    public final void handleDeepLink$activity_prodRelease(java.lang.String deepLinkURL) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deepLinkURL, "");
        android.net.Uri parse = android.net.Uri.parse(deepLinkURL);
        arrow.core.Either<com.paypal.oslo.core.deeplink.DeeplinkResolver.Error, androidx.navigation3.runtime.NavKey> resolve = this.Camera2StreamConfigurationMap.resolve(java.lang.String.valueOf(new android.net.Uri.Builder().encodedPath(parse.getEncodedPath()).encodedQuery(parse.getEncodedQuery()).encodedFragment(parse.getEncodedFragment()).build()));
        if (resolve instanceof arrow.core.Either.Right) {
            final androidx.navigation3.runtime.NavKey navKey = (androidx.navigation3.runtime.NavKey) ((arrow.core.Either.Right) resolve).getValue();
            com.paypal.oslo.core.navigation.AppNavigator navigator = this.getHighSpeedVideoFpsRangesFor.getNavigator();
            if (navigator != null) {
                navigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.domain.common.provider.ActivityDeepLinkNavigationProvider$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.activity.domain.common.provider.ActivityDeepLinkNavigationProvider.$r8$lambda$mRZaRlIKGHE3L66e5yj7aAquwA8(androidx.navigation3.runtime.NavKey.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                    }
                });
                return;
            }
            return;
        }
        if (resolve instanceof arrow.core.Either.Left) {
            com.paypal.oslo.core.deeplink.DeeplinkResolver.Error error = (com.paypal.oslo.core.deeplink.DeeplinkResolver.Error) ((arrow.core.Either.Left) resolve).getValue();
            if (error instanceof com.paypal.oslo.core.deeplink.DeeplinkResolver.Error.MalformedPath) {
                com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityActionsLogUtils.INSTANCE.logActivityDeepLinkActionInfo$activity_prodRelease(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_ACTIONS_DEEPLINK_EXECUTION_MALFORMED_ERROR, ((com.paypal.oslo.core.deeplink.DeeplinkResolver.Error.MalformedPath) error).getPath());
                return;
            } else {
                if (!(error instanceof com.paypal.oslo.core.deeplink.DeeplinkResolver.Error.UnrecognizedPath)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityActionsLogUtils.INSTANCE.logActivityDeepLinkActionInfo$activity_prodRelease(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_ACTIONS_DEEPLINK_EXECUTION_UNRECOGNIZED_ERROR, ((com.paypal.oslo.core.deeplink.DeeplinkResolver.Error.UnrecognizedPath) error).getPath());
                return;
            }
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mRZaRlIKGHE3L66e5yj7aAquwA8(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(navKey);
        return kotlin.Unit.INSTANCE;
    }
}
