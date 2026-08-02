package com.datadog.android.profiling.internal;

@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 92\u00020\u00012\u00020\u0002:\u00019B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0017\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010 R\u0014\u0010$\u001a\u00020!8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0018\u0010\u0019\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010&R\u0014\u0010)\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010+\u001a\u00020*8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0018\u00108\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u00107"}, d2 = {"Lcom/datadog/android/profiling/internal/ProfilingFeature;", "Lcom/datadog/android/api/feature/StorageBackedFeature;", "Lcom/datadog/android/api/feature/FeatureEventReceiver;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "Lcom/datadog/android/profiling/ProfilingConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lcom/datadog/android/profiling/internal/Profiler;", "profiler", "<init>", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Lcom/datadog/android/profiling/ProfilingConfiguration;Lcom/datadog/android/profiling/internal/Profiler;)V", "Landroid/content/Context;", "appContext", "", "onInitialize", "(Landroid/content/Context;)V", "", "event", "onReceive", "(Ljava/lang/Object;)V", "onStop", "()V", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Landroid/content/Context;", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/profiling/ProfilingConfiguration;", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/profiling/internal/ProfilingWriter;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/profiling/internal/ProfilingWriter;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "", "getName", "()Ljava/lang/String;", "name", "Lcom/datadog/android/profiling/internal/perfetto/PerfettoResult;", "Lcom/datadog/android/profiling/internal/perfetto/PerfettoResult;", "getInputSizeshNQ4ISI", "Lcom/datadog/android/profiling/internal/Profiler;", "getInputFormats", "Lcom/datadog/android/api/net/RequestFactory;", "requestFactory", "Lcom/datadog/android/api/net/RequestFactory;", "getRequestFactory", "()Lcom/datadog/android/api/net/RequestFactory;", "getOutputFormats", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "getHighSpeedVideoSizesFor", "Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "getStorageConfiguration", "()Lcom/datadog/android/api/storage/FeatureStorageConfiguration;", "storageConfiguration", "Lcom/datadog/android/internal/profiling/TTIDRumContext;", "Lcom/datadog/android/internal/profiling/TTIDRumContext;", "getOutputMinFrameDuration", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProfilingFeature implements com.datadog.android.api.feature.StorageBackedFeature, com.datadog.android.api.feature.FeatureEventReceiver {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private volatile com.datadog.android.profiling.internal.perfetto.PerfettoResult getHighSpeedVideoFpsRangesFor;
    private com.datadog.android.profiling.internal.ProfilingWriter getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.profiling.ProfilingConfiguration getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private android.content.Context Camera2StreamConfigurationMap;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private volatile com.datadog.android.internal.profiling.TTIDRumContext getOutputMinFrameDuration;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.profiling.internal.Profiler getInputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.datadog.android.api.feature.FeatureSdkCore getHighSpeedVideoSizesFor;
    private final com.datadog.android.api.net.RequestFactory requestFactory;

    public ProfilingFeature(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, com.datadog.android.profiling.ProfilingConfiguration profilingConfiguration, com.datadog.android.profiling.internal.Profiler profiler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profilingConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profiler, "");
        this.getHighSpeedVideoSizesFor = featureSdkCore;
        this.getHighSpeedVideoFpsRanges = profilingConfiguration;
        this.getInputFormats = profiler;
        this.getHighResolutionOutputSizeshNQ4ISI = new com.datadog.android.profiling.internal.NoOpProfilingWriter();
        this.getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.requestFactory = new com.datadog.android.profiling.internal.ProfilingRequestFactory(profilingConfiguration.getCustomEndpointUrl$dd_sdk_android_profiling_release());
    }

    @Override // com.datadog.android.api.feature.StorageBackedFeature
    public final com.datadog.android.api.net.RequestFactory getRequestFactory() {
        return this.requestFactory;
    }

    @Override // com.datadog.android.api.feature.StorageBackedFeature
    public final com.datadog.android.api.storage.FeatureStorageConfiguration getStorageConfiguration() {
        return com.datadog.android.api.storage.FeatureStorageConfiguration.INSTANCE.getDEFAULT();
    }

    @Override // com.datadog.android.api.feature.Feature
    public final java.lang.String getName() {
        return "profiling";
    }

    @Override // com.datadog.android.api.feature.Feature
    public final void onInitialize(android.content.Context appContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "");
        this.Camera2StreamConfigurationMap = appContext;
        com.datadog.android.profiling.internal.Profiler profiler = this.getInputFormats;
        profiler.setInternalLogger(this.getHighSpeedVideoSizesFor.getInternalLogger());
        profiler.registerProfilingCallback(this.getHighSpeedVideoSizesFor.getName(), new com.datadog.android.profiling.internal.ProfilerCallback() { // from class: com.datadog.android.profiling.internal.ProfilingFeature$$ExternalSyntheticLambda0
            @Override // com.datadog.android.profiling.internal.ProfilerCallback
            public final void onSuccess(com.datadog.android.profiling.internal.perfetto.PerfettoResult perfettoResult) {
                com.datadog.android.profiling.internal.ProfilingFeature.m10018$r8$lambda$VI1owsRnvZZWzDdPsA2hyoDss(com.datadog.android.profiling.internal.ProfilingFeature.this, perfettoResult);
            }
        });
        float sampleRate$dd_sdk_android_profiling_release = this.getHighSpeedVideoFpsRanges.getSampleRate$dd_sdk_android_profiling_release();
        float sampleRate$dd_sdk_android_profiling_release2 = com.datadog.android.profiling.internal.ProfilingStorage.INSTANCE.getSampleRate$dd_sdk_android_profiling_release(appContext);
        if (0.0f > sampleRate$dd_sdk_android_profiling_release2 || sampleRate$dd_sdk_android_profiling_release2 > sampleRate$dd_sdk_android_profiling_release) {
            com.datadog.android.profiling.internal.ProfilingStorage.INSTANCE.setSampleRate$dd_sdk_android_profiling_release(appContext, this.getHighSpeedVideoFpsRanges.getSampleRate$dd_sdk_android_profiling_release());
        }
        com.datadog.android.profiling.internal.ProfilingStorage.addProfilingFlag$dd_sdk_android_profiling_release(appContext, this.getHighSpeedVideoSizesFor.getName());
        this.getHighSpeedVideoSizesFor.setEventReceiver(getName(), this);
        com.datadog.android.api.feature.FeatureSdkCore.DefaultImpls.updateFeatureContext$default(this.getHighSpeedVideoSizesFor, "profiling", false, new kotlin.jvm.functions.Function1<java.util.Map<java.lang.String, java.lang.Object>, kotlin.Unit>() { // from class: com.datadog.android.profiling.internal.ProfilingFeature$onInitialize$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.util.Map<java.lang.String, java.lang.Object> map) {
                getHighSpeedVideoSizes(map);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoSizes(java.util.Map<java.lang.String, java.lang.Object> map) {
                com.datadog.android.profiling.internal.Profiler profiler2;
                com.datadog.android.api.feature.FeatureSdkCore featureSdkCore;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
                profiler2 = com.datadog.android.profiling.internal.ProfilingFeature.this.getInputFormats;
                featureSdkCore = com.datadog.android.profiling.internal.ProfilingFeature.this.getHighSpeedVideoSizesFor;
                map.put("profiler_is_running", java.lang.Boolean.valueOf(profiler2.isRunning(featureSdkCore.getName())));
            }

            {
                super(1);
            }
        }, 2, null);
        this.getHighResolutionOutputSizeshNQ4ISI = new com.datadog.android.profiling.internal.ProfilingDataWriter(this.getHighSpeedVideoSizesFor);
    }

    @Override // com.datadog.android.api.feature.Feature
    public final void onStop() {
        com.datadog.android.profiling.internal.Profiler profiler = this.getInputFormats;
        profiler.stop(this.getHighSpeedVideoSizesFor.getName());
        profiler.unregisterProfilingCallback(this.getHighSpeedVideoSizesFor.getName());
        this.getHighSpeedVideoSizesFor.removeEventReceiver(getName());
    }

    @Override // com.datadog.android.api.feature.FeatureEventReceiver
    public final void onReceive(final java.lang.Object event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(event instanceof com.datadog.android.internal.profiling.ProfilerStopEvent.TTID)) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoSizesFor.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.profiling.internal.ProfilingFeature$onReceive$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, "Profiling feature received an event of unsupported type=%s.", java.util.Arrays.copyOf(new java.lang.Object[]{event.getClass().getCanonicalName()}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        } else if (this.getOutputMinFrameDuration == null) {
            this.getOutputMinFrameDuration = ((com.datadog.android.internal.profiling.ProfilerStopEvent.TTID) event).getRumContext();
            this.getInputFormats.stop(this.getHighSpeedVideoSizesFor.getName());
            Camera2StreamConfigurationMap();
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoSizesFor.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.profiling.internal.ProfilingFeature$onReceive$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Profiling stopped with TTID reason";
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        }
    }

    private final void Camera2StreamConfigurationMap() {
        com.datadog.android.internal.profiling.TTIDRumContext tTIDRumContext;
        com.datadog.android.profiling.internal.perfetto.PerfettoResult perfettoResult = this.getHighSpeedVideoFpsRangesFor;
        if (perfettoResult == null || (tTIDRumContext = this.getOutputMinFrameDuration) == null || !kotlin.jvm.internal.Intrinsics.areEqual(perfettoResult.getTag(), com.datadog.android.profiling.internal.ProfilingStartReason.APPLICATION_LAUNCH.getValue()) || this.getHighSpeedVideoSizes.getAndSet(true)) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.write(perfettoResult, tTIDRumContext);
    }

    /* renamed from: $r8$lambda$VI1-ows-RnvZZWzDdPsA2hyoDss, reason: not valid java name */
    public static /* synthetic */ void m10018$r8$lambda$VI1owsRnvZZWzDdPsA2hyoDss(final com.datadog.android.profiling.internal.ProfilingFeature profilingFeature, com.datadog.android.profiling.internal.perfetto.PerfettoResult perfettoResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(perfettoResult, "");
        profilingFeature.getHighSpeedVideoFpsRangesFor = perfettoResult;
        profilingFeature.Camera2StreamConfigurationMap();
        com.datadog.android.api.feature.FeatureSdkCore.DefaultImpls.updateFeatureContext$default(profilingFeature.getHighSpeedVideoSizesFor, "profiling", false, new kotlin.jvm.functions.Function1<java.util.Map<java.lang.String, java.lang.Object>, kotlin.Unit>() { // from class: com.datadog.android.profiling.internal.ProfilingFeature$onInitialize$1$1$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.util.Map<java.lang.String, java.lang.Object> map) {
                getHighSpeedVideoFpsRangesFor(map);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRangesFor(java.util.Map<java.lang.String, java.lang.Object> map) {
                com.datadog.android.profiling.internal.Profiler profiler;
                com.datadog.android.api.feature.FeatureSdkCore featureSdkCore;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
                profiler = com.datadog.android.profiling.internal.ProfilingFeature.this.getInputFormats;
                featureSdkCore = com.datadog.android.profiling.internal.ProfilingFeature.this.getHighSpeedVideoSizesFor;
                map.put("profiler_is_running", java.lang.Boolean.valueOf(profiler.isRunning(featureSdkCore.getName())));
            }

            {
                super(1);
            }
        }, 2, null);
    }
}
