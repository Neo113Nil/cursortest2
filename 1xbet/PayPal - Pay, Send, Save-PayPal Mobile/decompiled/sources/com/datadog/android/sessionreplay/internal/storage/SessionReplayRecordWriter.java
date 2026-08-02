package com.datadog.android.sessionreplay.internal.storage;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/storage/SessionReplayRecordWriter;", "Lcom/datadog/android/sessionreplay/internal/storage/RecordWriter;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "Lcom/datadog/android/sessionreplay/internal/RecordCallback;", "recordCallback", "<init>", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Lcom/datadog/android/sessionreplay/internal/RecordCallback;)V", "Lcom/datadog/android/sessionreplay/internal/processor/EnrichedRecord;", "record", "", "write", "(Lcom/datadog/android/sessionreplay/internal/processor/EnrichedRecord;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/sessionreplay/internal/RecordCallback;", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SessionReplayRecordWriter implements com.datadog.android.sessionreplay.internal.storage.RecordWriter {
    private final com.datadog.android.sessionreplay.internal.RecordCallback getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.api.feature.FeatureSdkCore Camera2StreamConfigurationMap;

    public SessionReplayRecordWriter(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, com.datadog.android.sessionreplay.internal.RecordCallback recordCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordCallback, "");
        this.Camera2StreamConfigurationMap = featureSdkCore;
        this.getHighResolutionOutputSizeshNQ4ISI = recordCallback;
    }

    @Override // com.datadog.android.sessionreplay.internal.storage.RecordWriter
    public final void write(final com.datadog.android.sessionreplay.internal.processor.EnrichedRecord record) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(record, "");
        com.datadog.android.api.feature.FeatureScope feature = this.Camera2StreamConfigurationMap.getFeature("session-replay");
        if (feature != null) {
            com.datadog.android.api.feature.FeatureScope.DefaultImpls.withWriteContext$default(feature, null, new kotlin.jvm.functions.Function2<com.datadog.android.api.context.DatadogContext, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, ? extends kotlin.Unit>, ? extends kotlin.Unit>, kotlin.Unit>() { // from class: com.datadog.android.sessionreplay.internal.storage.SessionReplayRecordWriter$write$1
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.api.context.DatadogContext datadogContext, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, ? extends kotlin.Unit>, ? extends kotlin.Unit> function1) {
                    getHighSpeedVideoFpsRanges(datadogContext, function1);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoFpsRanges(com.datadog.android.api.context.DatadogContext datadogContext, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit> function1) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogContext, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
                    final com.datadog.android.sessionreplay.internal.processor.EnrichedRecord enrichedRecord = com.datadog.android.sessionreplay.internal.processor.EnrichedRecord.this;
                    final com.datadog.android.sessionreplay.internal.storage.SessionReplayRecordWriter sessionReplayRecordWriter = this;
                    function1.invoke(new kotlin.jvm.functions.Function1<com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>() { // from class: com.datadog.android.sessionreplay.internal.storage.SessionReplayRecordWriter$write$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.api.storage.EventBatchWriter eventBatchWriter) {
                            getHighSpeedVideoFpsRanges(eventBatchWriter);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void getHighSpeedVideoFpsRanges(com.datadog.android.api.storage.EventBatchWriter eventBatchWriter) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventBatchWriter, "");
                            byte[] bytes = com.datadog.android.sessionreplay.internal.processor.EnrichedRecord.this.toJson().getBytes(kotlin.text.Charsets.UTF_8);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
                            com.datadog.android.api.storage.RawBatchEvent rawBatchEvent = new com.datadog.android.api.storage.RawBatchEvent(bytes, null, 2, null);
                            com.datadog.android.sessionreplay.internal.storage.SessionReplayRecordWriter sessionReplayRecordWriter2 = sessionReplayRecordWriter;
                            com.datadog.android.sessionreplay.internal.processor.EnrichedRecord enrichedRecord2 = com.datadog.android.sessionreplay.internal.processor.EnrichedRecord.this;
                            synchronized (sessionReplayRecordWriter2) {
                                if (eventBatchWriter.write(rawBatchEvent, null, com.datadog.android.api.storage.EventType.DEFAULT)) {
                                    sessionReplayRecordWriter2.getHighResolutionOutputSizeshNQ4ISI.onRecordForViewSent(enrichedRecord2);
                                }
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
            }, 1, null);
        }
    }
}
