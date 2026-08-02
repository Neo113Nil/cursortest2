package com.paypal.oslo.core.telemetry.vendors.datadog;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/datadog/DatadogInitializer;", "Landroidx/startup/Initializer;", "", "<init>", "()V", "Landroid/content/Context;", "context", "create", "(Landroid/content/Context;)V", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DatadogInitializer implements androidx.startup.Initializer<kotlin.Unit> {
    public static final int $stable = 0;
    private static final com.paypal.oslo.core.telemetry.vendors.datadog.DatadogInitializer.Companion Companion = new com.paypal.oslo.core.telemetry.vendors.datadog.DatadogInitializer.Companion(null);

    @Override // androidx.startup.Initializer
    public final /* bridge */ /* synthetic */ kotlin.Unit create(android.content.Context context) {
        create2(context);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/datadog/DatadogInitializer$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: create, reason: avoid collision after fix types in other method */
    public final void create2(android.content.Context context) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (com.paypal.oslo.core.telemetry.util.AndroidContextExtensionsKt.isRunningFromTestProcess(context)) {
            return;
        }
        java.lang.Object obj = dagger.hilt.android.EarlyEntryPoints.get(context.getApplicationContext(), com.paypal.oslo.core.telemetry.di.TelemetryEntryPoint.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        com.paypal.oslo.core.telemetry.di.TelemetryEntryPoint telemetryEntryPoint = (com.paypal.oslo.core.telemetry.di.TelemetryEntryPoint) obj;
        com.paypal.oslo.core.appidentity.domain.AppIdentity appIdentity = telemetryEntryPoint.appIdentity();
        com.paypal.oslo.core.userstore.UserStore userStore = telemetryEntryPoint.userStore();
        com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider telemetryFeatureGateProvider = telemetryEntryPoint.telemetryFeatureGateProvider();
        kotlinx.coroutines.CoroutineScope ioApplicationScope = telemetryEntryPoint.ioApplicationScope();
        java.lang.String buildType = com.paypal.oslo.core.telemetry.util.AndroidContextExtensionsKt.getBuildType(context);
        com.paypal.oslo.core.telemetry.config.TelemetryEnvironmentType environmentType = telemetryEntryPoint.telemetryEnvironmentProvider().getEnvironmentType();
        com.datadog.android.privacy.TrackingConsent trackingConsent = com.datadog.android.privacy.TrackingConsent.GRANTED;
        int i = com.paypal.oslo.core.telemetry.vendors.datadog.DatadogInitializer.WhenMappings.$EnumSwitchMapping$0[environmentType.ordinal()];
        if (i == 1) {
            str = com.paypal.oslo.core.telemetry.BuildConfig.DATADOG_CLIENT_TOKEN_PROD;
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            str = com.paypal.oslo.core.telemetry.BuildConfig.DATADOG_CLIENT_TOKEN_QA;
        }
        com.datadog.android.core.configuration.Configuration build = new com.datadog.android.core.configuration.Configuration.Builder(str, environmentType.getValue(), buildType, null, 8, null).useSite(com.datadog.android.DatadogSite.US5).setUseDeveloperModeWhenDebuggable(true).setVersion(appIdentity.getAppVersion()).build();
        com.paypal.oslo.core.appidentity.domain.DistributionChannelType distributionChannel = appIdentity.getDistributionChannel();
        com.datadog.android.Datadog.initialize(context, build, trackingConsent);
        java.lang.String value = distributionChannel.getValue();
        int i2 = com.paypal.oslo.core.telemetry.vendors.datadog.DatadogInitializer.WhenMappings.$EnumSwitchMapping$0[environmentType.ordinal()];
        if (i2 == 1) {
            str2 = com.paypal.oslo.core.telemetry.BuildConfig.DATADOG_APPLICATION_ID_PROD;
        } else {
            if (i2 != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            str2 = com.paypal.oslo.core.telemetry.BuildConfig.DATADOG_APPLICATION_ID_QA;
        }
        com.datadog.android.rum.Rum.enable$default(com.datadog.android.rum.RumConfiguration.Builder.trackUserInteractions$default(com.datadog.android.compose.RumConfigurationExtKt.enableComposeActionTracking(new com.datadog.android.rum.RumConfiguration.Builder(str2)), null, null, 3, null).trackLongTasks(200L).setSessionSampleRate(100.0f).useViewTrackingStrategy(null).build(), null, 2, null);
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            com.datadog.android.profiling.Profiling.enable$default(new com.datadog.android.profiling.ProfilingConfiguration.Builder().setApplicationLaunchSampleRate(100.0f).build(), null, 2, null);
        }
        com.datadog.android.rum.RumMonitor.DefaultImpls.startView$default(com.datadog.android.rum.GlobalRumMonitor.get$default(null, 1, null), "Application", "_dd_application_launch", null, 4, null);
        com.datadog.android.rum.RumMonitor rumMonitor = com.datadog.android.rum.GlobalRumMonitor.get$default(null, 1, null);
        rumMonitor.addAttribute(com.paypal.oslo.core.telemetry.vendors.datadog.DatadogAttributes.APP_GUID, appIdentity.getAppGUID());
        rumMonitor.addAttribute("device_id", appIdentity.getAndroidId());
        rumMonitor.addAttribute(com.paypal.oslo.core.telemetry.vendors.datadog.DatadogAttributes.DISTRIBUTION_CHANNEL, value);
        com.datadog.android.trace.Trace.enable$default(new com.datadog.android.trace.TraceConfiguration.Builder().build(), null, 2, null);
        if (!com.datadog.android.trace.GlobalDatadogTracer.registerIfAbsent(com.datadog.android.trace.DatadogTracing.newTracerBuilder$default(null, 1, null).build())) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "GlobalDatadogTracer already registered, skipping", null, null, 6, null);
        }
        if (telemetryFeatureGateProvider.isDatadogSessionReplayEnabled()) {
            com.datadog.android.sessionreplay.SessionReplay.enable$default(new com.datadog.android.sessionreplay.SessionReplayConfiguration.Builder(100.0f).setTouchPrivacy(com.datadog.android.sessionreplay.TouchPrivacy.SHOW).build(), null, 2, null);
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(ioApplicationScope, null, null, new com.paypal.oslo.core.telemetry.vendors.datadog.DatadogInitializer$create$1(userStore, this, null), 3, null);
    }

    @Override // androidx.startup.Initializer
    public final java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> dependencies() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    public static final /* synthetic */ void access$setupDatadogUserInfo(com.paypal.oslo.core.telemetry.vendors.datadog.DatadogInitializer datadogInitializer, com.paypal.oslo.core.userstore.model.UserState userState) {
        if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.LoggedOut) {
            com.datadog.android.Datadog.clearUserInfo$default(null, 1, null);
        } else if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
            com.paypal.oslo.core.userstore.model.User user = ((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) userState).getUser();
            com.datadog.android.Datadog.setUserInfo$default(user.getId(), null, null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.core.telemetry.vendors.datadog.DatadogAttributes.ACCOUNT_INFO, user.getAccountType()), kotlin.TuplesKt.to(com.paypal.oslo.core.telemetry.vendors.datadog.DatadogAttributes.ACCOUNT_COUNTRY_CODE, user.getAccountCountryCode())), null, 22, null);
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.core.telemetry.config.TelemetryEnvironmentType.values().length];
            try {
                iArr[com.paypal.oslo.core.telemetry.config.TelemetryEnvironmentType.PROD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.core.telemetry.config.TelemetryEnvironmentType.STAGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
