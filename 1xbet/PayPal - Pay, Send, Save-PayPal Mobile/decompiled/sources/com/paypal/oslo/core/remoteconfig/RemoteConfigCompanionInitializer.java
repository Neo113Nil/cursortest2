package com.paypal.oslo.core.remoteconfig;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u00060\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/RemoteConfigCompanionInitializer;", "Landroidx/startup/Initializer;", "", "<init>", "()V", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "Landroid/content/Context;", "context", "create", "(Landroid/content/Context;)V", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RemoteConfigCompanionInitializer implements androidx.startup.Initializer<kotlin.Unit> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes = com.paypal.oslo.core.remoteconfig.BuildConfig.STATSIG_CLIENT_SDK_KEY;

    @Override // androidx.startup.Initializer
    public final /* bridge */ /* synthetic */ kotlin.Unit create(android.content.Context context) {
        create2(context);
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.startup.Initializer
    public final java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> dependencies() {
        return kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.core.remoteconfig.RemoteConfigInitializer.class);
    }

    /* renamed from: create, reason: avoid collision after fix types in other method */
    public final void create2(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.content.Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(applicationContext, "");
        android.app.Application application = (android.app.Application) applicationContext;
        java.lang.String str = this.getHighSpeedVideoSizes;
        java.lang.Object obj = dagger.hilt.android.EarlyEntryPoints.get(application, com.paypal.oslo.core.remoteconfig.di.RemoteConfigInitializerEntryPoint.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        com.paypal.oslo.core.remoteconfig.di.RemoteConfigInitializerEntryPoint remoteConfigInitializerEntryPoint = (com.paypal.oslo.core.remoteconfig.di.RemoteConfigInitializerEntryPoint) obj;
        com.paypal.oslo.core.remoteconfig.StatsigWrapper statsigWrapper = remoteConfigInitializerEntryPoint.getStatsigWrapper();
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(remoteConfigInitializerEntryPoint.ioApplicationScope(), null, null, new com.paypal.oslo.core.remoteconfig.RemoteConfigCompanionInitializer$init$1(remoteConfigInitializerEntryPoint.getRemoteConfigConfig(), statsigWrapper, application, str, statsigWrapper.getUserFromInitialization(), this, null), 3, null);
    }

    public static final /* synthetic */ void access$initializeCdnAutoRegistration(com.paypal.oslo.core.remoteconfig.RemoteConfigCompanionInitializer remoteConfigCompanionInitializer, android.app.Application application) {
        try {
            java.lang.Object obj = dagger.hilt.android.EarlyEntryPoints.get(application, com.paypal.oslo.core.remoteconfig.di.RemoteConfigInitializerEntryPoint.class);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            com.paypal.oslo.core.remoteconfig.di.RemoteConfigInitializerEntryPoint remoteConfigInitializerEntryPoint = (com.paypal.oslo.core.remoteconfig.di.RemoteConfigInitializerEntryPoint) obj;
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(remoteConfigInitializerEntryPoint.ioApplicationScope(), null, null, new com.paypal.oslo.core.remoteconfig.RemoteConfigCompanionInitializer$initializeCdnAutoRegistration$1(remoteConfigInitializerEntryPoint, null), 3, null);
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "Skipping CDN auto-registration", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", "Hilt not available (likely in test environment)"), kotlin.TuplesKt.to("error", e.toString())), null, 4, null);
        }
    }
}
