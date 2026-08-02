package com.datadog.android.profiling.internal;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/datadog/android/profiling/internal/ProfilingDataWriter;", "Lcom/datadog/android/profiling/internal/ProfilingWriter;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "<init>", "(Lcom/datadog/android/api/feature/FeatureSdkCore;)V", "Lcom/datadog/android/profiling/internal/perfetto/PerfettoResult;", "profilingResult", "Lcom/datadog/android/internal/profiling/TTIDRumContext;", "ttidRumContext", "", "write", "(Lcom/datadog/android/profiling/internal/perfetto/PerfettoResult;Lcom/datadog/android/internal/profiling/TTIDRumContext;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProfilingDataWriter implements com.datadog.android.profiling.internal.ProfilingWriter {
    private final com.datadog.android.api.feature.FeatureSdkCore getHighSpeedVideoFpsRangesFor;

    public ProfilingDataWriter(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
        this.getHighSpeedVideoFpsRangesFor = featureSdkCore;
    }

    @Override // com.datadog.android.profiling.internal.ProfilingWriter
    public final void write(final com.datadog.android.profiling.internal.perfetto.PerfettoResult profilingResult, final com.datadog.android.internal.profiling.TTIDRumContext ttidRumContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profilingResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ttidRumContext, "");
        com.datadog.android.api.feature.FeatureScope feature = this.getHighSpeedVideoFpsRangesFor.getFeature("profiling");
        if (feature != null) {
            com.datadog.android.api.feature.FeatureScope.DefaultImpls.withWriteContext$default(feature, null, new kotlin.jvm.functions.Function2<com.datadog.android.api.context.DatadogContext, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, ? extends kotlin.Unit>, ? extends kotlin.Unit>, kotlin.Unit>() { // from class: com.datadog.android.profiling.internal.ProfilingDataWriter$write$1
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.api.context.DatadogContext datadogContext, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, ? extends kotlin.Unit>, ? extends kotlin.Unit> function1) {
                    getHighSpeedVideoSizes(datadogContext, function1);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoSizes(final com.datadog.android.api.context.DatadogContext datadogContext, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit> function1) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogContext, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
                    final com.datadog.android.profiling.internal.ProfilingDataWriter profilingDataWriter = com.datadog.android.profiling.internal.ProfilingDataWriter.this;
                    final com.datadog.android.profiling.internal.perfetto.PerfettoResult perfettoResult = profilingResult;
                    final com.datadog.android.internal.profiling.TTIDRumContext tTIDRumContext = ttidRumContext;
                    function1.invoke(new kotlin.jvm.functions.Function1<com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>() { // from class: com.datadog.android.profiling.internal.ProfilingDataWriter$write$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.api.storage.EventBatchWriter eventBatchWriter) {
                            getHighResolutionOutputSizeshNQ4ISI(eventBatchWriter);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void getHighResolutionOutputSizeshNQ4ISI(com.datadog.android.api.storage.EventBatchWriter eventBatchWriter) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventBatchWriter, "");
                            com.datadog.android.api.storage.RawBatchEvent access$buildRawBatchEvent = com.datadog.android.profiling.internal.ProfilingDataWriter.access$buildRawBatchEvent(com.datadog.android.profiling.internal.ProfilingDataWriter.this, datadogContext, perfettoResult, tTIDRumContext);
                            if (access$buildRawBatchEvent != null) {
                                synchronized (com.datadog.android.profiling.internal.ProfilingDataWriter.this) {
                                    eventBatchWriter.write(access$buildRawBatchEvent, null, com.datadog.android.api.storage.EventType.DEFAULT);
                                }
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    });
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }
            }, 1, null);
        }
    }

    public static final /* synthetic */ com.datadog.android.api.storage.RawBatchEvent access$buildRawBatchEvent(com.datadog.android.profiling.internal.ProfilingDataWriter profilingDataWriter, com.datadog.android.api.context.DatadogContext datadogContext, com.datadog.android.profiling.internal.perfetto.PerfettoResult perfettoResult, com.datadog.android.internal.profiling.TTIDRumContext tTIDRumContext) {
        byte[] readBytesSafe = com.datadog.android.core.internal.persistence.file.FileExtKt.readBytesSafe(new java.io.File(perfettoResult.getResultFilePath()), profilingDataWriter.getHighSpeedVideoFpsRangesFor.getInternalLogger());
        if (readBytesSafe == null || readBytesSafe.length == 0) {
            return null;
        }
        java.lang.String viewId = tTIDRumContext.getViewId();
        java.lang.String viewName = tTIDRumContext.getViewName();
        java.lang.String formatIsoUtc = com.datadog.android.internal.utils.TimeExtKt.formatIsoUtc(perfettoResult.getStart());
        java.lang.String formatIsoUtc2 = com.datadog.android.internal.utils.TimeExtKt.formatIsoUtc(perfettoResult.getEnd());
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf("perfetto.proto");
        com.datadog.android.profiling.model.ProfileEvent.Family family = com.datadog.android.profiling.model.ProfileEvent.Family.ANDROID;
        com.datadog.android.profiling.model.ProfileEvent.Family family2 = com.datadog.android.profiling.model.ProfileEvent.Family.ANDROID;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("service:".concat(java.lang.String.valueOf(datadogContext.getService())));
        sb.append(",");
        sb.append("env:".concat(java.lang.String.valueOf(datadogContext.getEnv())));
        sb.append(",");
        sb.append("version:".concat(java.lang.String.valueOf(datadogContext.getVersion())));
        sb.append(",");
        sb.append("sdk_version:".concat(java.lang.String.valueOf(datadogContext.getSdkVersion())));
        sb.append(",");
        sb.append("profiler_version:".concat(java.lang.String.valueOf(datadogContext.getSdkVersion())));
        sb.append(",");
        sb.append("runtime_version:".concat(java.lang.String.valueOf(datadogContext.getDeviceInfo().getOsVersion())));
        sb.append(",operation:launch");
        java.lang.String appBuildId = datadogContext.getAppBuildId();
        if (appBuildId != null) {
            sb.append(",");
            sb.append("build_id:".concat(java.lang.String.valueOf(appBuildId)));
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        com.datadog.android.profiling.model.ProfileEvent.Application application = new com.datadog.android.profiling.model.ProfileEvent.Application(tTIDRumContext.getApplicationId());
        com.datadog.android.profiling.model.ProfileEvent.Session session = new com.datadog.android.profiling.model.ProfileEvent.Session(tTIDRumContext.getSessionId());
        java.util.List listOf2 = kotlin.collections.CollectionsKt.listOf(tTIDRumContext.getVitalId());
        java.lang.String vitalName = tTIDRumContext.getVitalName();
        if (vitalName == null) {
            vitalName = "";
        }
        java.lang.String obj2 = new com.datadog.android.profiling.model.ProfileEvent(application, session, (viewId == null || viewName == null) ? null : new com.datadog.android.profiling.model.ProfileEvent.View(kotlin.collections.CollectionsKt.listOf(viewId), kotlin.collections.CollectionsKt.listOf(viewName)), null, new com.datadog.android.profiling.model.ProfileEvent.Vital(listOf2, kotlin.collections.CollectionsKt.listOf(vitalName)), listOf, formatIsoUtc, formatIsoUtc2, family, family2, 4L, obj, 8, null).toJson().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        byte[] bytes = obj2.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        return new com.datadog.android.api.storage.RawBatchEvent(bytes, readBytesSafe);
    }
}
