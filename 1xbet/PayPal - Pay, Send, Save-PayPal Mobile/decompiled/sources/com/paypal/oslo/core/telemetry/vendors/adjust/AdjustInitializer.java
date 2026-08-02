package com.paypal.oslo.core.telemetry.vendors.adjust;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0001\u0018\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/adjust/AdjustInitializer;", "Landroidx/startup/Initializer;", "", "<init>", "()V", "Landroid/content/Context;", "context", "create", "(Landroid/content/Context;)V", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdjustInitializer implements androidx.startup.Initializer<kotlin.Unit> {
    public static final int $stable = 0;

    @Override // androidx.startup.Initializer
    public final /* bridge */ /* synthetic */ kotlin.Unit create(android.content.Context context) {
        create2(context);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: create, reason: avoid collision after fix types in other method */
    public final void create2(android.content.Context context) {
        com.adjust.sdk.AdjustConfig adjustConfig;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (com.paypal.oslo.core.telemetry.util.AndroidContextExtensionsKt.isRunningFromTestProcess(context)) {
            return;
        }
        java.lang.Object obj = dagger.hilt.android.EarlyEntryPoints.get(context, com.paypal.oslo.core.telemetry.di.TelemetryEntryPoint.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        com.paypal.oslo.core.telemetry.di.TelemetryEntryPoint telemetryEntryPoint = (com.paypal.oslo.core.telemetry.di.TelemetryEntryPoint) obj;
        com.paypal.oslo.core.userstore.UserStore userStore = telemetryEntryPoint.userStore();
        kotlinx.coroutines.CoroutineScope ioApplicationScope = telemetryEntryPoint.ioApplicationScope();
        com.paypal.oslo.core.telemetry.vendors.adjust.AdjustThirdPartySharingManager adjustThirdPartySharingManager = telemetryEntryPoint.adjustThirdPartySharingManager();
        if (com.paypal.oslo.core.telemetry.util.AndroidContextExtensionsKt.isDebugBuildType(context)) {
            adjustConfig = new com.adjust.sdk.AdjustConfig(context, com.paypal.oslo.core.telemetry.BuildConfig.ADJUST_APP_TOKEN, com.adjust.sdk.AdjustConfig.ENVIRONMENT_SANDBOX);
            adjustConfig.setLogLevel(com.adjust.sdk.LogLevel.VERBOSE);
        } else {
            adjustConfig = new com.adjust.sdk.AdjustConfig(context, com.paypal.oslo.core.telemetry.BuildConfig.ADJUST_APP_TOKEN, com.adjust.sdk.AdjustConfig.ENVIRONMENT_PRODUCTION);
            adjustConfig.setLogLevel(com.adjust.sdk.LogLevel.INFO);
        }
        com.paypal.oslo.core.telemetry.vendors.adjust.AdjustEventTrackingListener adjustEventTrackingListener = new com.paypal.oslo.core.telemetry.vendors.adjust.AdjustEventTrackingListener();
        adjustConfig.setOnEventTrackingSucceededListener(adjustEventTrackingListener);
        adjustConfig.setOnEventTrackingFailedListener(adjustEventTrackingListener);
        adjustConfig.setOnDeferredDeeplinkResponseListener(new com.paypal.oslo.core.telemetry.vendors.adjust.AdjustDeferredDeepLinkResponseListener());
        com.adjust.sdk.Adjust.initSdk(adjustConfig);
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(userStore.getUserState(), new com.paypal.oslo.core.telemetry.vendors.adjust.AdjustInitializer$create$1(adjustThirdPartySharingManager, this, null)), ioApplicationScope);
    }

    @Override // androidx.startup.Initializer
    public final java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> dependencies() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    public static final /* synthetic */ void access$fireAdjustEvent(com.paypal.oslo.core.telemetry.vendors.adjust.AdjustInitializer adjustInitializer, com.paypal.oslo.core.userstore.model.UserState userState) {
        if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.LoggedIn) {
            com.paypal.oslo.core.telemetry.AnalyticsTrackerKt.analyticsTracker.track(new com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent(com.paypal.oslo.core.telemetry.analytics.event.EventType.Appeared, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.AdjustContext(com.paypal.oslo.core.telemetry.vendors.adjust.AdjustEventToken.USER_SIGNED_IN))));
        }
    }
}
