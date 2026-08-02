package com.zettle.o11y.android.core;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0003R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0013\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001b\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0006"}, d2 = {"Lcom/zettle/o11y/android/core/O11YDataDogManager;", "Lcom/zettle/o11y/android/core/O11YDataDogManagerInterface;", "<init>", "()V", "Lcom/zettle/o11y/android/core/customtracker/O11YCustomAttributeTrackingManager;", "getDDCustomAttributeTrackingManager", "()Lcom/zettle/o11y/android/core/customtracker/O11YCustomAttributeTrackingManager;", "Lokhttp3/Interceptor;", "getDDOkHttpInterceptor", "()Lokhttp3/Interceptor;", "Landroid/content/Context;", "context", "Lcom/zettle/o11y/android/core/configuration/O11YConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "", "startObservability", "(Landroid/content/Context;Lcom/zettle/o11y/android/core/configuration/O11YConfiguration;)V", "stopObservability", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lcom/zettle/o11y/android/core/configuration/O11YConfiguration;", "o11yCustomAttributeTrackingManager$delegate", "Lkotlin/Lazy;", "getO11yCustomAttributeTrackingManager", "o11yCustomAttributeTrackingManager"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class O11YDataDogManager implements com.zettle.o11y.android.core.O11YDataDogManagerInterface {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.lang.String Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private com.zettle.o11y.android.core.configuration.O11YConfiguration getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: o11yCustomAttributeTrackingManager$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy o11yCustomAttributeTrackingManager = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.zettle.o11y.android.core.customtracker.O11YCustomAttributeTrackingManager>() { // from class: com.zettle.o11y.android.core.O11YDataDogManager$o11yCustomAttributeTrackingManager$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
        public final com.zettle.o11y.android.core.customtracker.O11YCustomAttributeTrackingManager invoke() {
            com.datadog.android.api.SdkCore datadog;
            datadog = com.datadog.android.Datadog.getInstance(com.zettle.o11y.android.core.O11YDataDogManager.this.Camera2StreamConfigurationMap);
            return new com.zettle.o11y.android.core.customtracker.O11YCustomAttributeTrackingManager(datadog);
        }

        {
            super(0);
        }
    });

    public final com.zettle.o11y.android.core.customtracker.O11YCustomAttributeTrackingManager getO11yCustomAttributeTrackingManager() {
        return (com.zettle.o11y.android.core.customtracker.O11YCustomAttributeTrackingManager) this.o11yCustomAttributeTrackingManager.getValue();
    }

    @Override // com.zettle.o11y.android.core.O11YDataDogManagerInterface
    public final void startObservability(android.content.Context context, com.zettle.o11y.android.core.configuration.O11YConfiguration configuration) {
        com.datadog.android.api.SdkCore initialize;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        this.Camera2StreamConfigurationMap = configuration.getInstanceName();
        this.getHighResolutionOutputSizeshNQ4ISI = configuration;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        com.datadog.android.core.configuration.Configuration build = new com.datadog.android.core.configuration.Configuration.Builder(configuration.getClientToken(), configuration.getEnvironment().getEnvName(), configuration.getAppVariantName(), null, 8, defaultConstructorMarker).useSite(com.datadog.android.DatadogSite.EU1).setFirstPartyHosts(configuration.getTracedHosts()).build();
        com.datadog.android.rum.RumConfiguration build2 = com.datadog.android.rum.RumConfiguration.Builder.trackLongTasks$default(com.datadog.android.rum.RumConfiguration.Builder.trackUserInteractions$default(new com.datadog.android.rum.RumConfiguration.Builder(configuration.getApplicationId()), null, null, 3, null), 0L, 1, null).trackNonFatalAnrs(true).trackBackgroundEvents(false).setActionEventMapper(new com.zettle.o11y.android.core.O11YDataDogManager$sam$com_datadog_android_event_EventMapper$0(configuration.actionEventMapper$core_release())).setErrorEventMapper(new com.zettle.o11y.android.core.O11YDataDogManager$sam$com_datadog_android_event_EventMapper$0(configuration.errorEventMapper$core_release())).useViewTrackingStrategy(new com.datadog.android.rum.tracking.MixedViewTrackingStrategy(true, null, null, null, 14, defaultConstructorMarker)).build();
        if (com.datadog.android.Datadog.isInitialized(this.Camera2StreamConfigurationMap) || (initialize = com.datadog.android.Datadog.initialize(this.Camera2StreamConfigurationMap, context, build, com.datadog.android.privacy.TrackingConsent.GRANTED)) == null) {
            return;
        }
        com.datadog.android.rum.Rum.enable(build2, initialize);
    }

    @Override // com.zettle.o11y.android.core.O11YDataDogManagerInterface
    public final void stopObservability() {
        com.datadog.android.Datadog.stopInstance(this.Camera2StreamConfigurationMap);
    }

    @Override // com.zettle.o11y.android.core.O11YDataDogManagerInterface
    public final okhttp3.Interceptor getDDOkHttpInterceptor() {
        com.zettle.o11y.android.core.configuration.O11YConfiguration o11YConfiguration = this.getHighResolutionOutputSizeshNQ4ISI;
        if (o11YConfiguration == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            o11YConfiguration = null;
        }
        com.datadog.android.okhttp.DatadogInterceptor.Builder builder = new com.datadog.android.okhttp.DatadogInterceptor.Builder(o11YConfiguration.getTracedHosts());
        java.lang.String str = this.Camera2StreamConfigurationMap;
        return builder.setSdkInstanceName(str != null ? str : "").build();
    }

    @Override // com.zettle.o11y.android.core.O11YDataDogManagerInterface
    public final com.zettle.o11y.android.core.customtracker.O11YCustomAttributeTrackingManager getDDCustomAttributeTrackingManager() {
        return getO11yCustomAttributeTrackingManager();
    }
}
