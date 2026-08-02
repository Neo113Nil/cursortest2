package com.paypal.oslo.feature.notificationcenter.domain.provider;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/domain/provider/NotificationCenterDeeplinkHandler;", "", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/core/deeplink/DeeplinkResolver;", "deeplinkResolver", "Lcom/paypal/oslo/feature/notificationcenter/api/deeplink/DeeplinkValidator;", "deeplinkValidator", "Lcom/paypal/oslo/core/pushnotification/deeplink/OpenWebDeeplinkNormalizer;", "openWebDeeplinkNormalizer", "<init>", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/core/deeplink/DeeplinkResolver;Lcom/paypal/oslo/feature/notificationcenter/api/deeplink/DeeplinkValidator;Lcom/paypal/oslo/core/pushnotification/deeplink/OpenWebDeeplinkNormalizer;)V", "Lcom/paypal/oslo/feature/notificationcenter/domain/model/Notification;", "notification", "", "handleDeepLink$notification_center_prodRelease", "(Lcom/paypal/oslo/feature/notificationcenter/domain/model/Notification;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/deeplink/DeeplinkResolver;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/notificationcenter/api/deeplink/DeeplinkValidator;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/pushnotification/deeplink/OpenWebDeeplinkNormalizer;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NotificationCenterDeeplinkHandler {

    @java.lang.Deprecated
    public static final java.lang.String UNRESOLVABLE_DEEPLINK_MESSAGE = "Notification center click has unresolvable deeplink";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.pushnotification.deeplink.OpenWebDeeplinkNormalizer getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    private final com.paypal.oslo.core.deeplink.DeeplinkResolver getHighSpeedVideoSizes;
    private static final com.paypal.oslo.feature.notificationcenter.domain.provider.NotificationCenterDeeplinkHandler.Companion Companion = new com.paypal.oslo.feature.notificationcenter.domain.provider.NotificationCenterDeeplinkHandler.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public NotificationCenterDeeplinkHandler(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.deeplink.DeeplinkResolver deeplinkResolver, com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator deeplinkValidator, com.paypal.oslo.core.pushnotification.deeplink.OpenWebDeeplinkNormalizer openWebDeeplinkNormalizer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deeplinkResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deeplinkValidator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openWebDeeplinkNormalizer, "");
        this.Camera2StreamConfigurationMap = appNavigator;
        this.getHighSpeedVideoSizes = deeplinkResolver;
        this.getHighResolutionOutputSizeshNQ4ISI = deeplinkValidator;
        this.getHighSpeedVideoFpsRanges = openWebDeeplinkNormalizer;
    }

    public final void handleDeepLink$notification_center_prodRelease(com.paypal.oslo.feature.notificationcenter.domain.model.Notification notification) {
        kotlin.Pair pair;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notification, "");
        java.lang.String normalize = this.getHighSpeedVideoFpsRanges.normalize(notification.getDeepLink(), com.paypal.oslo.core.pushnotification.deeplink.OpenWebSource.NOTIFICATION_CENTER);
        kotlin.Pair pair2 = kotlin.TuplesKt.to(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_NOTIFICATION_ID, notification.getId());
        kotlin.Pair pair3 = kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, notification.getInstanceId());
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(pair2, pair3, kotlin.TuplesKt.to("campaign_id", notification.getCampaignId()), kotlin.TuplesKt.to("deeplink_path", notification.getDeepLink()), kotlin.TuplesKt.to("deeplink_scheme", com.paypal.oslo.core.pushnotification.deeplink.DeeplinkPathExtractorKt.classifyDeeplinkScheme(notification.getDeepLink())));
        arrow.core.Either<com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationError, com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationResult> validate = this.getHighResolutionOutputSizeshNQ4ISI.validate(normalize);
        boolean isLeft = validate.isLeft();
        java.lang.String str = com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Error.INVALID_DEEPLINK;
        if (isLeft) {
            com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationError validationError = (com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationError) ((arrow.core.Either.Left) validate).getValue();
            if (validationError instanceof com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationError.MalformedUrl) {
                com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsTracker.INSTANCE.trackDeeplinkNavigationFailed(notification, com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Error.INVALID_DEEPLINK);
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.notificationcenter.LoggerKt.log, UNRESOLVABLE_DEEPLINK_MESSAGE, kotlin.collections.MapsKt.plus(mapOf, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deeplink_error", "malformed_url"), kotlin.TuplesKt.to("error_detail", ((com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationError.MalformedUrl) validationError).getReason()))), null, 4, null);
            } else {
                if (!(validationError instanceof com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationError.UnsupportedScheme)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsTracker.INSTANCE.trackDeeplinkNavigationFailed(notification, com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Error.UNSUPPORTED_SCHEME);
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.notificationcenter.LoggerKt.log, UNRESOLVABLE_DEEPLINK_MESSAGE, kotlin.collections.MapsKt.plus(mapOf, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deeplink_error", com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Error.UNSUPPORTED_SCHEME))), null, 4, null);
            }
            this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.notificationcenter.domain.provider.NotificationCenterDeeplinkHandler$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.notificationcenter.domain.provider.NotificationCenterDeeplinkHandler.$r8$lambda$l6f66IAvUVJDi86hj7k5eAxP5ZU((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
        if (validate.isRight()) {
            com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationResult validationResult = (com.paypal.oslo.feature.notificationcenter.api.deeplink.DeeplinkValidator.ValidationResult) ((arrow.core.Either.Right) validate).getValue();
            arrow.core.Either<com.paypal.oslo.core.deeplink.DeeplinkResolver.Error, androidx.navigation3.runtime.NavKey> resolve = this.getHighSpeedVideoSizes.resolve(validationResult.getPathWithQuery());
            if (resolve.isRight()) {
                final androidx.navigation3.runtime.NavKey navKey = (androidx.navigation3.runtime.NavKey) ((arrow.core.Either.Right) resolve).getValue();
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.notificationcenter.LoggerKt.log, "Notification center click handled", kotlin.collections.MapsKt.plus(mapOf, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("has_deeplink", bool), kotlin.TuplesKt.to("deeplink_resolved", bool), kotlin.TuplesKt.to("extracted_path", validationResult.getPathWithQuery()))), null, 4, null);
                this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.notificationcenter.domain.provider.NotificationCenterDeeplinkHandler$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.notificationcenter.domain.provider.NotificationCenterDeeplinkHandler.$r8$lambda$yXA_xblHge_1tu2htpcdkXmSTnY(androidx.navigation3.runtime.NavKey.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                    }
                });
            }
            if (resolve.isLeft()) {
                com.paypal.oslo.core.deeplink.DeeplinkResolver.Error error = (com.paypal.oslo.core.deeplink.DeeplinkResolver.Error) ((arrow.core.Either.Left) resolve).getValue();
                boolean z = error instanceof com.paypal.oslo.core.deeplink.DeeplinkResolver.Error.MalformedPath;
                if (z) {
                    pair = kotlin.TuplesKt.to("malformed_path", ((com.paypal.oslo.core.deeplink.DeeplinkResolver.Error.MalformedPath) error).getPath());
                } else {
                    if (!(error instanceof com.paypal.oslo.core.deeplink.DeeplinkResolver.Error.UnrecognizedPath)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    pair = kotlin.TuplesKt.to("unrecognized_path", ((com.paypal.oslo.core.deeplink.DeeplinkResolver.Error.UnrecognizedPath) error).getPath());
                }
                java.lang.String str2 = (java.lang.String) pair.component1();
                java.lang.String str3 = (java.lang.String) pair.component2();
                if (!z) {
                    if (!(error instanceof com.paypal.oslo.core.deeplink.DeeplinkResolver.Error.UnrecognizedPath)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    str = com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Error.UNREGISTERED_DEEPLINK;
                }
                com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsTracker.INSTANCE.trackDeeplinkNavigationFailed(notification, str);
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.notificationcenter.LoggerKt.log, UNRESOLVABLE_DEEPLINK_MESSAGE, kotlin.collections.MapsKt.plus(mapOf, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deeplink_error", str2), kotlin.TuplesKt.to("extracted_path", str3))), null, 4, null);
                this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.notificationcenter.domain.provider.NotificationCenterDeeplinkHandler$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.notificationcenter.domain.provider.NotificationCenterDeeplinkHandler.$r8$lambda$l6f66IAvUVJDi86hj7k5eAxP5ZU((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                    }
                });
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/domain/provider/NotificationCenterDeeplinkHandler$Companion;", "", "<init>", "()V", "", "UNRESOLVABLE_DEEPLINK_MESSAGE", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$l6f66IAvUVJDi86hj7k5eAxP5ZU(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.home.api.navigation.HomeDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yXA_xblHge_1tu2htpcdkXmSTnY(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(navKey);
        return kotlin.Unit.INSTANCE;
    }
}
