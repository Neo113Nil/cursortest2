package com.datadog.android.sessionreplay.internal.storage;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/storage/SessionReplayResourcesWriter;", "Lcom/datadog/android/sessionreplay/internal/storage/ResourcesWriter;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "<init>", "(Lcom/datadog/android/api/feature/FeatureSdkCore;)V", "Lcom/datadog/android/sessionreplay/internal/processor/EnrichedResource;", "enrichedResource", "", "write", "(Lcom/datadog/android/sessionreplay/internal/processor/EnrichedResource;)V", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SessionReplayResourcesWriter implements com.datadog.android.sessionreplay.internal.storage.ResourcesWriter {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.api.feature.FeatureSdkCore getHighSpeedVideoSizes;

    public SessionReplayResourcesWriter(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
        this.getHighSpeedVideoSizes = featureSdkCore;
    }

    @Override // com.datadog.android.sessionreplay.internal.storage.ResourcesWriter
    public final void write(final com.datadog.android.sessionreplay.internal.processor.EnrichedResource enrichedResource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enrichedResource, "");
        com.datadog.android.api.feature.FeatureScope feature = this.getHighSpeedVideoSizes.getFeature("session-replay-resources");
        if (feature != null) {
            feature.withWriteContext(kotlin.collections.SetsKt.setOf("rum"), new kotlin.jvm.functions.Function2<com.datadog.android.api.context.DatadogContext, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, ? extends kotlin.Unit>, ? extends kotlin.Unit>, kotlin.Unit>() { // from class: com.datadog.android.sessionreplay.internal.storage.SessionReplayResourcesWriter$write$1
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.api.context.DatadogContext datadogContext, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, ? extends kotlin.Unit>, ? extends kotlin.Unit> function1) {
                    Camera2StreamConfigurationMap(datadogContext, function1);
                    return kotlin.Unit.INSTANCE;
                }

                public final void Camera2StreamConfigurationMap(final com.datadog.android.api.context.DatadogContext datadogContext, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit> function1) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogContext, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
                    final com.datadog.android.sessionreplay.internal.storage.SessionReplayResourcesWriter sessionReplayResourcesWriter = com.datadog.android.sessionreplay.internal.storage.SessionReplayResourcesWriter.this;
                    final com.datadog.android.sessionreplay.internal.processor.EnrichedResource enrichedResource2 = enrichedResource;
                    function1.invoke(new kotlin.jvm.functions.Function1<com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>() { // from class: com.datadog.android.sessionreplay.internal.storage.SessionReplayResourcesWriter$write$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.api.storage.EventBatchWriter eventBatchWriter) {
                            getHighResolutionOutputSizeshNQ4ISI(eventBatchWriter);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void getHighResolutionOutputSizeshNQ4ISI(com.datadog.android.api.storage.EventBatchWriter eventBatchWriter) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventBatchWriter, "");
                            com.datadog.android.sessionreplay.internal.storage.SessionReplayResourcesWriter sessionReplayResourcesWriter2 = com.datadog.android.sessionreplay.internal.storage.SessionReplayResourcesWriter.this;
                            com.datadog.android.sessionreplay.internal.processor.EnrichedResource enrichedResource3 = enrichedResource2;
                            com.datadog.android.api.context.DatadogContext datadogContext2 = datadogContext;
                            synchronized (sessionReplayResourcesWriter2) {
                                eventBatchWriter.write(new com.datadog.android.api.storage.RawBatchEvent(enrichedResource3.getResource$dd_sdk_android_session_replay_release(), com.datadog.android.sessionreplay.internal.processor.EnrichedResourceKt.asBinaryMetadata(enrichedResource3, com.datadog.android.sessionreplay.internal.storage.SessionReplayResourcesWriter.access$getRumApplicationId(sessionReplayResourcesWriter2, datadogContext2))), null, com.datadog.android.api.storage.EventType.DEFAULT);
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
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
            });
        }
    }

    public static final /* synthetic */ java.lang.String access$getRumApplicationId(com.datadog.android.sessionreplay.internal.storage.SessionReplayResourcesWriter sessionReplayResourcesWriter, com.datadog.android.api.context.DatadogContext datadogContext) {
        java.util.Map<java.lang.String, java.lang.Object> map = datadogContext.getFeaturesContext().get("rum");
        java.lang.Object obj = map != null ? map.get("application_id") : null;
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        return str == null ? "" : str;
    }
}
