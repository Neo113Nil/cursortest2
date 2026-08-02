package com.paypal.oslo.core.remoteconfig;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0001\u0018\u00010\u00060\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/RemoteConfigInitializer;", "Landroidx/startup/Initializer;", "", "<init>", "()V", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "Landroid/content/Context;", "context", "create", "(Landroid/content/Context;)V", "Landroid/app/Application;", "application", "", "sdkKey", "init$remote_config_release", "(Landroid/app/Application;Ljava/lang/String;)V", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RemoteConfigInitializer implements androidx.startup.Initializer<kotlin.Unit> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor = com.paypal.oslo.core.remoteconfig.BuildConfig.STATSIG_CLIENT_SDK_KEY;

    @Override // androidx.startup.Initializer
    public final /* bridge */ /* synthetic */ kotlin.Unit create(android.content.Context context) {
        create2(context);
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.startup.Initializer
    public final java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> dependencies() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    /* renamed from: create, reason: avoid collision after fix types in other method */
    public final void create2(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (com.paypal.oslo.core.remoteconfig.util.AndroidContextExtensionsKt.isRunningFromTestProcess$default(context, false, 1, null)) {
            return;
        }
        android.content.Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(applicationContext, "");
        init$remote_config_release((android.app.Application) applicationContext, this.getHighSpeedVideoFpsRangesFor);
    }

    public final void init$remote_config_release(android.app.Application application, java.lang.String sdkKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkKey, "");
        long m24028markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m24028markNowz9LOYto();
        java.lang.Object obj = dagger.hilt.android.EarlyEntryPoints.get(application, com.paypal.oslo.core.remoteconfig.di.RemoteConfigInitializerEntryPoint.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        com.paypal.oslo.core.remoteconfig.di.RemoteConfigInitializerEntryPoint remoteConfigInitializerEntryPoint = (com.paypal.oslo.core.remoteconfig.di.RemoteConfigInitializerEntryPoint) obj;
        com.paypal.oslo.core.remoteconfig.StatsigWrapper statsigWrapper = remoteConfigInitializerEntryPoint.getStatsigWrapper();
        com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig remoteConfigConfig = remoteConfigInitializerEntryPoint.getRemoteConfigConfig();
        com.paypal.oslo.core.remoteconfig.internal.RemoteConfigUser userFromInitialization = statsigWrapper.getUserFromInitialization();
        com.paypal.android.logger.Logger logger = com.paypal.oslo.core.remoteconfig.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = kotlin.TuplesKt.to("environment", remoteConfigConfig.getEnvironment().getTier());
        pairArr[1] = kotlin.TuplesKt.to("initial_user_type", userFromInitialization.getId() == null ? "anonymous" : "logged_in");
        com.paypal.android.logger.Logger.i$default(logger, "remote_config_initialization_started", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        statsigWrapper.init(application, sdkKey, remoteConfigConfig.getEnvironment(), (r13 & 8) != 0 ? null : userFromInitialization, (r13 & 16) != 0 ? null : null);
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "remote_config_initialization_before_loading_configs", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("environment", remoteConfigConfig.getEnvironment().getTier()), kotlin.TuplesKt.to("duration_ms", java.lang.Long.valueOf(kotlin.time.Duration.m23953getInWholeMillisecondsimpl(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m24033elapsedNowUwyO8pc(m24028markNowz9LOYto))))), null, 4, null);
        remoteConfigInitializerEntryPoint.getRemoteConfigUserObserver().startObserving();
    }
}
